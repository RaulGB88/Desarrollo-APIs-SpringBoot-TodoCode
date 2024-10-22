package com.todocodeacademy.estudiante_programacion.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Tema {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_Tema;
    private String nombre;
    private String descripcion;
    @ManyToOne
   @JoinColumn (name="id_curso")
   @JsonIgnore //importante agregar para evitar errores de formato en la response
    Curso curso;

    public Tema() {
    }

    public Tema(Long id_Tema, String nombre, String descripcion) {
        this.id_Tema = id_Tema;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }
    
    
    
}
