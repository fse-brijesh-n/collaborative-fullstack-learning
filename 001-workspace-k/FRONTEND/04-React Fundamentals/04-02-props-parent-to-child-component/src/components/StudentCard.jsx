const StudentCard=(props)=>{
    const card={
displa:"flex",
  boxSizing:"border-box",
  alignItems:"center",
  border:"1px solid black",
  borderRadius:"20px",
  justifyContent:"space-between",
  padding:"20px",
  margin:"30px",
flexDirection: "row",
backgroundColor:"#3E3E75"
    }
    const profile={
fontSize:"40px"
    }
    return (
        <div style={card}>
      <div style={profile}>👤</div>
      <h2>NAME:-{props.name}</h2>
      <p>AGE:-{props.age}</p>
      <p>COURSE:-{props.course}</p>
      <p>COLLEGE:-{props.college}</p>
      <button>view profile</button>
      </div>
    
        
    )
} 
export default StudentCard;