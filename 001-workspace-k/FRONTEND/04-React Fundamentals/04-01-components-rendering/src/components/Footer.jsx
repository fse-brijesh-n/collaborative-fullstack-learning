
const Footer=()=>{
    const footercss = {
  display: "flex",
  flexDirection: "column",
  alignItems: "center",
  justifyContent: "center",
  padding: "2rem",
  background: "rgba(255, 255, 255, 0.08)",
  backdropFilter: "blur(16px)",
  WebkitBackdropFilter: "blur(16px)",
  border: "1px solid rgba(255, 255, 255, 0.18)",
  borderRadius: "20px",
  boxShadow: "0 8px 32px rgba(0, 0, 0, 0.35)",
  marginTop: "30px",
  gap: "1rem",
};

const footerLinksStyle = {
  display: "flex",
  listStyle: "none",
  gap: "30px",
  margin: 0,
  padding: 0,
};

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

const footerCopyrightStyle = {
  fontSize: "0.85rem",
  color: "#c9b8a8",
  borderTop: "1px solid rgba(255,255,255,0.15)",
  paddingTop: "1rem",
  width: "100%",
  textAlign: "center",
};
    return (
  <footer style={footercss}>
    <ul style={footerLinksStyle}>
      <li style={footerLinkStyle}>About</li>
      <li style={footerLinkStyle}>Menu</li>
      <li style={footerLinkStyle}>Contact</li>
      <li style={footerLinkStyle}>Services</li>
    </ul>
    <div style={footerDevStyle}>
      <strong>Developer Details</strong>
      <br />
      Full Stack Engineer  MERN : Khushi Kumari
      <br />
      Email : <a href="mailto:khushi8252kumari@gmail.com" style={{ color: "#f5e6d3", textDecoration: "none" }}>khushi8252kumari@gmail.com</a>
    </div>
    <div style={footerCopyrightStyle}>
      © 2025 Khushi Kumari. All rights reserved.
    </div>
  </footer>
);
}
export default Footer;