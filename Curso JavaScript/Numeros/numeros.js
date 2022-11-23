let alturacm = 180;
let alturam = alturacm / 100;
let peso = 85.2;
let respuesta = "";
let maxnumber = Number.MAX_VALUE;

//Una variable que contenga tu altura en centímetros (entero)
let alturaCm = console.log("Altura en centimetros: "+alturacm+"cm");

//Una variable que contenga tu altura en metros (número de coma flotante)
let alturaM = console.log("Altura en metros: "+alturam + "m");

//Una variable que contenga tu peso en kilogramos (número de coma flotante)
let pesoKg = console.log("Peso en kilogramos "+peso + "kg");

//Una variable que contenga tu altura en metros redondeada hacia arriba
let alturaRMas = console.log("ALtura en metros redondeada hacia arriba "+Math.ceil(alturam)+"m");

//Una variable que contenga tu peso en kilogramos redondeado hacia abajo
let pesoRMenos = console.log("Peso redondeado hacia abajo "+Math.round(peso)+"kg");

//Una variable que contenga si "el máximo valor que se puede obtener en Javascript + 1" es igual al máximo valor que se puede obtener en Javascript
if (maxnumber + 1 === maxnumber){
    respuesta = "es igual";
} else {
    respuesta = "no es igual"
}
let maxVal = console.log("El máximo valor que se puede obtener en Javascript + 1 " + respuesta + " al máximo valor que se puede obtener en Javascript");