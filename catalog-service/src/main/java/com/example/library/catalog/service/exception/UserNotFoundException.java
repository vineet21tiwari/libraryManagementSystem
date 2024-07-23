package com.example.library.catalog.service.exception;

public class UserNotFoundException extends RuntimeException {
    UserNotFoundException(String message) {
        super(message);
    }
}
