//Formas de importar /exportar modulos
//1. CommonJS - require
//2. Import ES6

//const moduloMatematicas = require("./modulo/matematicas.js")

const { factorial, suma } = require("./modulo/matematicas.js");

const fact = factorial(5);

console.log(fact);

const sum = suma(22,20);

console.log(sum);