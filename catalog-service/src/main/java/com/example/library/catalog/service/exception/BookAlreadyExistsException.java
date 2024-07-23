package com.example.library.catalog.service.exception;

public class BookAlreadyExistsException extends RuntimeException {
    BookAlreadyExistsException(String str) {
        super(str);
    }
}
