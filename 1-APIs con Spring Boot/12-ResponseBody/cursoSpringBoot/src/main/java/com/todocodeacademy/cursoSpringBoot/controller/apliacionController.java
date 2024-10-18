package com.todocodeacademy.cursoSpringBoot.controller;

import com.todocodeacademy.cursoSpringBoot.Cliente;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class apliacionController {

    @GetMapping("/cliente/traer")
    @ResponseBody
    public List<Cliente> traerClientes() {

        List<Cliente> listaClientes = new ArrayList<Cliente>();
        listaClientes.add(new Cliente(1L, "Zlatan", "Ibrahimovic"));
        listaClientes.add(new Cliente(2L, "Cristiano", "Ronaldo"));
        listaClientes.add(new Cliente(3L, "Lionel", "Messi"));

        return listaClientes;

    }

    @GetMapping("/pruebaresponse")
    ResponseEntity<String> traerRespuesta() {
        return new ResponseEntity<>("Esta es una prueba de response", HttpStatus.NOT_FOUND);
    }

}

