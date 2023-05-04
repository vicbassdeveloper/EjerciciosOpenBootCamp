import React, { Component } from 'react';
import PropTypes from 'prop-types';

class lifeCycleExample extends Component {
    constructor(props) {
        super(props);
            console.log('CONSTRUCTOR: Cuando se instancia el componente')
    }

    componentWillMount() {
        console.log('WILLMOUNT: Antes del montaje del componente')
    }

    componentDidMount() {
        console.log('DIDMOUNT:Antes de Renderizar el componente, al momento del montaje del componente')

    }

    componentWillReceiveProps(nextProps) {
        console.log('WILLRECIVEPROPS: Si va a recibir nuevas props')

    }

    shouldComponentUpdate(nextProps, nextState) {
        /**
         * Controlar si el componente debe o no actualizarse
         */
        //Return true / false

    }

    componentWillUpdate(nextProps, nextState) {
        console.log('WILLUPDATE: Justo antes de actualizarse')

    }

    componentDidUpdate(prevProps, prevState) {
        console.log('WILLUPDATE: Justo despues de actualizarse')

    }

    componentWillUnmount() {
        console.log('WILLUNMOUNT: Justo antes de desaparecer')

    }

    render() {
        return (
            <div>

            </div>
        );
    }
}

lifeCycleExample.propTypes = {

};

export default lifeCycleExample;