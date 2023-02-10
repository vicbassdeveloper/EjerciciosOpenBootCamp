package com.example.poo.superClase;

public class SmartDevice {

    // 1. Atributos

    String fabricante;
    String modelo;
    String so;
    int ram;
    String color;
    double version;
    boolean wifi;
    boolean bluetooth;

    double precio;


    // 2. Constructores

    public SmartDevice() {

    }

    public SmartDevice(String fabricante, String modelo, double precio) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.precio = precio;
    }

    public SmartDevice(String fabricante, String modelo, String so, int ram, String color, double version, boolean wifi, boolean bluetooth, double precio) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.so = so;
        this.ram = ram;
        this.color = color;
        this.version = version;
        this.wifi = wifi;
        this.bluetooth = bluetooth;
        this.precio = precio;
    }



}
