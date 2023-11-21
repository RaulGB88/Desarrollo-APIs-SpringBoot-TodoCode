
package com.todocodeacademy.requestParam.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
      
    @GetMapping ("hello")
    public String sayHelloComplete (@RequestParam String nombre,
                                    @RequestParam int edad,
                                    @RequestParam String profesion) {
        return "Hello World. Tu nombre es " + nombre + 
                " Edad: " + edad + 
                " Profesión: " + profesion;
    }   
}


