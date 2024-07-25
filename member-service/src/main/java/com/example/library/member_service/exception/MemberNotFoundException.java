package com.example.library.member_service.exception;

public class MemberNotFoundException extends RuntimeException{
   public MemberNotFoundException(String str)
   {
       super(str);
   }
}
