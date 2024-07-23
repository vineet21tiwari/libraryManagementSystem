package com.example.library.transactions.service.entity;

import com.example.library.member_service.entity.Members;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
//import org.springframework.data.annotation.Id;
import jakarta.persistence.*;

import java.awt.print.Book;
import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Transactions {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;
    private Date transactionDate;
    private Date dueDate;
    private Date returnDate;

//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "book_id", referencedColumnName = "id")
//    private Book book;
//
//
//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "member_id", referencedColumnName = "id")
//    private Members members;
}


