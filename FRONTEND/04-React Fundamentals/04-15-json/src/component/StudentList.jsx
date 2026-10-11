
import { useState } from 'react';
import students from '../data/students.json';
const StudentList = () => {
  const[showToppers, setShowToppers] = useState(false);
  const filteredStudents = showToppers ? students.filter((student) => student.marks > 80) : students;
  const storedStudents = [...filteredStudents].sort((a, b) => b.marks - a.marks);
  return (
    <div>
      <section>
        <h2>Student List</h2>
        <button onClick={() => setShowToppers(!showToppers)}>
          {showToppers ? 'Show All Students' : 'Show Topper Students'}
        </button>
        {storedStudents.map((student, index) => (
          <div key={index}>
            <p>Name: {student.name}</p>
            <p>Course: {student.course}</p>
            <p>Marks: {student.marks}</p>
            <p>Skills: {student.skills.join(', ')}</p>
          </div>
        ))}
      </section>
    </div>
  )
}

export default StudentList
