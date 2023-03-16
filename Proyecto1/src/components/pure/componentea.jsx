import React from 'react';
import PropTypes from 'prop-types';
import { Contacto } from '../../models/contacto.class';
import Componenteb from './componenteb';


const Componentea = ({ contacto }) => {
    return (
        <div>
            <h1>Contacto</h1>
                <h3>Nombre: { contacto.nombre } </h3>
                <h3>Apellidos: { contacto.apellidos } </h3>
                <h3>Correo: { contacto.email } </h3>
                <Componenteb>conectado: { false } </Componenteb>
        </div>
    );
};


Componentea.propTypes = {
    contacto: PropTypes.instanceOf(Contacto),
};


export default Componentea;
