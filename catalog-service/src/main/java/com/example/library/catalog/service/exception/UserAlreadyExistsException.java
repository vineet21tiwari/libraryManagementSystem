package com.example.library.catalog.service.exception;

public class UserAlreadyExistsException extends RuntimeException{
    UserAlreadyExistsException(String str)
    {
        super(str);
    }
}
