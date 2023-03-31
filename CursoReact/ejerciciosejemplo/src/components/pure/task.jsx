import React, { useEffect } from 'react'
import PropTypes from 'prop-types'
import { Task } from '../../models/task.class'

// Importamos la hoja de estilos de tsak.css
import './../../styles/task.scss'

function TaskComponent ({ task }) {

  useEffect(() => {
    console.log("Tarea creada")
    return () => {
      console.log("Task:" +task.name +"is gooing to")
    };
  }, [task]);

  return (
    <div>
      <h2 className='task-name'>
        Nombre: { task.name }
      </h2>
      <h3>
        Descripcion: { task.description }
      </h3>
      <h4>
        Nivel: { task.level }
      </h4>
      <h5>
        La tarea esta: { task.completed ? 'COMPLETADA' : 'PENDIENTE' }
      </h5>
    </div>
  )
}

TaskComponent.propTypes = {
    task: PropTypes.instanceOf( Task )
}

export default TaskComponent

