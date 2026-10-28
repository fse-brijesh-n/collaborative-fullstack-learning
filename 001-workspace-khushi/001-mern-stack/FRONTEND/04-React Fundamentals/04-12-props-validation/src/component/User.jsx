import React from 'react'
    import PropTypes from 'prop-types'
const User = ({ name, age, isStudent }) => {
  return (
    <div>
      <p>Name: {name}</p>
      <p>Age: {age}</p>
      <p>Is Student: {isStudent ? 'Yes' : 'No'}</p>
    </div>
  )
}

User.propTypes = {
  name: PropTypes.string.isRequired,
  age: PropTypes.number.isRequired,
  isStudent: PropTypes.bool.isRequired
}

export default User     
