package com.example.library.member_service.controller;

import com.example.library.member_service.DTO.MembersRequest;
import com.example.library.member_service.DTO.MembersResponse;
import com.example.library.member_service.entity.Members;
import com.example.library.member_service.service.MembersService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api-members")
public class MembersController {

    Logger logger = LoggerFactory.getLogger(MembersController.class);

    @Autowired
    private MembersService membersService;

    @GetMapping("/allMember")
    public List<Members> getAllMembers() {
        return membersService.getAllMembers();
    }

    @GetMapping("/fetchMember/{id}")
    public MembersResponse getMemberById(@PathVariable Integer id) {
        return membersService.getMemberById(id);
    }

    @PostMapping("/saveMember")
    public Members createMember(@RequestBody MembersRequest membersRequest) {
        return membersService.createMember(membersRequest);
    }

    @PutMapping("/UpdateMember/{id}")
    public Members updateMember(@PathVariable Integer id, @RequestBody MembersRequest updatedMember) {
        return membersService.updateMember(id, updatedMember);
    }

    @DeleteMapping("/deleteMember/{id}")
    public void deleteMember(@PathVariable Integer id) {
        membersService.deleteMember(id);
    }
}
