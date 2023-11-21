
package com.todocodeacademy.cursoSpringBoot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class apliacionController {
    
   @GetMapping ("suma/{num1}/{num2}")
   public String calcularSuma (@PathVariable int num1,
                            @PathVariable int num2) {
   
   int resultado = num1 + num2;
   
   return "El resultado de la suma es: " + resultado;
       
   }
    
    
    
}
