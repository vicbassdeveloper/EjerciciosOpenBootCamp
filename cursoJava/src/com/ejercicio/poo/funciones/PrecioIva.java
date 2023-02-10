package com.example.poo.funciones;

public class PrecioIva {
    public static void main(String[] args) {
        double precio = 13.80;
        double precioIva = iva(precio);

        System.out.println("El precio de un refresco es de: " + precio + "\nEn mi ciudad el iva es de el 16% por lo cual \nEl precio del mismo refresco con iva es de :" + precioIva);

    }

    public static double iva(double precio) {
        return precio * 1.16;
    }
}
