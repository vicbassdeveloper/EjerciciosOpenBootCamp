//Formas de importar /exportar modulos
//1. CommonJS - require
//2. Import ES6

//const moduloMatematicas = require("./modulo/matematicas.js")

import { suma, factorial, nombre } from './modulo/matematicas.js'
import * as moduloMatematicas from './modulo/matematicas.js'
import getAuthor from './modulo/literaturo.js'


const fact = factorial(5)
console.log(fact)

const sum = suma(22,20)
console.log(sum)

console.log(nombre)

console.log(getAuthor())
