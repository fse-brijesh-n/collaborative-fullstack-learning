
import { useState } from "react";

function JsonMethods() {
  const [output, setOutput] = useState("");

  const student = {
    name: "Khushi",
    course: "MCA",
    marks: 85,
  };

  function convertToJson() {
    const jsonString = JSON.stringify(student, null, 2);
    setOutput(jsonString);
  }

  function parseJson() {
    const jsonString = '{"name":"Khushi","course":"MCA"}';

    try {
      const parsedData = JSON.parse(jsonString);
      setOutput(
        `Name: ${parsedData.name}, Course: ${parsedData.course}`
      );
    } catch {
      setOutput("Invalid JSON data");
    }
  }

  return (
    <section>
      <h2>JSON Methods</h2>

      <button onClick={convertToJson}>
        JSON.stringify()
      </button>

      <button onClick={parseJson}>
        JSON.parse()
      </button>

      <pre>{output}</pre>
    </section>
  );
}

export default JsonMethods;
