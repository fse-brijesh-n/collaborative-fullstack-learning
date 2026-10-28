import { useState } from 'react'

import './App.css'
import User from './component/User'

function App() {
  const [count, setCount] = useState(0)

  return (
    <>
    <User name="Nikhil" age={17} isStudent={true} />
     </>
  )
}

export default App
