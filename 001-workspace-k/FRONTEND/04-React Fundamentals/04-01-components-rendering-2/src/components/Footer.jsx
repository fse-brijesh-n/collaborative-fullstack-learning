const Footer=()=>{
    const footercss={
display:"flex",
justifyContent:"cenetr",
alignItems:"center",
flexDirection:"row",
border:"1px solid  rgba(255, 255, 255, 0.18)",
borderRadius:"20px",
background:"#a18e91",
  boxShadow: "0 8px 32px rgba(0, 0, 0, 0.35)",
  padding:"2rem",
  marginTop: "30px",
  gap: "1rem"
    }
 const footerdev={
    // display:"flex",
    // alignItems:"center",
    // justifyContent:"center",
     textAlign:"center",
    linehight:"1.8",
    fontSize:"0.95",
    color:"white"

 }
 const footerCopyrightStyle={
fontSize:"0.85",
  color: "#c9b8a8",
  borderTop: "1px solid rgba(255,255,255,0.15)",
  paddingTop: "1rem",
  width: "100%",
  textAlign:"center"
 }
 const footerLinkStyle = {
  cursor: "pointer",
  fontSize: "0.95rem",
  letterSpacing: "1px",
  color: "#f5e6d3",
  transition: "color 0.3s ease",
  
};

const footerDevStyle = {
  textAlign: "center",
  lineHeight: "1.8",
  fontSize: "0.95rem",
  color: "#e8d9cc",
};
    return(
        <footer style={footercss}>
            <ul style={footerLinkStyle}>
                <li style={footerLinkStyle}>About</li>
                <li style={footerLinkStyle}>Menu</li>
                <li style={footerLinkStyle}>Contact</li>
                <li style={footerLinkStyle}>Services</li>
            </ul>
           <div >
            <strong style={footerDevStyle}>Developer Details</strong>
            <br />
      Full Stack Engineer  MERN : Khushi Kumari
      <br />
      Email : <a href="mailto:khushi8252kumari@gmail.com" style={{ color: "#f5e6d3", textDecoration: "none" }}>khushi8252kumari@gmail.com</a>
    </div>
    <div style={footerCopyrightStyle}>
      © 2025 Khushi Kumari. All rights reserved.
    </div>  
          
        </footer>
    )
}
export default Footer;