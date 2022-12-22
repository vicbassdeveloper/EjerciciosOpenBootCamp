// Crea un archivo llamado conjuntos.js que contenga las siguientes líneas

// - Un nuevo Set con los nombres de tu familia

const nombresFamilia = new Set (["Carmen", "Karla", "Vero", "Miguel", "Salma", "Mary", "Isa", "Mauricio", "Fausto", "Hugo", "Oscar" ]);

console.log(nombresFamilia);

// - Modifica el Set original añadiendo tu nombre (duplicado) (debería darte lo mismo)

nombresFamilia.add("Victor");

console.log(nombresFamilia);

// - Modifica el Set original añadiendo el nombre "Javascript" (ya que empieza a formar parte de tu vida ;)

nombresFamilia.add("JavaScript");

console.log(nombresFamilia);