
const Navbar=()=>{
const navbarcss={
    display:"flex",
    justifyContent:"space-between",
    alignItems:"center",
    flexDirection:"row",
    border:"1px solid #C5C1C1",
    gap:"1rem",
    borderBOX:"box-sizing",
    background:"#C5C1C1",
    color:"#FFF2F2",
    height:"80px",
    width:"100%",
    margin:"0",
    padding:"0",
  
}
  const ulstyle={
display:"flex",
listStyle:"none",
gap:"18rem",
padding:"0px",
margin:"0px"
    }
return(
    <div style={navbarcss}>
        <ul style={ulstyle}>
            <li>Admin</li>
            <li>Search</li>
            <li>Profile</li>
            <li>Layout</li>
        </ul>
    </div>
)
} 
export default Navbar;