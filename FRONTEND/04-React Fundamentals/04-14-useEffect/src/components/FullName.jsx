
import { useState, useEffect } from 'react'
const FullName = () => {
    const [firstName, setFirstName] = useState("")
    const [lastName, setLastName] = useState("")
    const fullName = `${firstName} ${lastName}`
  return (
    <div className='container'>
       < h2>4. useEffect with Dependency Array</h2>
      <p>Full Name: {fullName}</p>
     <button onClick={() => setFirstName("khushi")}>Set First Name</button>
      <button onClick={() => setLastName("sharma")}>Set Last Name</button>

    </div>
  )
}

export default FullName
