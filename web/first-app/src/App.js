import "./App.css";
import Header from "./components/Header";
import Login from "./components/Login";
import { BrowserRouter, Routes, Route, Link } from "react-router-dom";
import Registration from "./components/Registration";
import Home from "./components/Home";
import Routers from "./components/Routers";

function App() {
  return (
    <div className="App">
      <Header />
      <BrowserRouter>
        <Routers />
      </BrowserRouter>
    </div>
  );
}

export default App;
