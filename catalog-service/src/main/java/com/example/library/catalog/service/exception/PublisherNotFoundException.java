package com.example.library.catalog.service.exception;

public class PublisherNotFoundException extends RuntimeException{

    public PublisherNotFoundException(String str)
    {
        super(str);
    }
}
