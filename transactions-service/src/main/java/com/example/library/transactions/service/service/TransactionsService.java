package com.example.library.transactions.service.service;

import com.example.library.transactions.service.DTO.TransactionsRequest;
import com.example.library.transactions.service.DTO.TransactionsResponse;
import com.example.library.transactions.service.entity.Transactions;

import java.util.List;

public interface TransactionsService {
    List<Transactions> getAllTransactions();

    TransactionsResponse getTransactionById(Integer id);

    Transactions createTransactions(TransactionsRequest transactionsRequest);

    Transactions updateTransactions(Integer id, TransactionsRequest transactionsRequest);

    void deleteTransaction(Integer id);
}
