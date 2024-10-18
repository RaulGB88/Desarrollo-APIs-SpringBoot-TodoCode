package com.todocodeacademy.cursoSpringBoot.repository;
import com.todocodeacademy.cursoSpringBoot.model.Posteo;
import java.util.List;

public interface IPosteoRepository {
    
    public List<Posteo> traerTodos();
    
}
