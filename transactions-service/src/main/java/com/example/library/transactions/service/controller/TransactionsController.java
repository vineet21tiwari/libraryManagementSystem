package com.example.library.transactions.service.controller;

import com.example.library.transactions.service.DTO.TransactionsRequest;
import com.example.library.transactions.service.DTO.TransactionsResponse;
import com.example.library.transactions.service.entity.Transactions;
import com.example.library.transactions.service.service.TransactionsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/transactions")
public class TransactionsController {
    Logger logger = LoggerFactory.getLogger(TransactionsController.class);

    @Autowired
    private TransactionsService transactionsService;


    @GetMapping("/fetchAllTransaction")
    public List<Transactions> getAllTransactions() {
        return transactionsService.getAllTransactions();
    }

    @GetMapping("/getTransactionById/{id}")
    public TransactionsResponse getTransactionById(@PathVariable Integer id) {
        return transactionsService.getTransactionById(id);

    }

    @PostMapping("/saveTransaction")
    public Transactions createTransactions(@RequestBody TransactionsRequest transactionsRequest) {
        return transactionsService.createTransactions(transactionsRequest);
    }

    @PutMapping("/updateTransactions/{id}")
    public Transactions updateTransactions(@PathVariable Integer id, @RequestBody TransactionsRequest transactionsRequest) {
        return transactionsService.updateTransactions(id, transactionsRequest);
    }

    @DeleteMapping("/deleteTransaction/{id}")
    public void deleteTransaction(@PathVariable Integer id) {
        transactionsService.deleteTransaction(id);

    }
}
