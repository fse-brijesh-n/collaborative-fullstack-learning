import { useState } from 'react'
import './App.css'
import FunctionalComponent from './FunctionalComponent'
import PropsExample from './PropsExample'
import DefaultProps from './DefaultProps'
import ChildrenExample from './ChildrenExample'

function App() {
  const [count, setCount] = useState(0)

  return (
    <>
      <FunctionalComponent/>
      <PropsExample 
      name="khushi" 
      course="React" />
      <DefaultProps 
      name="nikhil" 
      course="JavaScript" />
      <ChildrenExample>
        <p>This is the child content.</p>
      </ChildrenExample>
    </>
  )
}

export default App
