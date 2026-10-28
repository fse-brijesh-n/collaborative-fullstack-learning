import { useState } from "react";

function ArrayState() {
  const [skills, setSkills] = useState([
    "Java",
    "JavaScript",
    "React",
  ]);

  const addSkill = () => {
    setSkills([
      ...skills,
      "Node.js",
    ]);
  };

  const removeSkill = (skill) => {
    setSkills(
      skills.filter((item) => item !== skill)
    );
  };

  return (
    <div>
      <h2>Array State</h2>

      {skills.map((skill, index) => (
        <div key={index}>
          <span>{skill}</span>

          <button onClick={() => removeSkill(skill)}>
            Remove
          </button>
        </div>
      ))}

      <button onClick={addSkill}>
        Add Node.js
      </button>
    </div>
  );
}

export default ArrayState;