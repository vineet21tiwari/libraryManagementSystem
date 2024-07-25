package com.example.library.member_service.DTO;

import lombok.Data;

import java.util.Date;

@Data
public class MembersRequest {

    private String firstName;
    private String lastName;
    private String address;
    private Integer phone;
    private String email;
    private Date membershipDate;
}
