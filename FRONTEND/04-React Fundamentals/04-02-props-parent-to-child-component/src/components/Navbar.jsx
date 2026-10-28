const Navbar=()=>{
    const navbar={
        display:"flex",
        justifyContent:"space-between",
        boxSizing:"border-box",
        border:"1px solid #464858",
     
        alignItems:"center",
        backgroundColor:"#233D4D",
        height:"50px",
        width:"100%",
        padding:"0 20px",
       

    }
    const navpart={
        diplay:"flex",
        gap:"2rem"

    }
    return(
        <nav style={navbar}>
            <h2>Student Portal</h2>
            <div style={navpart}>
                <span>🏠 Home</span>
        <span>👤 Profile</span>
            </div>
        </nav>
    )
}
export default Navbar;