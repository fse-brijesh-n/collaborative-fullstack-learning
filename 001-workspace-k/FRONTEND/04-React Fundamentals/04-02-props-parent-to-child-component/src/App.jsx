import { useState } from 'react'
import Navbar from './components/Navbar'

import './App.css'
import StudentList from './components/StudentList'
import Footer from './components/Footer'


function App() {


  return (
    <>
    <Navbar/>
   <StudentList/>
   <Footer/>
    </>
  )
}

export default App
