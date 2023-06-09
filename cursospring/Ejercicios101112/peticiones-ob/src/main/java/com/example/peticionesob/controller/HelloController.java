package com.example.peticionesob.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Value("${app.message}")
    String message;

    /**Metodo que devuelve un saludo*/
    @GetMapping("/api/saludo")
    private String Saludo() {

        System.out.println(message);

        return "Hola desde RestController";
    }
}
