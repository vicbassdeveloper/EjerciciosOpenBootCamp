let nombre = "Alejandro";
let apellido = "Aguilera";
let estudiante = nombre.concat(" ", apellido);

console.log("Mi nombre es ".concat (estudiante));

let estudianteMayus = estudiante.toUpperCase();
console.log("Mi nombre en mayusculas es " + estudianteMayus);

let estudianteMinus = estudiante.toLocaleLowerCase();
console.log("Mi nombre en minusculas es " + estudianteMinus);

let numEstudiante = estudiante.length;
console.log("El numero de caracteres de mi nombre es " + numEstudiante);

let inicialNombre = nombre[0];
console.log("La inicial de mi nombre es " + inicialNombre);

let ultimaApellido = apellido[apellido.length-1];
console.log("La ultima letra de mi apellido es " + ultimaApellido);

let estudianteSinEspacio = estudiante.replace(/ /g, "");
console.log(estudianteSinEspacio);

let nombreEnEstudiante = incluyePalabra(nombre);
nombreEnEstudiante;

function incluyePalabra(palabra) {
if (estudiante.includes(palabra)) {
    console.log(nombre + " esta en variable estudiante");
}
else {
    console.log(nombre + " no esta en variable estudiante");
} }