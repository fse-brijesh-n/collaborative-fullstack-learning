import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'
import UseEffects from './components/UseEffects'
import Timer from './components/Timer'
import DataFetcher from './components/DataFetcher'

function App() {
  const [count, setCount] = useState(0)

  return (
    <>
      <Timer />
      <DataFetcher/>
      <UseEffects />
    </>
  )
}

export default App
