package com.bookstore2.bookstore2.enums;

import org.springframework.security.core.GrantedAuthority;

public enum Role implements GrantedAuthority{

    USER, ADMIN;
    
    @Override
    public String getAuthority() {
        return name();
    }
    
}