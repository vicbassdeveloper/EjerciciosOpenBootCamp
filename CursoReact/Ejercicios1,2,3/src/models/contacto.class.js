export class Contacto{
    nombre= '';
    apellidos= '';
    email= '';
    conectado= true;


constructor(nombre, apellidos, email, conectado){
    this.nombre = nombre;
    this.apellidos = apellidos;
    this.email = email;
    this.conectado = conectado;
}
}