import { useState } from "react";

function FunctionalUpdate() {
  const [count, setCount] = useState(0);

  const increaseThreeTimes = () => {
    setCount((prev) => prev + 1);
    setCount((prev) => prev + 1);
    setCount((prev) => prev + 1);
  };

  return (
    <div>
      <h2>Functional Update</h2>

      <h3>Count: {count}</h3>

      <button onClick={increaseThreeTimes}>
        Increase 3 Times
      </button>

      <button onClick={() => setCount(0)}>
        Reset
      </button>
    </div>
  );
}

export default FunctionalUpdate;