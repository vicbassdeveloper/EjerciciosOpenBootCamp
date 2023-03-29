const nombre = "Alejandro";

const apellido = "Aguilera";


const yo = {
    nombre: nombre, 
    apellido: apellido
}

//sessionStorage.setItem("yo", JSON.stringify(yo));
//localStorage.setItem("yo", JSON.stringify(yo));
console.log(JSON.stringify(yo))

const ahora= new Date();

//document.cookie =`${JSON.stringify(yo)}; Expires=${Date(ahora.getTime() + 2 * 60000)}`


