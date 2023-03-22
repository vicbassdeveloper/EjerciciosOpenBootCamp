const miFuncion = val => {
    if (typeof val === "number") {
        return 2 * val
    }
    //return false;
    //Asi se manipulan los errores:

    throw new Error("El valor debe ser de tipo numero")
}

//console.log(miFuncion("ala"))

//const elDoble = miFuncion("ala")
const numero = "8";

try{
    //codigo que puede fallar(try = intenta este bloque)
    //Si en este bloque todo sale bien ejecuta:
    console.log("Esta ejecutandose de manera correcta")
    constdoble_= miFuncion(numero)
    console.log(doble);
} catch(e) {
    //Si falla try se ejecuta catch que es cuando sucede un error en try por lo cual aqui se manipula el error
    console.error("El error es: " + e)
    console.log("ERROR!")
}   finally {
    // Se ejecuta si el try es correcto o no
    console.log("Final del codigo")
}