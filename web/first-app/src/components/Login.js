import React from 'react'
import { Link } from 'react-router-dom';
import "./Login.css";

export default function Login() {
  const handleSubmit = e => {
    e.preventDefault();
    console.log(e.target.username.value);

    if (!e.target.username.value) {
      alert("Email is required");
    } else if (!e.target.username.value) {
      alert("Valid email is required");
    } else if (!e.target.password.value) {
      alert("Password is required");
    } else if (
      e.target.username.value === "clearinsight" &&
      e.target.password.value === "123456"
    ) {
      alert("Successfully logged in");
      e.target.username.value = "";
      e.target.password.value = "";
    } else {
      alert("Wrong email or password combination");
    }
  };

  const handleClick = e => {
    e.preventDefault();
    alert("Goes to registration page");
  };
  
  return (
    <div className='loginPage'>
      <form className="form" onSubmit={handleSubmit}>
        <div className="input-group">
          <label htmlFor="email">Username</label>
          <input type="text" name="username" placeholder="Enter Username" />
        </div>
        <div className="input-group">
          <label htmlFor="password">Password</label>
          <input type="password" name="password" placeholder="Enter Password"/>
        </div>
        <button type='submit' className="primary">Login</button>
      </form>
      <div className="createAccount">
        Not have an account?<span><Link to="/registration"> Sign Up</Link> </span>
      </div>
    </div>
  )
}
