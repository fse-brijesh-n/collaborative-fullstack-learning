import { useState } from 'react'
import './App.css'
import List from './components/List'
function App() {
  const [count, setCount] = useState(0)

  return (
    <>
    <h1>My List</h1>
     <List/>
    </>
  )
}

export default App
