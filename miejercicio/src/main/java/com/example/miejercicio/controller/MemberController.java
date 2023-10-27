package com.example.miejercicio.controller;

import com.example.miejercicio.entities.Member;
import com.example.miejercicio.services.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/members")
public class MemberController {
    @Autowired
    private MemberService memberService;

    @GetMapping("/new")
    public String newMember(Model model){
        model.addAttribute("member",new Member());
        return "members/new";
    }

    @PostMapping
    public String create(@ModelAttribute Member member){
        memberService.create(member);
        return "redirect:/members";
    }

    @GetMapping
    public String members (Model model){
        model.addAttribute("members",memberService.getMembers());
        return "members/index";
    }

    @GetMapping("/{taxID}")
    public String view(@PathVariable("taxID") String taxID,Model model){
        model.addAttribute("member",memberService.getMemberByTaxID(taxID));
        return "members/view";
    }

    @GetMapping("/{taxID}/edit")
    public String edit(@PathVariable("taxID") String taxID,Model model){
        model.addAttribute("member", memberService.getMemberByTaxID(taxID));
        return "members/edit";
    }

    @PostMapping("/{taxID}")
    public String update(@ModelAttribute Member member,@PathVariable("taxID") String taxID,Model model){
        //TODO
        return "redirect:/members";
    }

    @GetMapping("/{taxID}/delete")
    public String view(@PathVariable("taxID") String taxID){
        //TODO
        return "redirect:/members";
    }
}
