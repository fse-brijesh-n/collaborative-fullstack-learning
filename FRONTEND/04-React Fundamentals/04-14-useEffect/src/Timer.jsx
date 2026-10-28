
import { useState, useEffect } from "react";

function Timer() {
  const [seconds, setSeconds] = useState(0);

  useEffect(() => {
    const timerId = setInterval(() => {
      setSeconds((prev) => prev + 1);
    }, 1000);

    return () => {
      clearInterval(timerId);
      console.log("Timer cleaned up");
    }; 
  }, []);

  return (
    <section className="cleanupdata">
      <h2>2. Cleanup Function</h2>
      <p>Timer: {seconds} seconds</p>
    </section>
  );
}

export default Timer;
