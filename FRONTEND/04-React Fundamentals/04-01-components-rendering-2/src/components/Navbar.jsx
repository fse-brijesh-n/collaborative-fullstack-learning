const Navbar=()=>{
    const navbarcss={
display:"flex",
justifyContent:"space-between",
alignItems:"center",
border:"0.1rem solid black",
borderRadius:"  0.2rem",
 boxShadow: "0 8px 32px rgba(0, 0, 0, 0.35)",
 padding:"1rem 2rem",
 margin:"30px",
 backgroundColor:"grey",
 flexDirection:"row"
    }
    const ulstyle={
display:"flex",
listStyle:"none",
gap:"18rem",
padding:"0px",
margin:"0px"
    }
return(
    <nav style={navbarcss}>
        <ul style={ulstyle}>
            <li>Home</li>
             <li>About</li>
            <li>Menu</li>
            <li>Contact</li>
        </ul>
    </nav>
)
}
export default Navbar;