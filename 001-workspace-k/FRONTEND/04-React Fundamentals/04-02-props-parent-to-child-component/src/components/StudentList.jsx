import StudentCard from "./StudentCard";

const StudentList = () => {
  const student_section = {
    display: "flex",
    alignItems: "center",
    boxSizing: "border-box",
    padding: "20px",
    margin: "30px",
    justifyContent: "center",
    flexDirection: "column",
    border: "1px solid black",
  };

  const Student_container = {
    display: "flex",
    alignItems: "center",
    justifyContent: "center",
    gap: "20px",
    flexWrap: "wrap",
    border: "1px solid blue",
    padding: "20px",
  };

  return (
    <div style={student_section}>
      <h1>Student Profiles</h1>

      <div style={Student_container}>

        <StudentCard
          name="Khushi"
          age="23"
          course="MCA"
          college="GNIOT"
        />

        <StudentCard
          name="Nikhil"
          age="17"
          course="12th"
          college="High School"
        />

        <StudentCard
          name="Aman"
          age="23"
          course="MBA"
          college="GLA"
        />

        <StudentCard
          name="Kajal"
          age="26"
          course="MBA"
          college="LN MISHRA"
        />

        <StudentCard
          name="Komal"
          age="27"
          course="MA"
          college="JD Womens"
        />

      </div>
    </div>
  );
};

export default StudentList;