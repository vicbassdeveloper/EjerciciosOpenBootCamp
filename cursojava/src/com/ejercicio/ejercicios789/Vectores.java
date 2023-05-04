package com.ejercicio.ejercicios789;

import java.util.Scanner;
import java.util.Vector;


/*

* * Crea un "Vector" del tipo de dato que prefieras, y añádele 5 elementos. Elimina el 2o y 3er elemento y muestra el resultado final.

 */
public class Vectores {
    public static void main(String[] args) {

        Vector vector = new Vector();
        Scanner scanner = new Scanner(System.in);



        vector.addElement("Nombre");
        vector.addElement("Edad");
        vector.addElement("ID");
        vector.addElement("Color Favorito");
        vector.addElement("Pasatiempo preferido");

        System.out.println(vector);

        vector.remove(1);
        vector.remove(1);

        System.out.println(vector);



    }

}
