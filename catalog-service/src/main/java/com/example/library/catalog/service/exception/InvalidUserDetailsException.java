package com.example.library.catalog.service.exception;

public class InvalidUserDetailsException extends RuntimeException {
    InvalidUserDetailsException(String str) {
        super(str);
    }
}
