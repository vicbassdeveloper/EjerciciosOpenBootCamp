numero = 1;
factorial = numero;


while (true) {
    factorial = factorial * numero;
    console.log("El factorial de ", + numero + " es", + factorial );
    numero++;  
    if (numero > 10) {
        break;
    }
}