package com.example.library.transactions.service.DTO;

import lombok.Data;

import java.util.Date;

@Data
public class TransactionsRequest {
    private Date transactionDate;
    private Date dueDate;
    private Date returnDate;

}
