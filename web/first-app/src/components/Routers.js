import React, { useContext, useEffect } from 'react'
import { BrowserRouter, Routes, Route, Link, useLocation, useNavigate } from "react-router-dom";
import Home from './Home';
import Login from './Login';
import Registration from './Registration';


export default function Routers() {
    const location = useLocation();
    let navigate = useNavigate();
    useEffect(() => {
        if(location.pathname === "/"){
            navigate('/login');
        }
    }, []);
    return (
        <Routes>
            <Route exact path='/login' component={Login} element={<Login />}></Route>
            <Route path="/registration" element={<Registration />}></Route>
            <Route path="/home" element={<Home />}></Route>
        </Routes>
    )
}
