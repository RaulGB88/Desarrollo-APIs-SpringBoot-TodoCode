
package com.todocodeacademy.cursoSpringBoot.controller;

import com.todocodeacademy.cursoSpringBoot.Cliente;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class apliacionController {
    
   @PostMapping ("/cliente")
   public void nuevoCliente (@RequestBody Cliente cli) {
   
       //probamos que nos devuelva por consola del servidor
       //los datos que recibimos desde el cliente mediante el body de la solicitud
       System.out.println("Datos del cliente. Nombre " + cli.getNombre() 
        + " Apellido: " + cli.getApellido());
              
   }
   
}

