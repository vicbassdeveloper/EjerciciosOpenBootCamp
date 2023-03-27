const boton = document.querySelector("#btn")

//console.log(boton)

boton.addEventListener("click", () => {
    // alert("Se ha hecho click")
    
    const respuesta = confirm("Seguro?")

    respuesta ? console.log("OK") :console.log("NO")


})

const botonInfo = document.querySelector("#info")
botonInfo.addEventListener("click", () => {
    const nombre = prompt("Cual es tu nombre")
    
    nombre ? console.log("Tu nombre es " + nombre) : console.log("Ingresa tu nombre")
})

const lista = [{
    nombre: "Victor",
    edad: 29
}, {
    nombre: "Julian",
    edad:30
},{
    nombre: "Andrea",
    edad:28
}]

// console.log(lista)
console.table(lista)