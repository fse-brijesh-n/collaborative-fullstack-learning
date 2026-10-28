import React from 'react'
import { useState } from 'react'
const NumberState = () => {
    const[num,setNum]=useState(1234)
  return (
   <>
   <h1>{num}</h1>
   </>
  )
}

export default NumberState
