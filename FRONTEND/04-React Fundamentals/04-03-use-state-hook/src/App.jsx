import { useState } from 'react'

import './App.css'
import StringState from './components/StringState'
import ArrayState from './components/Arraystate';
import BooleanState from './components/Booleanstate';
import NumberState from './components/Numberstate';
import ObjectState from './components/ObjectState';



function App() {


  return (
    <>
      <StringState/> 
<ArrayState/>
<BooleanState/>
 <NumberState/>
<ObjectState/>
    </>
  )
}

export default App;
