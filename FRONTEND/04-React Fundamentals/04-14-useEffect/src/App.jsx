import { useState } from 'react'

import EffectDemo from './components/EffectDemo'
import Timer from './Timer'
import ProductList from './components/ProductList'
import FullName from './components/FullName'
import './App.css'
function App() {
  const [count, setCount] = useState(0)

  return (
    <>
     <EffectDemo />
     <Timer />
    <ProductList/>  
<FullName/>
    </>
  )
}

export default App
