import "./App.css";
import Header from "./components/Header";
import Login from "./components/Login";
import { BrowserRouter, Routes, Route } from "react-router-dom";
import Registration from "./components/Registration";
import Home from "./components/Home";

function App() {
  return (
    <div className="App">
      <Header />
      <BrowserRouter>
        <Routes>
          <Route path="/login" element={<Login />}>
            {/* <Route index element={<Home />} />
            <Route path="blogs" element={<Blogs />} />
            <Route path="contact" element={<Contact />} />
            <Route path="*" element={<NoPage />} /> */}
          </Route>
          <Route path="/registration" element={<Registration/>}></Route>
          <Route path="/home" element={<Home/>}></Route>
        </Routes>
      </BrowserRouter>

      {/* <Login /> */}
    </div>
  );
}

export default App;
