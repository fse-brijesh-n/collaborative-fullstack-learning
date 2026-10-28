import { useState } from 'react'

import './App.css'
import User from './components/User'
import Student from './components/Student'
function App() {
  const [count, setCount] = useState(0)

  return (
    <>
     <User/>
<Student/>
    </>
  )
}

export default App
