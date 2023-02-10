package com.example.poo.herencia;

import com.example.poo.clase.SmartDevice;

public class SmartPhone extends SmartDevice {

    public double pantallaPulgadas;
    public int camara;


    public SmartPhone() {

    }

    public SmartPhone(String fabricante, String tipo, String modelo, String so, int almacenamiento, int ram, String color, double precio, double pantallaPulgadas, int camara) {
        super(fabricante,tipo, modelo, so, almacenamiento, ram, color, precio);
        this.pantallaPulgadas = pantallaPulgadas;
        this.camara = camara;
    }
}
