import React, { useRef } from 'react';
import "./Login.css";
import { Link, useNavigate } from 'react-router-dom';
import axios from "axios";

export default function Login() {
  const email = useRef("");
  const password = useRef("");
  let navigate = useNavigate();
  const handleSubmit = e => {
    e.preventDefault();
    // console.log(e.target.username.value);

    // if (!e.target.username.value) {
    //   alert("Username is required");
    // } else if (!e.target.username.value) {
    //   alert("Valid username is required");
    // } else if (!e.target.password.value) {
    //   alert("Password is required");
    // } else if (
    //   e.target.username.value === "clearinsight" &&
    //   e.target.password.value === "123456"
    // ) {
    //   alert("Successfully logged in");
    //   e.target.username.value = "";
    //   e.target.password.value = "";

    const formData = {
      email: email.current.value,
      password: password.current.value
    }
    const regURL = `http://localhost:9190/firstApp/v1/${email}/signIn/${password}`;

    // http://localhost:9190/firstApp/v1/dheeru%40gmail.com/signIn/Dheeru%40123
    axios.post(regURL, formData).then((res) => {
      console.log(res);
      alert("User logged in successfully");
      navigate('/register');
    });
  };

  const handleClick = e => {
    e.preventDefault();
    alert("Goes to registration page");
  };

  return (
    <div className='loginPage'>
      <form className="form" onSubmit={handleSubmit}>
        <div className="input-group">
          <label htmlFor="email">Email</label>
          <input type="email" ref={email} name="email" placeholder="Enter Username" />
        </div>
        <div className="input-group">
          <label htmlFor="password">Password</label>
          <input type="password" ref={password} name="password" placeholder="Enter Password" />
        </div>
        <button type='submit' className="primary">Login</button>
      </form>
      <div className="createAccount">
        Not have an account?<span><Link to="/registration"> Sign Up</Link> </span>
      </div>
    </div>
  )
}
