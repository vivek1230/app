import React, { useState } from "react";
import Login from "./Login";
import "./Home.css";

export default function Home() {
  const [show, isShow] = useState(false);
  const onclick = () => {
    isShow(true);
  };

  const createAccount = () => {
    window.alert(
      "Created an account successfully. Please sign in to your account."
    );
  };
  if (show) {
    return (
      <div className="loginPopup">
        <Login />
      </div>
    );
  } else {
    return (
      <div className="buttonContainer">
        <button className="box" onClick={onclick}>
          Sign In
        </button>
        <div className="createAccount">
          <p>
            Not have account?<span onClick={createAccount}> Sign Up</span>
          </p>
        </div>
      </div>
    );
  }
}
