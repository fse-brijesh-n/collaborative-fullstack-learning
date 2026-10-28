import { useState } from "react";

import "./App.css";
import FunctionalUpdate from "./Components/FunctionalUpdate";
import ObjectState from "./Components/ObjectState";
import ArrayState from "./Components/ArrayState";
import BasicState from "./Components/BasicState";

function App() {
  const [count, setCount] = useState(0);

  return (
    <>
      <div>
        
      <BasicState/>
      <FunctionalUpdate/>
        <ObjectState/>
        <ArrayState/>

      </div>
    </>
  );
}

export default App;
