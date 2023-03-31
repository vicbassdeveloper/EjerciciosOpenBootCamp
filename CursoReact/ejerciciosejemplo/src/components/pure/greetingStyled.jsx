import React, {useState} from "react";

// Definiendo estilos en constantes

// ? Estilo para usuario loggeado
const loggedStyle = {
    color: 'white'
};

// ? Estilo para usuario loggeado
const unloggedStyle = {
    color: 'tomato',
    fontWeight: 'bold'
}


const GreetingStyled = (props) => {
// Generamos un estado para el componente 
// Y asi controlar si el usuario esta loggeado o no

const [logged, setLogged] = useState(false);

const greetingUser = <p>Hola, {props.name} </p>
const pleaseLoggin = <p>Please loggin </p>


    return (
        <div style={ logged ? loggedStyle : unloggedStyle}>
            { logged ? greetingUser : pleaseLoggin }
            <button onClick={() => {
                console.log('boton pulsado')
                setLogged(!logged);
            }}>
                { logged ? 'Logout' : 'Login' }
            </button>
        </div>
    );
}


export default GreetingStyled;
