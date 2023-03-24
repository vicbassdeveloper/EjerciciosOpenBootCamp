package com.ejercicio.clases.herencia;

import com.ejercicio.clases.clase.SmartDevice;

public class SmartWatch extends SmartDevice {

    public int correa;
    public int diametro;
    public boolean wifi;
    public boolean bluetooth;
    public String fabricante;

    public SmartWatch() {

    }

    public SmartWatch(String fabricante,String tipo, String modelo, String so, int ram, int almacenamiento, String color, double precio, int correa, int diametro, boolean wifi, boolean bluetooth) {
        super(fabricante,tipo, modelo, so, ram, almacenamiento, color,  precio);
        this.correa = correa;
        this.diametro = diametro;
        this.wifi = wifi;
        this.bluetooth = bluetooth;
    }
}