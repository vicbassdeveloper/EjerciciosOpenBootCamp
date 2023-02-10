package com.example.poo.herencia;

import com.example.poo.superClase.SmartDevice;

public class SmartPhone extends SmartDevice {

    double pantallaPulgadas;
    int camara;


    public SmartPhone() {

    }

    public SmartPhone(String fabricante, String modelo, String so, int ram, String color, double version, boolean wifi, boolean bluetooth, double precio, double pantallaPulgadas, int camara) {
        super(fabricante, modelo, so, ram, color, version, wifi, bluetooth, precio);
        this.pantallaPulgadas = pantallaPulgadas;
        this.camara = camara;
    }
}
