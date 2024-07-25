package com.example.library.transactions.service.serviceImpl;

import com.example.library.transactions.service.DTO.TransactionsRequest;
import com.example.library.transactions.service.DTO.TransactionsResponse;
import com.example.library.transactions.service.entity.Transactions;
import com.example.library.transactions.service.service.TransactionsService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionalServiceImpl implements TransactionsService {
    @Override
    public List<Transactions> getAllTransactions() {
        return null;
    }

    @Override
    public TransactionsResponse getTransactionById(Integer id) {
        return null;
    }

    @Override
    public Transactions createTransactions(TransactionsRequest transactionsRequest) {
        return null;
    }

    @Override
    public Transactions updateTransactions(Integer id, TransactionsRequest transactionsRequest) {
        return null;
    }

    @Override
    public void deleteTransaction(Integer id) {

    }
}
