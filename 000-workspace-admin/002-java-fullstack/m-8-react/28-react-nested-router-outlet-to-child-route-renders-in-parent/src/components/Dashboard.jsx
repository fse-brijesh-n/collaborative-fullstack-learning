import React from 'react'
import { Outlet } from 'react-router-dom'

const Dashboard = () => {
  return (
    <div>
      <hr/>
      <h1>Dashboard</h1>
      <Outlet/>
    </div>
  )
}

export default Dashboard
