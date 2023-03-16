import logo from './logo.svg';
import './App.css';
//import Greeting from './components/pure/greeting';
//import Greetingf from './components/pure/greetingf';
//import TaskListComponent from './components/container/task_list';
import Componentea from './components/pure/componentea';

function App() {
  const contacto = {
    nombre: 'Victor',
    apellidos: 'Aguilera',
    email: 'pruebas@prueba.com',
    conectado: false,
  };
  return (
    <div className="App">
      <header className="App-header">
        <img src={logo} className="App-logo" alt="logo" />

        { /*<Greetingf name="Victor"></Greetingf> */}
        <Componentea contacto={contacto}></Componentea>       
      </header>
    </div>
  );
}

export default App;
