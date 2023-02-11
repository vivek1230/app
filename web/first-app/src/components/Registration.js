import React from 'react'
import "./Registration.css";
import { Link, useNavigate } from 'react-router-dom';

export default function Registration() {
    let navigate = useNavigate(); 
    const createAccount = () => {
        window.alert(
            "Created an account successfully. Please sign in to your account."
        );
        navigate('/login');
    };
    const validateUsername = ()=>{

    }
    const validateEmail = ()=>{

    }
    return (
        <div className='registration-page'>
            <form className="form" onSubmit={createAccount}>
                <div className='full-name'>
                    <div className="input-group">
                        <label className="form__label" htmlFor="firstName">First Name </label>
                        <input className="form__input" type="text" id="firstName" placeholder="First Name" />
                    </div>
                    <div className="input-group">
                        <label className="form__label" htmlFor="lastName">Last Name </label>
                        <input type="text" name="" id="lastName" className="form__input" placeholder="LastName" />
                    </div>
                </div>
                <div className="input-group">
                    <label className="form__label" htmlFor="email">Email </label>
                    <input type="email" id="email" className="form__input" placeholder="Email" onInput={validateEmail}/>
                    <div class="loader"></div>
                </div>
                <div className="input-group">
                    <label className="form__label" htmlFor="username">Username </label>
                    <input type="text" id="username" className="form__input" placeholder="Username" onInput={validateUsername}/>
                    <div class="loader"></div>
                </div>
                <div className='password'>
                <div className="input-group">
                    <label className="form__label" htmlFor="password">Password </label>
                    <input className="form__input" type="password" id="password" placeholder="Password" />
                </div>
                <div className="input-group">
                    <label className="form__label" htmlFor="confirmPassword">Confirm Password </label>
                    <input className="form__input" type="password" id="confirmPassword" placeholder="Confirm Password" />
                </div>
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
