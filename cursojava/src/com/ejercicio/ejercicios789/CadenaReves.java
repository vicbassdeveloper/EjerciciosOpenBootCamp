package com.ejercicio.ejercicios789;

import java.util.Scanner;

public class CadenaReves {
    public static void main(String[] args) {
        System.out.println("Escribe un texto y te lo devolvere al reves");

        String textoreves;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe un texto:");
        String texto = scanner.nextLine();

        StringBuilder reversa = new StringBuilder(texto);
        textoreves = reversa.reverse().toString();

        System.out.println("El texto "+texto +" al reves es:\n"+ textoreves);

    }
}
