package com.todocodeacademy.cursoSpringBoot.repository;
import com.todocodeacademy.cursoSpringBoot.model.Posteo;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public class PosteoRepository implements IPosteoRepository{

    @Override
    public List<Posteo> traerTodos() {
       List<Posteo> listaPosteos = new ArrayList<Posteo> ();
       listaPosteos.add(new Posteo (1L, "¿Cómo formatear una PC?", "Luisina de Paula"));
       listaPosteos.add(new Posteo (2L, "¿Cómo mantener la seguridad?", "Gabriel Guismín"));
       
       return listaPosteos;
    }
    
    
    
}
