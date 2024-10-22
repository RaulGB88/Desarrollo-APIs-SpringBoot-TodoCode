package com.todocodeacademy.estudiante_programacion.model;

import java.time.LocalDate;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Curso {
    
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id_curso;
    private String nombre;
    private String modalidad;
    private String fecha_finalizacion;
    @OneToMany (mappedBy="curso")
    private List<Tema> listaTemas;

    public Curso() {
    }

    public Curso(Long id_curso, String nombre, String modalidad, String fecha_finalizacion, List<Tema> listaTemas) {
        this.id_curso = id_curso;
        this.nombre = nombre;
        this.modalidad = modalidad;
        this.fecha_finalizacion = fecha_finalizacion;
        this.listaTemas = listaTemas;
    }

  
    
    
    
}
