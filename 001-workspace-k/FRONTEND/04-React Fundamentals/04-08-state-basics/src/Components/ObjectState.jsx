import { useState } from "react";

function ObjectState() {
  const [user, setUser] = useState({
    name: "Khushi",
    age: 22,
    course: "MCA",
  });

  const changeName = () => {
    setUser({
      ...user,
      name: "Khushi Kumari",
    });
  };

  const changeAge = () => {
    setUser({
      ...user,
      age: 23,
    });
  };

  const changeCourse = () => {
    setUser({
      ...user,
      course: "MERN Stack",
    });
  };

  return (
    <div>
      <h2>Object State</h2>

      <p>Name: {user.name}</p>
      <p>Age: {user.age}</p>
      <p>Course: {user.course}</p>

      <button onClick={changeName}>
        Change Name
      </button>

      <button onClick={changeAge}>
        Change Age
      </button>

      <button onClick={changeCourse}>
        Change Course
      </button>
    </div>
  );
}

export default ObjectState;