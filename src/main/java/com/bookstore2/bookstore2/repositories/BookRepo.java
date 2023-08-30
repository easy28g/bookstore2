package com.bookstore2.bookstore2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bookstore2.bookstore2.models.Book;

public interface BookRepo extends JpaRepository<Book, Long>{
    boolean findByBookTitle(String string);
}
