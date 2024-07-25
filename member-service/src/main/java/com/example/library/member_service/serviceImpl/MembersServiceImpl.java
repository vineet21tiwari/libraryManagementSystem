package com.example.library.member_service.serviceImpl;

import com.example.library.member_service.DTO.MembersRequest;
import com.example.library.member_service.DTO.MembersResponse;
import com.example.library.member_service.entity.Members;
import com.example.library.member_service.exception.MemberNotFoundException;
import com.example.library.member_service.repository.MembersRepository;
import com.example.library.member_service.service.MembersService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class MembersServiceImpl implements MembersService {
    Logger logger = LoggerFactory.getLogger(MembersServiceImpl.class);

    @Autowired
    private MembersRepository membersRepository;


    @Override
    public List<Members> getAllMembers() {
        List<Members> membersList = membersRepository.findAll();
        return membersList.stream().collect(Collectors.toList());
    }

    @Override
    public MembersResponse getMemberById(Integer id) {
        MembersResponse membersResponse = new MembersResponse();
        Members members = membersRepository.findById(id).orElseThrow();
        if (members == null) {
            throw new MemberNotFoundException("member not found with this id  : " + id);
        } else {
            membersResponse.setId(members.getID());
            membersResponse.setFirstName(members.getFirstName());
            membersResponse.setLastName(members.getLastName());
            membersResponse.setEmail(members.getEmail());
            membersResponse.setAddress(members.getAddress());
            membersResponse.setMembershipDate(members.getMembershipDate());
            membersResponse.setPhone(members.getPhone());
        }
        return membersResponse;
    }

    @Override
    public Members createMember(MembersRequest member) {
        Members members = new Members();

        members.setAddress(member.getAddress());
        members.setEmail(member.getEmail());
        members.setPhone(member.getPhone());
        members.setFirstName(member.getAddress());
        members.setLastName(member.getAddress());
        members.setMembershipDate(member.getMembershipDate());
        return membersRepository.save(members);
    }

    @Override
    public Members updateMember(Integer id, MembersRequest updatedMember) {

        membersRepository.findById(id).orElseThrow();

        Members members = new Members();
        members.setAddress(updatedMember.getAddress());
        members.setPhone(updatedMember.getPhone());
        members.setEmail(updatedMember.getEmail());
        members.setFirstName(updatedMember.getFirstName());
        members.setLastName(updatedMember.getLastName());
        members.setMembershipDate(updatedMember.getMembershipDate());

        return membersRepository.save(members);
    }

    @Override
    public void deleteMember(Integer id) {
        try {
            membersRepository.findById(id).orElseThrow();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
