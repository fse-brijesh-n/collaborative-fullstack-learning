import React from 'react'
import { useState } from "react"
const BooleanState = () => {
    const[isLogedin,setIsLogedIn]=useState(false)
  
  return (
    <>
    <h1>{isLogedin? <h1>user logedin</h1>:"not logedin"}</h1>
    </>
  )
}

export default BooleanState
