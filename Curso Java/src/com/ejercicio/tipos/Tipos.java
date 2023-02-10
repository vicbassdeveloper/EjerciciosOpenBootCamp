package com.ejercicio.tipos;

/*Ejercicio 1

- Crea un proyecto de Java desde 0

- Dentro del proyecto tenéis que crear un paquete. En el paquete tendréis que crear una clase.

- Dentro de la clase tenéis que crear el método main e imprimir todos los datos que se han visto en las sesiones.

- Recordatorio: Los tipos de datos más comunes son int, long, double, boolean, String.
 */

public class Tipos {

    public static void main(String[] args) {

        // 1. numericos


        // 1.1 enteros

        byte bit = 4;
        short corto = 10;
        int entero = 30;
        long largo = 100;

        // 1.2 decimales

        float flotante = 1.2f;
        double doble = 5.2d;


        // booleano

        boolean verdadero = true;
        boolean falso = false;


        // texto

        char caracter = 'a';
        String cadenaTexto = "Un texto";


        System.out.println("El tipo numérico puede ser:" + bit + " , " + corto + " , " + entero + " o " + largo);
        System.out.println("El tipo flotante puede ser:" + flotante + " o " + doble);
        System.out.println("El tipo boleano puede ser:" + verdadero + " o " + falso);
        System.out.println("El tipo texto puede ser:" + caracter + " o " + cadenaTexto);
    }
}
