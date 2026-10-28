import React from 'react'
import { useState } from 'react'
const ObjectState = () => {
    
const [user, setUser] = useState({
  name: "Brijesh",
  age: 24,
  city: "Varanasi"
});

return (
  <div>
    <h1>{user.name}</h1>
    <p>Age: {user.age}</p>
    <p>City: {user.city}</p>
  </div>
);
}

export default ObjectState
