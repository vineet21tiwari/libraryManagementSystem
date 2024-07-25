package com.example.library.transactions.service.DTO;

import lombok.Data;
import java.util.Date;

@Data
public class TransactionsResponse {
    private Integer id;
    private Date transactionDate;
    private Date dueDate;
    private Date returnDate;
}
