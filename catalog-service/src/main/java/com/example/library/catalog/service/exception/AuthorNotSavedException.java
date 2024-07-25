package com.example.library.catalog.service.exception;

public class AuthorNotSavedException extends RuntimeException {
    AuthorNotSavedException(String str)
    {
        super(str);
    }
}
