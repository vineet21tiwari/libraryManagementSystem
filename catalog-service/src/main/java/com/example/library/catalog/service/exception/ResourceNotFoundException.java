package com.example.library.catalog.service.exception;

public class ResourceNotFoundException extends RuntimeException{
    ResourceNotFoundException()
    {
        System.out.println("resourceNotFoundException");
    }
}
