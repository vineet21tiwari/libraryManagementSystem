package com.example.library.catalog.service.exception;

public class MemberNotFoundException extends RuntimeException{
    public MemberNotFoundException(String str)
    {
        super(str);
    }
}
