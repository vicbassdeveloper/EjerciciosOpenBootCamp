import React from 'react';
import { LEVELS } from '../../models/levels.enum';
import { Task } from '../../models/task.class'
import TaskComponent from '../pure/task';

const TaskList = () => {

    const dafeultTask = new Task( 'Example', 'Default Description', false, LEVELS.NORMAL);

    const changeState = ( id ) => {
        console.log( 'TODO: Cambiar estado de una tarea' )
    }



    return (
        <div>
            <div>
                Tarea:
            </div>
            { /* TODO: Aplicar un For/Map para renderizar una lista*/}
            <TaskComponent task={ dafeultTask }></TaskComponent>
        </div>
    );
};



export default TaskList;
