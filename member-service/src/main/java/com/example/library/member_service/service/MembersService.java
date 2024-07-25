package com.example.library.member_service.service;

import com.example.library.member_service.DTO.MembersRequest;
import com.example.library.member_service.DTO.MembersResponse;
import com.example.library.member_service.entity.Members;

import java.util.List;

public interface MembersService {
    List<Members> getAllMembers();

    MembersResponse getMemberById(Integer id);

    Members createMember(MembersRequest member);

    Members updateMember(Integer id, MembersRequest updatedMember);

    void deleteMember(Integer id);
}
