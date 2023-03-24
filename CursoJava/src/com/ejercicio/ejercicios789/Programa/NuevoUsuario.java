package com.ejercicio.ejercicios789.Programa;
import com.ejercicio.ejercicios789.Programa.Usuario;
import java.util.*;
import java.io.*;

public class NuevoUsuario {

    public static void main(String[] args) {

        ArrayList<String> listaNombres = new ArrayList<>();
        ArrayList<String> listaApellidos = new ArrayList<>();
        ArrayList<Integer> listaEdades = new ArrayList<>();
        ArrayList<String> listaCorreos = new ArrayList<>();
        ArrayList<String> listaContraseñas = new ArrayList<>();

        Usuario usuario = new Usuario();
        Scanner scanner = new Scanner(System.in);
        Scanner numero = new Scanner(System.in);
        Scanner caracter = new Scanner(System.in);
        String ruta = "/home/alejandro/Documentos/PruebasJava/";
        System.out.println("Nombre del nuevo fichero");
        String nombreFichero = scanner.nextLine() + ".txt";


        System.out.println("Este programa genera un archivo .txt de usuarios en listas 'nombres', 'apellidos', 'edades', 'correo' y 'contraseñas' ");
        System.out.println("Deseas agregar un usuario?");
        Character pregunta = caracter.next().charAt(0);
        System.out.println(pregunta);


        while (pregunta == 'y' || pregunta == 'Y') {


            System.out.println("Nombre:");
            String nombre = scanner.nextLine();
            usuario.setNombre(nombre);
            listaNombres.add(nombre);

            System.out.println("Apellidos:");
            String apellidos = scanner.nextLine();
            usuario.setApellidos(apellidos);
            listaApellidos.add(apellidos);

            System.out.println("Edad");
            int edad = numero.nextInt();
            usuario.setEdad(edad);
            listaEdades.add(edad);

            System.out.println("Email");
            String email = scanner.nextLine();
            usuario.setEmail(email);
            listaCorreos.add(email);

            System.out.println("Contraseña");
            String contraseña = scanner.nextLine();
            usuario.setContraseña(contraseña);
            listaContraseñas.add(contraseña);

            System.out.println("Deseas agregar un nuevo usuario?");
            pregunta = caracter.next().charAt(0);


        }


        try {
            PrintStream  out = new PrintStream(ruta+nombreFichero);
            out.println("Estas son las listas de usuarios creadas");
            out.println("Lista nombres:" + listaNombres);
            out.println("Lista Apellidos:" + listaApellidos);
            out.println("Lista Edades:" + listaEdades);
            out.println("Lista Correos:" + listaCorreos);
            out.println("Lista Contraseñas:" + listaContraseñas);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }




        System.out.println("Estas son las listas de usuarios creadas");
        System.out.println("Lista nombres:" + listaNombres);
        System.out.println("Lista Apellidos:" + listaApellidos);
        System.out.println("Lista nombres:" + listaEdades);
        System.out.println("Lista nombres:" + listaCorreos);
        System.out.println("Lista nombres:" + listaContraseñas);

        System.out.println("El programa ha finalizado");

    }
}