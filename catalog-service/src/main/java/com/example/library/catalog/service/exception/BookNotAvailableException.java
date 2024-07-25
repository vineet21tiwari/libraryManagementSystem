package com.example.library.catalog.service.exception;

public class BookNotAvailableException extends RuntimeException {
    BookNotAvailableException(String str) {
        super(str);
    }
}
