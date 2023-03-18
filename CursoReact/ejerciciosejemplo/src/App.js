import logo from './logo.svg';
//import Greetingf from './components/pure/greetingf'
//import Ejemplo1 from './hooks/Ejemplo1';
import './App.css';
import Ejemplo2 from './hooks/ejemplo2';

function App() {
  return (
    <div className="App">
      <header className="App-header">
        <img src={logo} className="App-logo" alt="logo" />
        { /* <Greetingf name="Victor"></Greetingf> */ }
        {/* <Ejemplo1></Ejemplo1> */}
        <Ejemplo2></Ejemplo2>
        </header>
    </div>
  );
}

export default App;
