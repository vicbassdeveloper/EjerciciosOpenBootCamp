class Estudiante {
    nombre= "";
    asignaturas = ["Javascript", "HTML", "CSS"];
    obtenDatos(){
        console.log(" Mi nombre es: " + this.nombre + "\n\n Mis asignaturas son: " + this.asignaturas)
    }

    constructor (nombre, asignaturas, obtenDatos) {
        this.nombre = nombre;
        asignaturas = asignaturas;
        obtenDatos = obtenDatos;

    }
}

let Estudiante1 = new Estudiante("Victor");

Estudiante1.obtenDatos()

let Estudiante2 = new Estudiante ("Alfredo");

Estudiante2.obtenDatos()