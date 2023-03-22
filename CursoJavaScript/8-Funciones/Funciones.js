// Crea un archivo JS que contenga las siguientes líneas

// - Una función sin parámetros que devuelva siempre "true"

function devuelveVerdadero() {
    return true
}

console.log(devuelveVerdadero())

// - Una función asíncrona que utilice un setTimeout y pase por consola un "Hola soy una promesa" 5 segundos después de haberse ejecutado

function promesa () {
    setTimeout(() => console.log("Hola soy una promesa"), 5000)
}

promesa();



// - Una función generadora de índices pares automáticos

function* idPares() {
    let id = 0
    while(true) {
        yield id += 2
    }
}

console.log(idPares());




