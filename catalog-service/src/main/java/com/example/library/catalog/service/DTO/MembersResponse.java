package com.example.library.catalog.service.DTO;

import lombok.Data;

import java.util.Date;

@Data
public class MembersResponse {
    private Integer id;
    private String firstName;
    private String lastName;
    private String address;
    private Integer phone;
    private String email;
    private Date membershipDate;
}
