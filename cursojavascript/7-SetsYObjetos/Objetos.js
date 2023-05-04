// Crea un archivo llamado objetos.js que contenga las siguientes líneas

// - Un objeto con tus datos personales (nombre, apellido, edad, altura, eresDesarrollador)

const yo = {nombre: "Victor", apellido: "Aguilera", edad: 29, altura: 1.80, eresDesarrollador: true};

// - Una variable que obtenga tu edad a partir del objeto anterior

const miEdad = yo.edad;

console.log(miEdad);

// - Una lista que contenga el objeto con tus datos personales y un nuevo objeto con los datos personales de tus dos mejores amig@s

const lista = [{...yo},
    {nombre: "Irak", apellido: "Uribe", edad: 27, altura: 1.68, eresDesarrollador: false},
    {nombre: "Alextri", apellido: "Uribe", edad: 32, altura: 1.72, eresDesarrollador: false},
    {nombre: "Jair", apellido: "Diaz", edad: 31, altura: 1.68, eresDesarrollador:false}]
console.log(lista);

// - Una nueva lista con los objetos de la lista anterior ordenados por edad, de mayor a menor

const listaOrder = lista.sort((a,b) => a.edad - b.edad);
console.log(listaOrder);