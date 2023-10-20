package poo.demo.repositories;
import org.springframework.data.jpa.repository.JpaRepository;

import poo.demo.entities.Member;

public interface MemberRepository extends JpaRepository<Member, Integer> {
    
}



// Un repositorio JPA te permite realizar operaciones CRUD (Crear, Leer, Actualizar, Eliminar) 
// en la base de datos para la entidad.
