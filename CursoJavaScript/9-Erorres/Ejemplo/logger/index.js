/**
 * Con winston podemos crear ficheros de errores
 */

const winston = require('winston');

const logger = winston.createLogger({
    /**
     * Los niveles debajo de level son los que gestionara
     */
  level: 'debug',
  format: winston.format.json(),
  defaultMeta: { service: 'user-service' },

  /**Todas las acciones que se ejecutaran despues de un log */
  transports: [
    //
    // - Write all logs with importance level of `error` or less to `error.log`
    // - Write all logs with importance level of `info` or less to `combined.log`
    //
    /**Nos mostrara los bugs por pantalla */
    new winston.transports.Console(),
    new winston.transports.File({ filename: 'error.log', level: 'error' }),
    new winston.transports.File({ filename: 'combined.log' }),
  ],
});

module.exports = logger;



//Esto no existe en winston:
//logger.log("Hola estoy saliendo por pantalla")

//Esto se puede crear en winston:
/*
logger.info("Esto es un mensaje informativo")
logger.warn("Esto es un mensaje de advertencia")
logger.debug("Esto es un mensaje de debug")
logger.error("Esto es un mensaje de error")
*/