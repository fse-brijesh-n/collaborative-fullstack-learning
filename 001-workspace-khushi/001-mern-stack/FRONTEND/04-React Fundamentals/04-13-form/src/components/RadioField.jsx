
import { useState } from 'react'
const RadioField = () => {
  const[gender, setGender] = useState('');
  return (
    <div>
      <h2>4. Radio Field</h2>
      <label>
        <input
          type="radio"
          name="gender"
          value="male"
          checked={gender === "male"}
          onChange={(e) => setGender(e.target.value)}
        />
        Male
      </label>
      <label>
        <input
          type="radio"
          name="gender"
          value="female"
          checked={gender === "female"}
          onChange={(e) => setGender(e.target.value)}
        />
        Female
      </label>
      <p>Selected Gender: {gender}</p>
    </div>
  )
}

export default RadioField
