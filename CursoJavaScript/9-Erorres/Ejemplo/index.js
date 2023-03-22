const logger = require ('./logger')



//Esto no existe en winston:
//logger.log("Hola estoy saliendo por pantalla")

//Esto se puede crear en winston:
logger.info("Esto es un mensaje informativo")
logger.warn("Esto es un mensaje de advertencia")
logger.debug("Esto es un mensaje de debug")
logger.error("Esto es un mensaje de error")
