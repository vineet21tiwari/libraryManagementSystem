package com.example.library.catalog.service.exception;

public class InvalidBookDetailsException extends RuntimeException {
    InvalidBookDetailsException(String str) {
        super(str);
    }
}
