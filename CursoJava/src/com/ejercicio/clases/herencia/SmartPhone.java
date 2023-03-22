package com.ejercicio.clases.herencia;

import com.ejercicio.clases.clase.SmartDevice;

public class SmartPhone extends SmartDevice {

    public double pantallaPulgadas;
    public int camara;
    public String fabricante;


    public SmartPhone() {

    }

    public SmartPhone(String fabricante, String tipo, String modelo, String so, int almacenamiento, int ram, String color, double precio, double pantallaPulgadas, int camara) {
        super(fabricante, tipo, modelo, so, almacenamiento, ram, color, precio);
        this.pantallaPulgadas = pantallaPulgadas;
        this.camara = camara;
    }
}
