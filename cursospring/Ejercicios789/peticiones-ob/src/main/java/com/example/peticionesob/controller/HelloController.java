package com.example.peticionesob.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    /**Metodo que devuelve un saludo*/
    @GetMapping("/api/saludo")
    private String Saludo() {
        return "Hola desde RestController";
    }
}
