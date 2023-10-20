package poo.demo.entities;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;

@Entity
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // la base de datos se encarga de asignar automáticamente valores únicos a la columna de clave primaria.
    private int id;

    @Column(nullable = false)    //no permite nulos
    private String nombre;

    @Column(nullable = false)
    private String apellido;

    @Column (nullable = false)
    private Long numeroCelular;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Long getNumeroCelular() {
        return numeroCelular;
    }

    public void setNumeroCelular(Long numeroCelular) {
        this.numeroCelular = numeroCelular;
    }

    public int getId() {
        return id;
    }

    
   
}
