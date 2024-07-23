package com.example.library.catalog.service.exception;

public class BookServiceException extends RuntimeException {
    BookServiceException(String str) {
        super(str);
    }
}
