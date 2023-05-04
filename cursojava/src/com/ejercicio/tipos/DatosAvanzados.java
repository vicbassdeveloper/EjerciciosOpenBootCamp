package com.ejercicio.tipos;

public class DatosAvanzados {

    public static void main(String[] args) {
        String cadena = "Mensaje DE TEXTo";
//                       0123456789012345
        char arr1[] = new char[cadena.length()];

        for (int i = cadena.length() - 1; i >= 0 ; i--) {
            System.out.println(cadena.substring(i));


        }

    }

}
