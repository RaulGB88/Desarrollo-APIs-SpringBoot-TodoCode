
package com.todocodeacademy.cursoSpringBoot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class apliacionController {
    
   @GetMapping ("/imc")
   public String calcularSuma (@RequestParam double imc_persona) {
          
       String estado_peso="";
          
       if (imc_persona<=18.5) {
           estado_peso = "Peso insuficiente";
       }
       else if (imc_persona >=18.6 && imc_persona <=24.9){
            estado_peso = "Peso saludable";
       }
        else if (imc_persona >=25.0 && imc_persona <=29.9){
            estado_peso = "Sobrepeso";
       }
        else if (imc_persona >=30){
            estado_peso = "Obesidad";
       }
   
   return "El estado de peso del paciente es: " + estado_peso;
       
   }
    
    
    
}
