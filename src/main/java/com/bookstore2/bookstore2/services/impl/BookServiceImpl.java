package com.bookstore2.bookstore2.services.impl;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookstore2.bookstore2.models.Book;
import com.bookstore2.bookstore2.repositories.BookRepo;
import com.bookstore2.bookstore2.services.BookService;

@Service
public class BookServiceImpl implements BookService{

    @Autowired
    private BookRepo bookRepo;

    @Override
    public void addBook(Book book){
        bookRepo.save(book);
    }

    @Override
    public List<Book> bookList() {
        return bookRepo.findAll();
    }

    @Override
    public void deleteById(Long id) {
        bookRepo.deleteById(id);
    }

    @Override
    public Book findById(Long id) {
        return bookRepo.findById(id).orElseThrow();
    }

    @Override
    public void updateBook(Long id, String bookTitle, String bookAuthors, BigDecimal bookPrice) {
        Book bookToUpdate = bookRepo.findById(id).orElse(null);
        if (bookToUpdate != null) {
            bookToUpdate.setBookTitle(bookTitle);
            bookToUpdate.setBookAuthors(bookAuthors);
            bookToUpdate.setBookPrice(bookPrice);
            bookRepo.save(bookToUpdate);
        }
    }
    
}
