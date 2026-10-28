import { useState } from 'react'
import './App.css'

function App() {
  // Conditional Rendering{if...else}
//   const [isLoggedin, setIsLoggedin] = useState(true)
// if (isLoggedin) {
//   return (
//     <>
//       <h1>Welcome to the App</h1>
//       <button onClick={() => setIsLoggedin(false)}>Logout</button>
//     </>
//   )
// } else {
//   return (
//     <>
//       <h1>Please log in to continue</h1>
//       <button onClick={() => setIsLoggedin(true)}>Login</button>
//     </>
//   )
// }

// Conditional Rendering{ternary operator}


//===============================================>
// const [isLoggedin, setIsLoggedin] = useState(true)
//   return (
//     <>
//       {isLoggedin ? (
//         <>
//           <h1>Welcome to the App</h1>
//           <button onClick={() => setIsLoggedin(false)}>Logout</button>
//         </>
//       ) : (
//         <>
//           <h1>Please log in to continue</h1>
//           <button onClick={() => setIsLoggedin(true)}>Login</button>
//         </>
//       )}
//     </>
//   )
//&& operator
const [isLoggedin, setIsLoggedin] = useState(true)
  return (
    <>
      {isLoggedin && (
        <>
          <h1>Welcome to the App</h1>
          <button onClick={() => setIsLoggedin(false)}>Logout</button>
        </>
      )}
      {!isLoggedin && (
        <>
          <h1>Please log in to continue</h1>
          <button onClick={() => setIsLoggedin(true)}>Login</button>
        </>
      )}
    </>
  ) 
 
}

export default App
