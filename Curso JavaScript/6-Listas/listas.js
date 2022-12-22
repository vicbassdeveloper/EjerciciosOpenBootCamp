// Crea un archivo JS que contenga las siguientes líneas


// Una variable que contenga la lista de la compra (mínimo 5 elementos)
const listadecompra = ["Pan", "Leche", "Refresco", "Agua", "Cafe"];

// Modifica la lista de la compra y añádele "Aceite de Girasol"
listadecompra.push("Aceite de Girasol");

console.log(listadecompra);

// Vuelve a modificar la lista de la compra eliminando "Aceite de Girasol"
listadecompra.pop();

console.log(listadecompra);

// Una lista de tus 3 películas favoritas (objetos con propiedades: titulo, director, fecha)

const peliculasfavoritas = [
    {titulo: "Replicas", director: "Jeffrey Nachmanoff", fecha: 2019}, 
    {titulo: "Untraceable", director: " Gregory Hoblit", fecha: 2008}, 
    {titulo: "Halloween", director: "John Carpenter", fecha: 1978}
];


// Una nueva lista que contenga las películas posteriores al 1 de enero de 2010 (utilizando filter)

const peliculasnuevas = peliculasfavoritas.filter(pelicula => pelicula.fecha >= 2010 );

console.log(peliculasnuevas);


// Una nueva lista que contenga los directores de la lista de películas original (utilizando map)

const directores = peliculasfavoritas.map(peliculas => peliculas.director);

console.log(directores);


// Una nueva lista que contenga los títulos de la lista de películas original (utilizando map)

const titulos = peliculasfavoritas.map(peliculas => peliculas.titulo);

console.log(titulos);


// Una nueva lista que concatene la lista de directores y la lista de los títulos (utilizando concat)

const peliculaTYDCon = directores.concat(titulos)

console.log(peliculaTYDCon)


// Una nueva lista que concatene la lista de directores y la lista de los títulos (utilizando el factor de propagación)

const peliculaTYDProp = [...directores, ...titulos]

console.log(peliculaTYDProp)

