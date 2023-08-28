package com.bookstore2.bookstore2.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

    @GetMapping("/new-book")
    public String nbook(){
        return ("<h1>New Book. Welcome Admin</h1>");
    }

    @GetMapping("/bookstore")
    public String bstore(){
        return ("<h1>Bookstore. Welcome User</h1>");
    }
    
    @GetMapping("/")
    public String homestore(){
        return ("<h1>Welcome</h1>");
    }
}
