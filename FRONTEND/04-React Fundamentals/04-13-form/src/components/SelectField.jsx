
import { useState } from 'react'
const SelectField = () => {
    const[city, setCity] = useState('');
  return (
    <div>
        <h2>4. Select Field</h2>
      <select value={city} onChange={(e) => setCity(e.target.value)}>
        <option value="">Select a city</option>
        <option value="New York">New York</option>
        <option value="Los Angeles">Los Angeles</option>
        <option value="Chicago">Chicago</option>
      </select>
      <p>Selected City: {city}</p>
    </div>
  )
}

export default SelectField
