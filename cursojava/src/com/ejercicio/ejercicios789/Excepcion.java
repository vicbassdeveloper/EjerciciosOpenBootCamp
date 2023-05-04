package com.ejercicio.ejercicios789;

import java.lang.ArithmeticException;
import java.util.Scanner;
/*
*
 */

public class Excepcion {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Este programa divide dos numeros que pongas");

        System.out.println("Escribe un numero");
        int numeroa = scanner.nextInt();

        System.out.println("Escribe otro numero");
        int numerob = scanner.nextInt();

        System.out.println("El resultado es: ");
        try {
        System.out.println(divide(numeroa, numerob));
        }
        catch (ArithmeticException e) {
            System.out.println("Invalido");
        }
        finally {
            System.out.println("\n1Esto es\nDemo de Codigo");
        }



    }

    public static int divide (int a, int b) throws ArithmeticException {

    return a / b;

    }
}

