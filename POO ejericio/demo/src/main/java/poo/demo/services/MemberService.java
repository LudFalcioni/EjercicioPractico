package poo.demo.services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import poo.demo.repositories.MemberRepository;
import poo.demo.entities.Member;
import java.util.List;

@Service
public class MemberService {
    private MemberRepository memberRepository;
    
    @Autowired
    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }
    public Member createMember(Member member) {
        return memberRepository.save(member);
    }
    public void deleteMember(int memberId) {
        memberRepository.deleteById(memberId);
    }
    public List<Member> getAllMembers() {
        // Utiliza el repositorio para obtener la lista de socios desde la base de datos.
        return memberRepository.findAll();
    }



}


// @Autowired: spring instanciará MemberService y automáticamente le proporcionará una instancia de MemberRepository, 
// permitiéndote acceder y utilizar MemberRepository en tu servicio.