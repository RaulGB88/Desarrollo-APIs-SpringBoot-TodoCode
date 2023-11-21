package com.granel.todocode.springboot.RequestParam.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("sum/{num1}/{num2}")
    public String sumNumbers(@PathVariable int num1, @PathVariable int num2) {
        return "La suma de los numeros es...: " + String.valueOf(num1 + num2);
    }

    @GetMapping("imc")
    public String imc(@RequestParam int imc) {
        String state = "";

        if (imc < 1) {
            state = "Introduce un IMC válido";
        } else if (imc >= 1 && imc <= 18.5) {
            state = "Peso insuficiente";
        } else if (imc >= 18.6 && imc <= 24.9) {
            state = "Peso normal";
        } else if (imc >= 25.0 && imc <= 29.9) {
            state = "Sobrepeso";
        } else {
            state = "Obesidad";
        }
        return state;
    }
}
