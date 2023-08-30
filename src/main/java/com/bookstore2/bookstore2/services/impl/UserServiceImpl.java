package com.bookstore2.bookstore2.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookstore2.bookstore2.models.User;
import com.bookstore2.bookstore2.repositories.UserRepo;
import com.bookstore2.bookstore2.services.UserService;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    UserRepo userRepository;

    @Override
    public User findUserByUsername(String username) {
        return (User) userRepository.findByUsername(username);
    }
}
