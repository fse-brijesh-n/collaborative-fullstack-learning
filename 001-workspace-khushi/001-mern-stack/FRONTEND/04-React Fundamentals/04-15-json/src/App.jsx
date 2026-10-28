import { useState } from 'react'

import './App.css'
import StudentList from './component/StudentList'
import ApiUsers from './component/ApiUsers'
import JsonMethods from './component/JsonMethods'

function App() {
  const [count, setCount] = useState(0)

  return (
    <>
     <h1>04-15: Working with JSON in React</h1>

      <p>
        Learn JSON structure, parsing, stringifying,
        transforming and rendering data.
      </p>
      <StudentList/>
      <ApiUsers/>
      <JsonMethods/>
    </>
  )
}

export default App
