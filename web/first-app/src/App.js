import './App.css';
import Home from './components/Home';

function App() {
  return (
    <div className="App">
      <div className='appName'>Shopping App</div>
      <span>Welcome to our page</span>
      <div className='homeButtons'>
        <Home/>
      </div>
    </div>
  );
}

export default App;
