package com.bookstore2.bookstore2.controllers;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bookstore2.bookstore2.models.Book;
import com.bookstore2.bookstore2.models.User;
import com.bookstore2.bookstore2.services.BookService;
import com.bookstore2.bookstore2.services.UserService;

@Controller
public class BookController {

    @Autowired
    private BookService bookService;

    @Autowired
    private UserService userService;

    @GetMapping(value = { "/", "/bookstore" })  
    public String books(Model model, Authentication authentication){
        User currentUser = (User)userService.findUserByUsername(authentication.getName());
        model.addAttribute("currentUser", currentUser);
        return "books";
    }

    @GetMapping("/list-books") 
    public String getAllBooks(Model model, Authentication authentication){
        User currentUser = (User)userService.findUserByUsername(authentication.getName());
        model.addAttribute("books", bookService.bookList());
        model.addAttribute("currentUser", currentUser);
        return "list-books";
    }

    @PostMapping("/new-book")
    public String createBook(@RequestParam String bookTitle,
                             @RequestParam String bookAuthors,
                             @RequestParam BigDecimal bookPrice) {
        Book newBook = Book.builder()
                    .bookTitle(bookTitle)
                    .bookAuthors(bookAuthors)
                    .bookPrice(bookPrice)
                    .build();
        bookService.addBook(newBook);
        return "redirect:/list-books";
    }

    @GetMapping("/new-book")
    public String createBook() {
        return "new-book";
    }

    @GetMapping("/delete-book/{id}")
    public String deleteBook(@PathVariable Long id) {
        bookService.deleteById(id);
        return "redirect:/list-books";
    }

    @GetMapping("/edit-book/{id}")
    public String showEditForm(@PathVariable Long id, Model model) {
        Book book = bookService.findById(id);
        model.addAttribute("book", book);
        return "edit-book";
    }

    @PostMapping("/edit-book/{id}")
    public String editBook(@PathVariable Long id, 
                           @RequestParam String bookTitle,
                           @RequestParam String bookAuthors,
                           @RequestParam BigDecimal bookPrice) {
        bookService.updateBook(id, bookTitle, bookAuthors, bookPrice);
        return "redirect:/list-books";
    }
    
}
