import React, { useState, useEffect }from 'react';
import { LEVELS } from '../../models/levels.enum';
import { Task } from '../../models/task.class'
import TaskComponent from '../pure/task';

//Importamos la hoja de estilos de task.scss
import './../../styles/task.scss'

const TaskList = () => {

    const defaultTask = new Task( 'Example', 'Default Description', false, LEVELS.NORMAL);
    


    //Estado del componente
    const [tasks, setTasks] = useState([defaultTask]);
    const [loading, setLoading] = useState(true);

    //Control del ciclo de vida
    useEffect(() => {
        console.log("Task State has been modified")
        setLoading(false)
        return () => {
            console.log("TaskList component is gooing to unmount")
        }
    }, [tasks]);



    const changeCompleted = ( id ) => {
        console.log( 'TODO: Cambiar estado de una tarea' )
    }



    return (
        <div>
            <div>
                <h1>Tarea:</h1>
            </div>
            { /* TODO: Aplicar un For/Map para renderizar una lista*/}
            <TaskComponent task={ defaultTask }></TaskComponent>
        </div>
    );
};



export default TaskList;
