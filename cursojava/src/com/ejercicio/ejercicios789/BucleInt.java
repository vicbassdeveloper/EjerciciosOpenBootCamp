package com.ejercicio.ejercicios789;

/*
* Crea un ArrayList de tipo int, y, utilizando un bucle rellénalo con elementos 1..10. A continuación, con otro bucle,
* recórrelo y elimina los numeros pares. Por último, vuelve a recorrerlo y muestra el ArrayList final.
* Si te atreves, puedes hacerlo en menos pasos, siempre y cuando cumplas el primer "for" de relleno.
 */

import java.util.ArrayList;

public class BucleInt {
    public static void main(String[] args) {

        ArrayList<Integer> solucion1 = new ArrayList<Integer>();

        System.out.println("Lista numeros añadidos solucion 1: ");
        for (int i = 1; i <= 10; i++) {
            solucion1.add(i);
        }
        System.out.println(solucion1);

        System.out.println("Lista numeros nones solucion 1: ");
        for (int i = 1; i <= solucion1.size(); i++) {
            if (solucion1.get(i) %2 == 0) {
                solucion1.remove(i);
            }

        }System.out.println(solucion1);

        ArrayList<Integer> solucion2 = new ArrayList<Integer>();

        for (int i = 1; i <= 10; i++) {

            if (i % 2 !=0) {
                solucion2.add(i);
            }

        }

        System.out.println("Numeros nones solucion 2: \n" + solucion2);
    }
}