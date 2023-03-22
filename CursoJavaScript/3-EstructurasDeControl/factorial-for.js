numero = 1;
factorial = numero;

for (let i = 0; i <= 10; i++) {
    
    //console.log(numero, factorial)
    
    factorial = factorial * numero;
    console.log("El factorial de ", + numero + " es", + factorial );
    numero++;
}