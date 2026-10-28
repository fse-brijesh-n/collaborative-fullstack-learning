
import { useState, useEffect } from 'react'
const EffectDemo = () => {
    const [count, setCount] = useState(0)
    useEffect(() => {
        console.log("count changed", count)
    }, [count])

  return (
    <section className="containerdata">
        <h2>1. Dependency Array</h2>
        <p>Count: {count}</p>
        <button onClick={() => setCount(count + 1)}>Increment</button>
    </section>
  )
}
 
export default EffectDemo
