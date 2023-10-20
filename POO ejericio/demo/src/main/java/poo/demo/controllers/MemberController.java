package poo.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.Autowired;
import poo.demo.entities.Member;
import poo.demo.services.MemberService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@Controller
@RequestMapping("/members") //Ruta base para todas las operaciones relacionadas con socios

public class MemberController {
    @Autowired
    private MemberService memberService;

    @GetMapping
    public String listMembers(Model model) {
        List<Member> members = memberService.getAllMembers();
        model.addAttribute("members", members);
        return "member-list";
    }

    @GetMapping("/create")
    public String showCreateForm(Model model) {
        // Mostrar un formulario para crear un nuevo socio
        model.addAttribute("member", new Member());
        return "create-member-form"; // Nombre de la vista del formulario de creación
    }

    @PostMapping("/create")
    public String createMember(@ModelAttribute Member member) {
        // Procesar la creación de un nuevo socio
        memberService.createMember(member);
        return "redirect:/members"; // Redirigir de nuevo a la lista de socios
    }

    @GetMapping("/delete/{id}")
    public String deleteMember(@PathVariable int id) {
        // Eliminar un socio
        memberService.deleteMember (id);
        return "redirect:/members"; // Redirigir de nuevo a la lista de socios
    }
}
