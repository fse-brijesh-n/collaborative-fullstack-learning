import React from 'react'

const DefaultProps = ({name, course}) => {
  return (
    <div>
        <h1>this is a default props example</h1>
      <h2>Hello, {name}!</h2>
      <p>You are enrolled in the {course} course.</p>
    </div>
  )
}

export default DefaultProps
