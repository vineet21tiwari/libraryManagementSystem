package com.example.library.member_service.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Members  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ID;
    private String firstName;
    private String lastName;
//    @Transient
    private String address;
    private Integer phone;
    private String email;
    private Date membershipDate;

    @Transient
    private List<Transactions> transactionsList;
}
