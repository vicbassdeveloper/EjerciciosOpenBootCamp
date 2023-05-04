import React, { Component, useState, useEffect } from 'react'



const Clock = () => {

    const fecha = new Date()

    const defaultState = {
        // Se genera una fecha como estado inicial del componente
        fecha: fecha,
        edad: 0,
        nombre: 'Martín',
        apellidos: 'San José'
     };

    const [datos, setDatos] = useState(defaultState);

    useEffect(() => {
       const intervalAge = setInterval(() => {
            datosActualizar();
       }, 1000);
       return () => {
        clearInterval(intervalAge)
    };
    });

    const datosActualizar = () => {
        return setDatos({
        fecha: fecha,
        edad: datos.edad + 1,
        nombre: datos.nombre,
        apellidos: datos.apellidos
    })
    }

    return (
        <div>
        <h2>
        Hora Actual:
        {datos.fecha.toLocaleTimeString()}
        </h2>
        <h3>{datos.nombre} {datos.apellidos}</h3>
        <h1>Edad: {datos.edad}</h1>
        </div>
    );
}


/*

class Clock extends Component {
   constructor(props) {
      super(props);
      // Estado privado del component
      this.state = {
         // Se genera una fecha como estado inicial del componente
         fecha: new Date(),
         edad: 0,
         nombre: 'Martín',
         apellidos: 'San José'
      };
   }
   componentDidMount(){
      this.timerID = setInterval (
         () => this.tick(), 1000
      );
   }
   componentWillUnmount() {
      clearInterval (this.timerID);
   }
   render() {
      return (
         <div>
         <h2>
         Hora Actual:
         {this.state.fecha.toLocaleTimeString()}
         </h2>
         <h3>{this.state.nombre} {this.state.apellidos}</h3>
         <h1>Edad: {this.state.edad}</h1>
         </div>
      )
   }
   tick(){
      this.setState((prevState) => {
         let edad = prevState.edad +1;
         return {
            ...prevState,
            fecha: new Date(),
            edad
         }
      });
   }
}
*/
export default Clock

