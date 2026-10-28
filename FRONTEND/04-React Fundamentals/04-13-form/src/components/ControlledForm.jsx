
import { useState } from 'react'
const ControlledForm = () => {
    const [name, setName] = useState('')
  return (
    <div>
      <h2>1. Controlled Form</h2>
      <input
        type="text"
        value={name}
        onChange={(e) => setName(e.target.value)}
      />
      <p>Name: {name}</p>
    </div>
  )
}

export default ControlledForm
