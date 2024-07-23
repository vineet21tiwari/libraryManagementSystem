package com.example.library.catalog.service.exception;

public class AuthorNotFoundException extends RuntimeException{
    public AuthorNotFoundException(String str)
    {
        super(str);
    }
}
