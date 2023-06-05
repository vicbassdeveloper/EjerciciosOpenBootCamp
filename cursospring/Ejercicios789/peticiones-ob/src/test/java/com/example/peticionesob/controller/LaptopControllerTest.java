package com.example.peticionesob.controller;

import com.example.peticionesob.entities.Laptop;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.*;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class LaptopControllerTest {

    private TestRestTemplate testRestTemplate;
    @Autowired
    private RestTemplateBuilder restTemplateBuilder;

    @LocalServerPort
    private int port;

    @BeforeEach
    void setUp() {
        restTemplateBuilder = restTemplateBuilder.rootUri("http://localhost:"+ port);
        testRestTemplate = new TestRestTemplate(restTemplateBuilder);
    }

    @Test
    void listaLaptops() {
        ResponseEntity<Laptop[]> response =
        testRestTemplate.getForEntity("/api/laptop/", Laptop[].class);

        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals(200, response.getStatusCodeValue());
        List<Laptop> laptops= Arrays.asList(Objects.requireNonNull(response.getBody()));
        System.out.println(laptops.size());


    }

    @Test
    void laptopId(){
        ResponseEntity<Laptop> response =
                testRestTemplate.getForEntity("/api/laptop/1", Laptop.class);

        assertEquals(HttpStatus.NOT_FOUND, response.getStatusCode());

    }

    @Test
    void nuevaLaptop() {

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.setAccept(List.of(MediaType.APPLICATION_JSON));

        String json = """
                 {
                        "id": null,
                        "marca": "prueba",
                        "modelo": "modeloPrueba",
                        "sn": "pruebaSN"
                 }
                """;

        HttpEntity<String> request = new HttpEntity<>(json, headers);
        ResponseEntity<Laptop> response = testRestTemplate.exchange("/api/laptop/",HttpMethod.POST, request,Laptop.class);

        Laptop result = response.getBody();
        assertNull(result != null ? result.getId() : null);


    }

    @Test
    void laptopUpdate() {

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.setAccept(List.of(MediaType.APPLICATION_JSON));

        String json = """
                 {
                        "id": null,
                        "marca": "prueba",
                        "modelo": "modeloPrueba",
                        "sn": "pruebaSN"
                 }
                """;

        HttpEntity<String> request = new HttpEntity<>(json, headers);
        ResponseEntity<Laptop> response = testRestTemplate.exchange("/api/laptop/1",HttpMethod.POST, request,Laptop.class);

        Laptop result = response.getBody();
        assertNull(result != null ? result.getId() : null);
        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals(HttpStatus.NOT_FOUND, response.getStatusCode());

    }

    @Test
    void laptopDelete() {
        ResponseEntity<Laptop> response =
                testRestTemplate.getForEntity("/api/laptop/1", Laptop.class);

        assertEquals(HttpStatus.NOT_FOUND, response.getStatusCode());

    }

}