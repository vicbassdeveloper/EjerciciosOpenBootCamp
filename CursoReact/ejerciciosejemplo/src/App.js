import logo from './logo.svg';
//import Greetingf from './components/pure/greetingf'
//import Ejemplo1 from './hooks/Ejemplo1';
import './App.css';
//import Ejemplo2 from './hooks/ejemplo2';
//import { Task } from './models/task.class';
//import TaskList from './components/container/task_list';
import GreetingStyled from './components/pure/greetingStyled';

function App() {
  return (
    <div className="App">
      <header className="App-header">
        <img src={logo} className="App-logo" alt="logo" />
        { /* <Greetingf name="Victor"></Greetingf> */ }
        {/* <Ejemplo1></Ejemplo1> */}
        {/* <Ejemplo2></Ejemplo2> */}
        {/* <TaskList></TaskList> */}
        <GreetingStyled name="Martin"></GreetingStyled>
        </header>
    </div>
  );
}

export default App;
