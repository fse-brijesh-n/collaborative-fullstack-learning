import React from 'react'

const Profile = ({ name, age, qualification }) => {
  return (
    <div>
      <h3>Student Profile</h3>
      <p>Name: {name}</p>
      <p>Age: {age}</p>
      <p>Qualification: {qualification}</p>
    </div>
  )
}

export default Profile
