package com.ejercicio.clases.clase;


import com.ejercicio.clases.herencia.SmartPhone;
import com.ejercicio.clases.herencia.SmartWatch;

public class Main {
    public static void main(String[] args) {

        SmartPhone Redmi9 = new SmartPhone("Xiaomi","Celular", "9a", "Android 11.0", 8, 128, "Negro", 5600.32,7.5, 48);
        SmartWatch Wath4 = new SmartWatch("Samsung","Reloj Inteligente", "Galaxy Watch4", "WearOS", 4, 16, "Azul", 3200, 28, 44, true, false);

        System.out.println("Marca: " + Redmi9.fabricante);
        System.out.println("Tipo: " + Redmi9.tipo);
        System.out.println("Modelo: " + Redmi9.modelo);
        System.out.println("Sistema Operativo: " + Redmi9.so);
        System.out.println("Memoria RAM: "+ Redmi9.ram+"GB");
        System.out.println("Almacenamiento: "+ Redmi9.almacenamiento +"GB");
        System.out.println("Color: " + Redmi9.color);
        System.out.println("Precio: $" + Redmi9.precio);
        System.out.println("Pantalla: " + Redmi9.pantallaPulgadas + "\"");
        System.out.println("Camara: " + Redmi9.camara+"\n\n");

        System.out.println("Marca: " + Wath4.fabricante);
        System.out.println("Tipo: " + Wath4.tipo);
        System.out.println("Modelo: " + Wath4.modelo);
        System.out.println("Sistema Operativo: "+Wath4.so);
        System.out.println("Memoria RAM: "+Wath4.ram+"GB");
        System.out.println("Almacenamiento: "+Wath4.almacenamiento+"GB");
        System.out.println("Color: "+Wath4.color);
        System.out.println("Precio: $"+Wath4.precio);
        System.out.println("Correa: "+Wath4.correa+"cm");
        System.out.println("Diametro: "+Wath4.diametro+"\"");
        System.out.println("Cuenta con WIFI: "+Wath4.wifi);
        System.out.println("Cuenta con Bluetooth: "+Wath4.bluetooth);

    }
}
