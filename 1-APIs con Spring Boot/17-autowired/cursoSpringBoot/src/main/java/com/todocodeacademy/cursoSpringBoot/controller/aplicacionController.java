package com.todocodeacademy.cursoSpringBoot.controller;

import com.todocodeacademy.cursoSpringBoot.model.Posteo;
import com.todocodeacademy.cursoSpringBoot.repository.IPosteoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class aplicacionController {

    @Autowired
    IPosteoRepository repo;

    @GetMapping("/posteos")
    public List<Posteo> traerTodos() {
        return repo.traerTodos();
    }

}
