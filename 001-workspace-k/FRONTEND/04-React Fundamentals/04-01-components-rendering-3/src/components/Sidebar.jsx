const Siderbar=()=>{
const sidebarcss={
    display:"flex",
    flexDirection:"column",
    alignItems:"center",
    // justifyContent:"center",
    padding:"0px",
    margin:"0px",
    color:"#FCF2E5",
    background:"#A8A492",
    width:"200px",
    minHeight: "100vh",
    boxSizing: "border-box"

}
const adminpanelcss={
    border:"1px solid #524646",
    width:"100%",
    margin:"0 0 30px 0",
    height:"60px",
    textAlign:"center",
    
    lineHeight: "50px",
    boxSizing: "border-box"
}
    return(
        <div style={sidebarcss}>
<h2 style={adminpanelcss}>Admin panel</h2>
<p>Dashboard</p>
<p>Users</p>
<p>Tasks</p>
<p>Profile</p>
<p>Settings</p>
        </div>
    )
}
export default Siderbar;