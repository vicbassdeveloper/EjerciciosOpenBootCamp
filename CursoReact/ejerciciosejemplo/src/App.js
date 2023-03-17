import logo from './logo.svg';
import Greetingf from './components/pure/greetingf'
import './App.css';

function App() {
  return (
    <div className="App">
      <header className="App-header">
        <img src={logo} className="App-logo" alt="logo" />
        <Greetingf name="Victor"></Greetingf>
        </header>
    </div>
  );
}

export default App;
