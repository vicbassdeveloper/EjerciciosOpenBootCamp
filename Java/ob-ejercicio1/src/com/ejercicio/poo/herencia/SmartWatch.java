package com.example.poo.herencia;

import com.example.poo.superClase.SmartDevice;

public class SmartWatch extends SmartDevice {

    public int correa;
    public int diametro;
    public boolean wifi;
    public boolean bluetooth;

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