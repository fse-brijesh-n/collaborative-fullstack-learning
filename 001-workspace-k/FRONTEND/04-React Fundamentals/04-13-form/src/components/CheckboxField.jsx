
import { useState } from 'react'
const CheckboxField = () => {
  const[agree,setAgree] = useState(false);
  return (
    <div>
      <label>
        <input
          type="checkbox"
          checked={agree}
          onChange={(e) => setAgree(e.target.checked)}
        />
        I agree to the terms and conditions
      </label>
      <p>Agreed: {agree ? "Yes" : "No"}</p>
    </div>
  )
}

export default CheckboxField
