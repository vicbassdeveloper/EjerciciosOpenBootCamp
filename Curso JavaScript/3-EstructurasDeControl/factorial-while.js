numero = 1;
factorial = numero;


while (numero <= 10) {
    factorial = factorial * numero;
    console.log("El factorial de ", + numero + " es", + factorial );
    numero++;
}