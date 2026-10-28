import React from 'react'
import { useState } from 'react'
import Dashboard from './Dashboard'
const StudentDetails = () => {
    const [name, setName] = useState("");
    const [course, setCourse] = useState("");
    const [age, setAge] = useState(0);
    const [marks, setMarks] = useState(0);
    const [fees, setFees] = useState(0);
    const [active, setActive] = useState(true);
    const [inactive, setInactive] = useState(false);
    const [pass, setPass] = useState(true);
    const [fail, setFail] = useState(false);
    const [listofstudent, setListOfStudent] = useState([]);
    const [courses, setCourses] = useState([]);
    const [student, setStudent] = useState({});
    const [address, setAddress] = useState({});
    const [contact, setContact] = useState({});

  return (  
    <div>
      <h1>Student Details</h1>
      <Dashboard
      name={name}
      setName={setName}
      course={course} 
      setCourse={setCourse} 
      age={age} 
      setAge={setAge}
      marks={marks}
        setMarks={setMarks}
      fees={fees}
      setFees={setFees}
      active={active}
            setActive={setActive}
      inactive={inactive}
      setInactive={setInactive}
      pass={pass}
        setPass={setPass}
      fail={fail}
        setFail={setFail}
      listofstudent={listofstudent}
setListOfStudent={setListOfStudent}

      courses={courses}
        setCourses={setCourses}
      student={student}
        setStudent={setStudent}
      address={address}
        setAddress={setAddress}
      contact={contact}     
        setContact={setContact}
      />    
    </div>
  )
}

export default StudentDetails
