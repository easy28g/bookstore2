package com.bookstore2.bookstore2.services;

import com.bookstore2.bookstore2.models.User;

public interface UserService {
    User findUserByUsername(String authentication);
}
