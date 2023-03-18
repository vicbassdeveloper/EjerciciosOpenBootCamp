/**
 * Ejemplo de uso del hook useState
 * 
 * Crear un componente de tipo funcion y acceder a su estado 
 * 
 * privado a traves de un hook, ademas, poder modificarlo
 * 
 */

import React, { useState } from 'react';

const Ejemplo1 = () => {
    
    //Valor inicial para un contador

    const valorInicial = 0;

    //Valor inicial para una persona

const personaInicial = {
    nombre: "Victor",
    email: 'ejemplo@ejemplo.com'
}

/**
 * 
 * VALOR INICIAL y PERSONAINICIALdebe ser parte del estado
 * del componente para poder gestionar su cambio y que se vea reflejado en la vista del componente
 * 
 * const [nombreVariable, funcionParaCambiar] = useState(valorInicial)
 */
    
const [contador, setContador] = useState(valorInicial);
const [persona, setPersona] = useState(personaInicial);

//Se debe doscumentar las funciones, primero se declaran y encima se documentan del siguiente modo:

/**
 * Funcion para actualizar el estado privado que contiene el contador
 */

function incrmentarContador(){
    //? funcionParaCambir(nuevoValor)
    setContador(contador + 1);
}


/**
 * Funcion para actualizar el estado privado que contiene persona
 */

function actuallizarPersona() {
    setPersona(
        {
            nombre: 'Pepe',
            email: 'ejemplo2@ejemplo.com'
        }
    )
}
    
    return (
        <div>
            <h1>Ejemplo de useState() </h1>
            <h2>Contador: { contador }</h2>
            <h2>Datos de la persona: </h2>
            <h3>Nombre: { persona.nombre}</h3>
            <h3>Email: { persona.email }</h3>
            { /* Bloque de botones para actualizar el estado de los componentes*/}
            <button onClick={incrmentarContador}>Incrementar contador</button>
            <button onClick={actuallizarPersona}>Actualizar Persona</button>
        </div>
    );
}

export default Ejemplo1;
