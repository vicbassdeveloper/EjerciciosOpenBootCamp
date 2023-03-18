/**
 * Ejemplo de uso de los siguientes hooks
 * -- useState()
 * -- useRef()
 * -- useEeffect()
 */

import React, { useState, useRef, useEffect } from 'react';

const Ejemplo2 = () => {

    // Creamos dos contadores distintos
    // cada uno con estado diferente
    const [contador1, setContador1] = useState(0);
    const [contador2, setContador2] = useState(0);

    //Creamo una referencia con useRef() para asociar una variable
    //con un elemento del DOM del componente (vista HTML)

    const miRef = useRef();

    function incrementar1(){
        setContador1(contador1 + 1)
    }

    function incrementar2(){
        setContador2(contador2 + 1)
    }

    /**
     *Trabajando con useEffect
     */

     /**
      * Caso 1 ejjecutar siempre un snippet de codigo
      * Cada vez que haya un cambio en el estado del componente
      * se ejecuta aquello que este dentro del useEffect
      */

     useEffect(() => {
        console.log('Cambio en ek estado del componente');
        console.log('Mostrando Referencia a elemento del DOM');
        console.log(miRef)
                    })

    return (
        <div>
            <h1>Ejemplo de useState(), useRef(), y useEffect() </h1>
            <h2>Contador1: { contador1 }</h2>
            <h2>Contador2: { contador2 }</h2>
            { /* Elemento Referenciado */ }
            <h4 ref={ miRef }>
                Ejemplo de elememto referenciado
            </h4>
                {/* Botones para cambiar el estado de los contadores */ }
                <button onClick={ incrementar1 }>Incrementar1</button>
                <button onClick={ incrementar2}>Incrementar2</button>
            <div>
                
            </div>
        </div>
    );
}

export default Ejemplo2;
