package com.bookstore2.bookstore2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

import com.bookstore2.bookstore2.models.User;

public interface UserRepo extends JpaRepository<User, Long>{

    UserDetails findByUsername(String username);
    
}
