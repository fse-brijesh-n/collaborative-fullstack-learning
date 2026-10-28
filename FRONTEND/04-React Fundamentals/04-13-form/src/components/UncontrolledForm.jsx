
import { useRef } from 'react';
const UncontrolledForm = () => {
    const nameRef = useRef(null);
    const handleSubmit = (e) => {
        e.preventDefault();
        console.log("name:", nameRef.current.value);
    }
  return (
    <div>
      <h2>2. Uncontrolled Form</h2>
      <form onSubmit={handleSubmit}>
        <input type="text" placeholder="Enter your name" ref={nameRef} />
        <button type="submit">Submit</button>
      </form>
    </div>
  )
}

export default UncontrolledForm
