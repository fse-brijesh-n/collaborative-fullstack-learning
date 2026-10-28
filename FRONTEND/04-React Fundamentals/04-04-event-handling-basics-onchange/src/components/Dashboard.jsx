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
  const handleSubmit = (event) => {
    event.preventDefault();

    // Build a single student object
    const currentStudent = { name, course, age, marks, fees };

    // Update student state
    setStudent(currentStudent);

    // Add to list of students
    setListOfStudent([...listofstudent, currentStudent]);

    // Courses is already updated via input onChange

    // Address and contact are already updated via inputs

    // For demo, log the full data
    console.log({
      name,
      course,
      age,
      marks,
      fees,
      active,
      inactive,
      pass,
      fail,
      listofstudent,
      courses,
      student,
      address,
      contact,
    });
  };

  return (
    <div className="dashboard-container">
      <style>{`
        .dashboard-container {
          min-height: 100vh;
          display: flex;
          justify-content: center;
          align-items: center;
          background: #f0f2f5;
          padding: 1rem;
          font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
        }
        .dashboard-card {
          background: #fff;
          border-radius: 16px;
          box-shadow: 0 10px 25px rgba(0,0,0,0.1);
          padding: 2rem;
          width: 100%;
          max-width: 900px;
          transition: transform 0.2s;
        }
        .dashboard-card:hover {
          transform: translateY(-2px);
        }
        .dashboard-title {
          text-align: center;
          color: #1a202c;
          margin-bottom: 1.5rem;
          font-size: 1.8rem;
          font-weight: 600;
        }
        .form-grid {
          display: grid;
          grid-template-columns: repeat(auto-fit, minmax(200px, 1fr));
          gap: 1rem;
          margin-bottom: 1.5rem;
        }
        .input-group {
          display: flex;
          flex-direction: column;
        }
        .input-group label {
          font-size: 0.85rem;
          color: #4a5568;
          margin-bottom: 0.25rem;
          font-weight: 500;
        }
        .input-group input {
          padding: 0.6rem 0.8rem;
          border: 1px solid #e2e8f0;
          border-radius: 8px;
          font-size: 1rem;
          transition: border-color 0.2s, box-shadow 0.2s;
        }
        .input-group input:focus {
          outline: none;
          border-color: #4299e1;
          box-shadow: 0 0 0 3px rgba(66, 153, 225, 0.2);
        }
        .checkbox-group {
          display: flex;
          flex-wrap: wrap;
          gap: 1rem;
          margin-bottom: 1.5rem;
        }
        .checkbox-item {
          display: flex;
          align-items: center;
          gap: 0.4rem;
          font-size: 0.95rem;
          color: #2d3748;
          cursor: pointer;
        }
        .checkbox-item input[type="checkbox"] {
          width: 1.1rem;
          height: 1.1rem;
          accent-color: #4299e1;
          cursor: pointer;
        }
        .submit-btn {
          background: #4299e1;
          color: white;
          border: none;
          border-radius: 8px;
          padding: 0.75rem 1.5rem;
          font-size: 1rem;
          font-weight: 600;
          cursor: pointer;
          transition: background 0.2s, transform 0.1s;
          width: 100%;
          margin-bottom: 1.5rem;
        }
        .submit-btn:hover {
          background: #3182ce;
        }
        .submit-btn:active {
          transform: scale(0.98);
        }
        .display-section {
          border-top: 1px solid #e2e8f0;
          padding-top: 1.5rem;
        }
        .display-section h2 {
          font-size: 1.2rem;
          color: #2d3748;
          margin-bottom: 1rem;
          font-weight: 600;
        }
        .info-table {
          width: 100%;
          border-collapse: collapse;
          font-size: 0.95rem;
        }
        .info-table tr {
          border-bottom: 1px solid #edf2f7;
        }
        .info-table tr:last-child {
          border-bottom: none;
        }
        .info-table td {
          padding: 0.6rem 0.5rem;
        }
        .info-table td:first-child {
          font-weight: 600;
          color: #4a5568;
          width: 40%;
        }
        .info-table td:last-child {
          color: #1a202c;
        }
        @media (max-width: 600px) {
          .dashboard-card {
            padding: 1.5rem;
          }
          .form-grid {
            grid-template-columns: 1fr;
          }
          .info-table td:first-child {
            width: 50%;
          }
        }
      `}</style>

      <div className="dashboard-card">
        <h1 className="dashboard-title">Student Dashboard</h1>

        <form onSubmit={handleSubmit}>
          <div className="form-grid">
            <div className="input-group">
              <label>Name</label>
              <input
                type="text"
                value={name}
                placeholder="Enter Name"
                onChange={(e) => setName(e.target.value)}
              />
            </div>
            <div className="input-group">
              <label>Course</label>
              <input
                type="text"
                value={course}
                placeholder="Enter Course"
                onChange={(e) => setCourse(e.target.value)}
              />
            </div>
            <div className="input-group">
              <label>Age</label>
              <input
                type="number"
                value={age}
                placeholder="Enter Age"
                onChange={(e) => setAge(e.target.value)}
              />
            </div>
            <div className="input-group">
              <label>Marks</label>
              <input
                type="number"
                value={marks}
                placeholder="Enter Marks"
                onChange={(e) => setMarks(e.target.value)}
              />
            </div>
            <div className="input-group">
              <label>Fees</label>
              <input
                type="number"
                value={fees}
                placeholder="Enter Fees"
                onChange={(e) => setFees(e.target.value)}
              />
            </div>

            {/* Extra inputs to represent all outputs */}
            <div className="input-group">
              <label>Courses (comma separated)</label>
              <input
                type="text"
                value={courses?.join(", ") || ""}
                placeholder="e.g. React, Node"
                onChange={(e) =>
                  setCourses(
                    e.target.value
                      .split(",")
                      .map((c) => c.trim())
                      .filter((c) => c !== "")
                  )
                }
              />
            </div>
            <div className="input-group">
              <label>City</label>
              <input
                type="text"
                value={address?.city || ""}
                placeholder="Enter City"
                onChange={(e) =>
                  setAddress({ ...address, city: e.target.value })
                }
              />
            </div>
            <div className="input-group">
              <label>State</label>
              <input
                type="text"
                value={address?.state || ""}
                placeholder="Enter State"
                onChange={(e) =>
                  setAddress({ ...address, state: e.target.value })
                }
              />
            </div>
            <div className="input-group">
              <label>Pincode</label>
              <input
                type="text"
                value={address?.pincode || ""}
                placeholder="Enter Pincode"
                onChange={(e) =>
                  setAddress({ ...address, pincode: e.target.value })
                }
              />
            </div>
            <div className="input-group">
              <label>Phone</label>
              <input
                type="text"
                value={contact?.phone || ""}
                placeholder="Enter Phone"
                onChange={(e) =>
                  setContact({ ...contact, phone: e.target.value })
                }
              />
            </div>
            <div className="input-group">
              <label>Email</label>
              <input
                type="text"
                value={contact?.email || ""}
                placeholder="Enter Email"
                onChange={(e) =>
                  setContact({ ...contact, email: e.target.value })
                }
              />
            </div>
          </div>

          <div className="checkbox-group">
            <label className="checkbox-item">
              <input
                type="checkbox"
                checked={active}
                onChange={(e) => setActive(e.target.checked)}
              />
              Active
            </label>
            <label className="checkbox-item">
              <input
                type="checkbox"
                checked={inactive}
                onChange={(e) => setInactive(e.target.checked)}
              />
              Inactive
            </label>
            <label className="checkbox-item">
              <input
                type="checkbox"
                checked={pass}
                onChange={(e) => setPass(e.target.checked)}
              />
              Pass
            </label>
            <label className="checkbox-item">
              <input
                type="checkbox"
                checked={fail}
                onChange={(e) => setFail(e.target.checked)}
              />
              Fail
            </label>
          </div>

          <button type="submit" className="submit-btn">
            Submit
          </button>
        </form>

        <div className="display-section">
          <h2>Student Information</h2>
          <table className="info-table">
            <tbody>
              <tr>
                <td>Name</td>
                <td>{name || "-"}</td>
              </tr>
              <tr>
                <td>Course</td>
                <td>{course || "-"}</td>
              </tr>
              <tr>
                <td>Age</td>
                <td>{age || "-"}</td>
              </tr>
              <tr>
                <td>Marks</td>
                <td>{marks || "-"}</td>
              </tr>
              <tr>
                <td>Fees</td>
                <td>{fees || "-"}</td>
              </tr>
              <tr>
                <td>Active</td>
                <td>{String(active)}</td>
              </tr>
              <tr>
                <td>Inactive</td>
                <td>{String(inactive)}</td>
              </tr>
              <tr>
                <td>Pass</td>
                <td>{String(pass)}</td>
              </tr>
              <tr>
                <td>Fail</td>
                <td>{String(fail)}</td>
              </tr>
              <tr>
                <td>List of Students</td>
                <td>{listofstudent?.length ?? 0}</td>
              </tr>
              <tr>
                <td>Courses</td>
                <td>{courses?.length ? courses.join(", ") : "-"}</td>
              </tr>
              <tr>
                <td>Student</td>
                <td>
                  {student?.name
                    ? `${student.name}, ${student.course}, ${student.age}`
                    : "-"}
                </td>
              </tr>
              <tr>
                <td>Address</td>
                <td>
                  {address?.city || address?.state || address?.pincode
                    ? `${address.city || ""}, ${address.state || ""}, ${
                        address.pincode || ""
                      }`
                    : "-"}
                </td>
              </tr>
              <tr>
                <td>Contact</td>
                <td>
                  {contact?.phone || contact?.email
                    ? `${contact.phone || ""}, ${contact.email || ""}`
                    : "-"}
                </td>
              </tr>
            </tbody>
          </table>
        </div>
      </div>
    </div>
  );
};

export default Dashboard;