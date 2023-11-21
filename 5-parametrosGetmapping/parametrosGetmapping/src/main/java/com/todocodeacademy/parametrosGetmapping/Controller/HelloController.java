
package com.todocodeacademy.parametrosGetmapping.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    
    @GetMapping ("hello/{nombre}")
    public String sayHello (@PathVariable String nombre) {
        return "Hello World " + nombre;
    }
    
    @GetMapping ("hello/{nombre}/{edad}/{profesion}")
    public String sayHelloComplete (@PathVariable String nombre,
                                    @PathVariable int edad,
                                    @PathVariable String profesion) {
        return "Hello World. Tu nombre es " + nombre + 
                " Edad: " + edad + 
                " Profesión " + profesion;
    }   
}


