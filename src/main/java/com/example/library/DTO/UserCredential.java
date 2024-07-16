package com.example.library.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserCredential {
    private String password;
    private String email;
    private String aadharCard;
    private String panCard;

}
