import logo from './logo.svg';
import './App.css';
import Micomponente from './Micomponente';
function App() {
  return (
    <div className="App">
      <header className="App-header">
        <img src={logo} className="App-logo" alt="logo" />
        <p>
          Hola esta es mi primera pagina en React 
        </p>
       
    
        {//Con las llaves se puede utilizar javascript
        //Se agrega mi primer componente => Micomponente()
        }
      
      <Micomponente/> 
      <Micomponente/> 
      <Micomponente/> 
      <Micomponente/> 
      </header>
      
    </div>
  );
}

export default App;
