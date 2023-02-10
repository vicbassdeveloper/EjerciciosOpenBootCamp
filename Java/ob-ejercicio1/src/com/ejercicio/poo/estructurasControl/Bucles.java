package com.example.poo.estructurasControl;

/**
 * Crear un bucle que permita concatenar texto e imprima el resultado final por consola
 * Concatenar nombres
 * Los textos pueden venir de un array String
 * String[] nombres = {"", "", "", ""};
 */
public class Bucles {

    public static void main(String[] args) {
        String[] listaNombres = {"Maria", "Juan", "Fransisco", "Ana", "Margarita"};

        System.out.println(nombres(listaNombres));


    }

    public static String nombres(String[] nombres) {
        String nombre = " ";

        for (int i = 0; i < nombres.length; i++) {

            nombre += nombres[i] + " ";
        }
        return nombre;
    }
}