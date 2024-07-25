package com.example.library.catalog.service.exception;

public class AuthorDeleted extends RuntimeException {
    public AuthorDeleted(String str)
    {
        super(str);
    }
}
