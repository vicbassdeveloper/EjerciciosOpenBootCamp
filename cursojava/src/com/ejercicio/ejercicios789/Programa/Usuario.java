package com.ejercicio.ejercicios789.Programa;

public class Usuario {
    protected String nombre;
    protected String apellidos;
    protected int edad;
    protected String email;
    protected String contraseña;

    public String setNombre(String nuevoNombre) {
        nombre = nuevoNombre;
        return nombre;
    }

    public String setApellidos(String nuevosApellidos) {
        apellidos = nuevosApellidos;
        return apellidos;
    }

    public int setEdad(int nuevaEdad) {
        edad = nuevaEdad;
        return edad;
    }

    public String setEmail(String correo) {
        email = correo;
        return email;
    }

    public String setContraseña(String ncontraseña) {
        contraseña = ncontraseña;
        return contraseña;
    }

    public Usuario() {

    }

    public Usuario(String nombre, String apellidos, int edad,String email, String contraseña) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;   //
        this.email = email;
        this.contraseña = contraseña;
    }

}

