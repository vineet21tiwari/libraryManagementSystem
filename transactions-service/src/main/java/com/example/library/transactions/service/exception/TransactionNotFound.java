package com.example.library.transactions.service.exception;

public class TransactionNotFound extends RuntimeException{
    public TransactionNotFound(String str)
    {
        super(str);
    }
}
