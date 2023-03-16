import React from 'react';
import PropTypes from 'prop-types';
import { useState } from 'react';


const Componenteb = (estado) => {

    const[conectado, setConectado] = useState(estado);

    return (
        <div>
            <h3>
                {conectado === false ? 'No Disponible' : 'Disponible'}
            </h3>
            <button onClick={()=> setConectado(!conectado)} ><strong> {conectado ? 'Desconectar' : 'Conectar'} </strong></button>
        </div>
    );
};


Componenteb.propTypes = {
    estado: PropTypes.bool,
};


export default Componenteb;
