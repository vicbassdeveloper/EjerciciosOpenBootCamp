package com.example.poo.herencia;

import com.example.poo.superClase.SmartDevice;

public class SmartWatch extends SmartDevice {

    int correa;
    int diametro;

    public SmartWatch() {

    }

    public SmartWatch(String fabricante, String modelo, String so, int ram, String color, double version, boolean wifi, boolean bluetooth, double precio, int correa, int diametro) {
        super(fabricante, modelo, so, ram, color, version, wifi, bluetooth, precio);
        this.correa = correa;
        this.diametro = diametro;
    }
}
