package com.example.miejercicio.services;

import com.example.miejercicio.entities.Member;
import org.springframework.stereotype.Service;
import java.util.List;


public interface MemberService {
    public void create(Member member);
    public List<Member> getMembers();
    public Member getMemberByTaxID(String taxID);
}