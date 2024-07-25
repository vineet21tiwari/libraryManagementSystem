package com.example.library.catalog.service.exception;

public class TransactionNotFound extends RuntimeException{
    public TransactionNotFound(String str)
    {
        super(str);
    }
}
