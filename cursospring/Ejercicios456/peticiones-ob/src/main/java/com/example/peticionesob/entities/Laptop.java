package com.example.peticionesob.entities;
import jakarta.persistence.*;


@Entity
@Table(name = "Laptop")
public class Laptop {

    //Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String SN;
    private String marca;
    private String modelo;

    public Laptop(){

    }

    //Constructor
    public Laptop(Long id, String SN, String marca, String modelo) {
        this.id = id;
        this.SN = SN;
        this.marca = marca;
        this.modelo = modelo;
    }


    //Getters y Seders
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSN() {
        return SN;
    }

    public void setSN(String SN) {
        this.SN = SN;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }


    //ToString
    @Override
    public String toString() {
        return "Laptop{" +
                "id=" + id +
                ", SN='" + SN + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}


