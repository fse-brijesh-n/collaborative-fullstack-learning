import React from "react";

const Dashboard = ({
  name,
  setName,
  course,
  setCourse,
  age,
  setAge,
  marks,
  setMarks,
  fees,
  setFees,
  active,
  setActive,
  inactive,
  setInactive,
  pass,
  setPass,
  fail,
  setFail,
  listofstudent,
  setListOfStudent,
  courses,
  setCourses,
  student,
  setStudent,
  address,
  setAddress,
  contact,
  setContact,
}) => {
  const handleclick = () => {
    setName("Khushi");
    setCourse("MCA");
    setAge(22);
    setMarks(3053);
    setFees(245000);

    setActive(true);
    setInactive(false);
    setPass(true);
    setFail(false);

    setListOfStudent([
      {
        name: "Khushi",
        course: "MCA",
        age: 22,
        marks: 3053,
        fees: 245000,
        active: true,
        inactive: false,
        pass: true,
        fail: false,
      },
      {
        name: "Rahul",
        course: "BCA",
        age: 21,
        marks: 2500,
        fees: 200000,
        active: true,
        inactive: false,
        pass: true,
        fail: false,
      },
      {
        name: "Aman",
        course: "MCA",
        age: 23,
        marks: 1200,
        fees: 220000,
        active: false,
        inactive: true,
        pass: false,
        fail: true,
      },
    ]);

    setCourses(["MCA", "BCA", "B.Tech", "MBA"]);

    setStudent({
      name: "Khushi",
      course: "MCA",
      address: "Greater Noida",
      age: 22,
    });

    setAddress({
      city: "Greater Noida",
      state: "Uttar Pradesh",
      pincode: "201310",
    });

    setContact({
      phone: "9876543210",
      email: "khushi@gmail.com",
    });
  };

  return (
    <>
      <button onClick={handleclick}>show all details</button>
      <h1>NAME: {name}</h1>
      <p>COURSE: {course}</p>
      <p>AGE: {age}</p>
      <p>MARKS: {marks}</p>
      <p>FEES: {fees}</p>
      <p>ACTIVE: {String(active)}</p>
      <p>INACTIVE: {String(inactive)}</p>
      <p>PASS: {String(pass)}</p>
      <p>FAIL: {String(fail)}</p>
      <p>LIST OF STUDENTS: {listofstudent.length}</p>
      <p>COURSES: {courses.join(",")}</p>
      <p>
        STUDENT: {student.name},{student.address},{student.age}
      </p>
      <p>
        ADDRESS: {address.city}, {address.state} , {address.pincode}
      </p>
      <p>
        CONTACT: {contact.phone}, {contact.email}
      </p>
    </>
  );
};

export default Dashboard;
