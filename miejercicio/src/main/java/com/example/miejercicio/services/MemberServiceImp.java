package com.example.miejercicio.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.miejercicio.entities.Member;
import com.example.miejercicio.repositories.MemberRepository;

import java.util.List;

@Service
public class MemberServiceImp implements MemberService{

    @Autowired
    private MemberRepository memberRepository ;

    @Override
    public void create(Member member) {
        memberRepository.save(member);
    }
    @Override
    public List<Member> getMembers() {
        return memberRepository.findAll();
    }

    @Override
    public Member getMemberByTaxID(String taxID) {
        return memberRepository.findByTaxID(taxID);
    }
}