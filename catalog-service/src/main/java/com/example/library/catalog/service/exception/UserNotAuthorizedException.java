package com.example.library.catalog.service.exception;

public class UserNotAuthorizedException extends RuntimeException{
    UserNotAuthorizedException(String str)
    {
        super(str);
    }
}
