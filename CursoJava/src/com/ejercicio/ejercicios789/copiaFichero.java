package com.ejercicio.ejercicios789;
import java.io.*;
import java.util.Scanner;

/*
 * Utilizando InputStream y PrintStream, crea una función que reciba dos parámetros: "fileIn" y "fileOut".
 * La tarea de la función será realizar la copia del fichero dado en el parámetro "fileIn" al fichero dado en "fileOut".
 */

public class copiaFichero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Fichero de entrada");
        String fileIn = scanner.next();
        File file = new File(fileIn);
        String fileOut = file.getPath().replace(file.getPath(),"nuevo.txt");

        copiaFichero(fileIn, fileOut);
        System.out.println(fileOut);
    }

    static void copiaFichero(String fileIn, String fileOut) {


        try {
            InputStream in = new FileInputStream(fileIn);
            try {
                byte[] datos = in.readAllBytes();
                in.close();

                PrintStream out = new PrintStream(fileOut);
                out.write(datos);
                out.close();
            } catch (IOException e) {
                System.out.println("Error al leer datos: " + e.getMessage());
            }

        } catch (FileNotFoundException e) {
            System.out.println("El programa da error" + e.getMessage());
        }
    }
}
