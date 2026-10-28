import React from 'react'

const PropsExample = ({name,course}) => {
  return (
    <div>
        <h1>this is a props example</h1>
      <h2>Hello, {name}!</h2>
      <p>You are enrolled in the {course} course.</p>
    </div>
  )
}

export default PropsExample
