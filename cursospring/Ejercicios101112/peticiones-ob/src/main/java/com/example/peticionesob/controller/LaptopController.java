package com.example.peticionesob.controller;

import com.example.peticionesob.entities.Laptop;
import com.example.peticionesob.repository.LaptopRepository;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.Optional;

/*
Ejercicio 1

Implementar los métodos CRUD en el API REST de Laptop creada en ejercicios anteriores.

Los métodos CRUD: findAll(), findOneById(), create(), update(), delete(), deleteAll()
 */

@RestController
public class LaptopController {

    private final Logger log = LoggerFactory.getLogger(LaptopController.class);
    private final LaptopRepository laptopRepository;

    public LaptopController(LaptopRepository laptopRepository) {
        this.laptopRepository = laptopRepository;
    }

    //findAll()
    /**Metodo para buscar todos los equipos*/
    @GetMapping("/api/laptop")
    private List<Laptop> listaLaptops(){
        return laptopRepository.findAll();
    }

    //findOneById()

    /**
     * Metodo para buscar un equipo por su id
     */
    @GetMapping("/api/laptop/{id}")
    private ResponseEntity<Laptop> laptopId(@PathVariable Long id) {
        Optional<Laptop> laptopOpt = laptopRepository.findById(id);
        return laptopOpt.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    //create()

    /**
     * Metodo para agregar un equipo
     * @param laptop (id, marca, modelo, serie )
     * &#064;null,  @String, @String, @String
     * @return new laptop
     */
    //Agregar nuevo equipo
    @PostMapping("/api/laptop/")
    private ResponseEntity<Laptop> nuevaLaptop(@RequestBody Laptop laptop, HttpHeaders headers) {
        System.out.println("User-Agent");
        if(laptop.getId() != null){
            log.warn("trying to create Laptop with id, this id is autoincrement beacuse id to receive is null");
            return ResponseEntity.badRequest().build();
        } else {
            Laptop result = laptopRepository.save(laptop);
            return ResponseEntity.ok(result);
        }
    }

    @PostMapping("/api/laptop/simple")
    private Laptop nuevaLaptop1(@RequestBody Laptop laptop) {
        return laptopRepository.save(laptop);
    }

    //update()
    @PostMapping("/api/laptop/{id}")
    private ResponseEntity<Laptop> laptopUpdate(@RequestBody Laptop laptop, HttpHeaders headers) {
        System.out.println("User-Agent");
        if(laptop.getId() == null){
            log.warn("trying to crete Laptop");
        return ResponseEntity.badRequest().build();
        } if (!laptopRepository.existsById(laptop.getId())) {
            log.warn("trying update a non existent laptop");
            return ResponseEntity.notFound().build();
        }
        else {
            Laptop result = laptopRepository.save(laptop);
            return ResponseEntity.ok(result);
        }
    }

    //delete()
    @DeleteMapping("/api/laptop/{id}")
    private ResponseEntity<Laptop> laptopDelete(@PathVariable Long id) {
        if (!laptopRepository.existsById(id)){
            log.warn("Trying to delete a non esxisten laptop");
            return ResponseEntity.notFound().build();
        } laptopRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }

    //deleteAll()
    @DeleteMapping("/api/laptop/all")
    private ResponseEntity<Laptop> laptopDeleteAll() {
        log.info("Delete all");
        laptopRepository.deleteAll();
        return ResponseEntity.noContent().build();
    }

}
