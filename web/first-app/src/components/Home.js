import React from 'react'

export default function Home() {

    const onclick = ()=>{
        window.alert("Sign In Successful");
    }

    const createAccount = ()=>{
        window.alert("Created an account successfully. Please sign in to your account.");
    }
  return (
    <div className='buttonContainer'>
        <button className='box' onClick={onclick}>Sign In</button>
        <div className='createAccount'>
            <p>Not have account?<span onClick={createAccount}> Sign Up</span></p>
        </div>
    </div>
  )
}
