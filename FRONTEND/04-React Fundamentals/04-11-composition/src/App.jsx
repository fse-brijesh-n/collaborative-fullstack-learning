import { useState } from 'react'
import './App.css'
import Card from './components/Card'
import Layout from './components/Layout'
import Profile from './components/Profile'

function App() {
  const [count, setCount] = useState(0)

  return (
    <>
     <Card>
      <h3>Student Information</h3>
      <p>Name: Nikhil</p>
      <p>Age: 17</p>
     </Card>
     <Layout/>
     <Profile name="khushi" age={21} qualification="MCA" />
    </>
  )
}

export default App
