package com.ejercicio.clases.clase;

public class SmartDevice {

    // 1. Atributos

    protected String fabricante;
    protected String tipo;
    protected String modelo;
    protected String so;
    protected int ram;
    protected int almacenamiento;
    protected String color;

    protected double precio;


    // 2. Constructores

    public SmartDevice() {

    }


    public SmartDevice(String fabricante, String tipo, String modelo, String so, int ram, int almacenamiento, String color, double precio) {
        this.fabricante = fabricante;
        this.tipo = tipo;
        this.modelo = modelo;
        this.so = so;
        this.ram = ram;
        this.almacenamiento = almacenamiento;
        this.color = color;
        this.precio = precio;
    }


}

