package com.ejercicio.ejercicios789;

import java.util.*;

/*
* Crea un ArrayList de tipo String, con 4 elementos. Cópialo en una LinkedList. Recorre ambos mostrando únicamente el valor de cada elemento.
 */

public class ListaDuplicada {
    public static void main(String[] args) {

        String[] lista = {"Rojo", "Azul", "Amarillo", "Verde"};

        LinkedList<String> linkedList = new LinkedList<>();

        for (int i = 0; i < lista.length; i++) {
            linkedList.add(i, lista[i]);
        }
        System.out.println("Elementos lista: \n");
        for (int i = 0; i < lista.length; i++) {
            System.out.println(lista[i]);
        }
        System.out.println("\nElementos lnkedlist; \n");
        for (String elementos : linkedList )     {
            System.out.println(elementos);
        }





    }
}
