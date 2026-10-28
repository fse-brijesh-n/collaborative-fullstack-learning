
import { useState } from 'react'
const TextareaField = () => {
    const[message, setMessage] = useState('');
  return (
    <div>
      <textarea
      rows="5"
      cols="30"
        placeholder="Message"
        value={message}
        onChange={(e) => setMessage(e.target.value)}
      />
        <p>Message: {message}</p>
    </div>
  )
}

export default TextareaField
