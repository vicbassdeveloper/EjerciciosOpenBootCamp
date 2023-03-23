function Fibonacci(num) {
    (num === 1) ? [1] : [1,1]
    let numeros = [1,1]
    for(let i = 2; i < num; i++) {
         numeros.push(numeros[i-1]+numeros[i-2])
    }
    return numeros
}
        
console.log(Fibonacci(6))