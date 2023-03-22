import { suma, multiplica } from './module/Ccontroller.js';
import chalk from 'chalk';


let sumar = suma(1,2);
let multiplicar = multiplica(4,5);

console.log(sumar);
console.log(chalk.green(multiplicar));
