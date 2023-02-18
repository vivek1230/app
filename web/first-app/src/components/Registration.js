import React, { useRef } from 'react'
import "./Registration.css";
import { Link, useNavigate } from 'react-router-dom';
import axios from "axios";

export default function Registration() {
    const regURL = "http://localhost:9190/firstApp/v1/{email}/signUp";
    const email = useRef("");
    const mobile = useRef("");
    const password = useRef("");
    let navigate = useNavigate();
    const createAccount = () => {
        const formData = {
            email: email.current.value,
            mobile: mobile.current.value,
            password: password.current.value
        }
        axios.post(regURL, formData).then((res)=>{
            console.log(res);
        });
        alert("User registered successfully");
        navigate('/login');
    };
    const validateUsername = () => {

    }
    const validateEmail = () => {

    }
    return (
        <div className='registration-page'>
            <form className="form" onSubmit={createAccount}>
                <div className="input-group">
                    <label className="form__label" htmlFor="email">Email </label>
                    <input type="email" id="email" ref={email} className="form__input" placeholder="Email" onInput={validateEmail} />
                    <div className="loader"></div>
                </div>
                <div className="input-group">
                    <label className="form__label" htmlFor="phone">Mobile Number </label>
                    <input type="phone" id="phone" ref={mobile} className="form__input" placeholder="Mobile Number" onInput={validateEmail} />
                    <div className="loader"></div>
                </div>
                <div className="input-group">
                    <label className="form__label" htmlFor="password">Password </label>
                    <input className="form__input" type="password" id="password" placeholder="Password" />
                    <div className="blank"></div>
                </div>
                <div className="input-group">
                    <label className="form__label" htmlFor="confirmPassword">Confirm Password </label>
                    <input className="form__input" ref={password} type="password" id="confirmPassword" placeholder="Confirm Password" />
                    <div className="blank"></div>
                </div>
                <div className="footer">
                    <button type="submit" className="primary">Register</button>
                </div>
            </form>
            <div className="createAccount">
                Already have an account?<span><Link to="/login"> Sign In</Link> </span>
            </div>
        </div>
    )
}
