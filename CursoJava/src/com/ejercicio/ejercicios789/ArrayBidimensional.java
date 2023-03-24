package com.ejercicio.ejercicios789;

import java.util.Arrays;

/*
    * Crea un array bidimensional de enteros y recórrelo, mostrando la posición y el valor de cada elemento en ambas dimensiones.
*/
public class ArrayBidimensional {
    public static void main(String[] args) {

        Integer[][] lista = {
                {20,33,89},
                {20,22,30}};

        System.out.println(lista);

        for (int i = 0; i < lista.length; i++) {

                System.out.println();

                for (int j = 0; j < lista[i].length; j++) {

                    System.out.println("Fila " + (i + 1) + " Columna " + (j + 1)  + "\nNumero " + lista[i][j]);

                }

        }

    }

}
