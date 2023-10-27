package com.example.miejercicio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.miejercicio.entities.Member;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


public interface MemberRepository extends JpaRepository <Member, Long> {
    @Query("SELECT m FROM Member m WHERE m.taxID = :taxID")
    Member findByTaxID(@Param("taxID") String taxID);
    
}