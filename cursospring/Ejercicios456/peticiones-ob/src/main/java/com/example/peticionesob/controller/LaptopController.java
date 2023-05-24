package com.example.peticionesob.controller;

import com.example.peticionesob.entities.Laptop;
import com.example.peticionesob.repository.LaptopRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LaptopController {

    private LaptopRepository laptopRepository;

    public LaptopController(LaptopRepository laptopRepository) {
        this.laptopRepository = laptopRepository;
    }

    /**Metodo para buscar todos los equipos*/
    @GetMapping("/api/laptop")
    private List<Laptop> listaLaptops(){
        return laptopRepository.findAll();
    }

    /**Metodo para agregar un nuevo equipo*/
    //Agregar nuevo equipo
    @PostMapping("/api/laptop")
    private Laptop nuevaLaptop(@RequestBody Laptop laptop) {
        return laptopRepository.save(laptop);
    }




}
