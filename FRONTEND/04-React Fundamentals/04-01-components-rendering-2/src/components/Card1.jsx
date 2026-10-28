const Card1=()=>{
const cardcss={
    dispaly:"flex",
    justifyContent:"center",
    alignItems:"center",
    textAlign:"center",
    border:"1px solid rgba(255, 255, 255, 0.18)",
    width:"280px",
height:"300px",
borderRadius:"20px",
background: "rgba(255, 255, 255, 0.08)",
padding:"2rem 1.5rem",
flexDirection:"column",
 boxShadow: "0 8px 32px rgba(0, 0, 0, 0.3)"
}
    return(
        <div style={cardcss}>
<p>this is card1</p>
        </div>
    )
}
export default Card1;