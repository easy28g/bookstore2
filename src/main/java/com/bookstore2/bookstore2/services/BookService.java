package com.bookstore2.bookstore2.services;

import java.math.BigDecimal;
import java.util.List;

import com.bookstore2.bookstore2.models.Book;

public interface BookService {

    void addBook(Book book);
    
    List<Book> bookList();
    
    void deleteById(Long id);
    
    Book findById(Long id);

    void updateBook(Long id, String bookTitle, String bookAuthors, BigDecimal bookPrice);

}
