//step1:----navbar.jsx
// step2: create a function like :- arrow or simple
//step3:-return the jsx
// step4:-export component,so that we can use in other component
//step5:-  import and render into app.jsx
const Navbar = () => {
  const navbarcss = {
    display: "flex",
    flexDirection: "row",
    justifyContent: "space-between",
    alignItems: "center",
    padding: "1rem 2rem",
    background: "rgba(255, 255, 255, 0.08)",
    backdropFilter: "blur(16px)",
    WebkitBackdropFilter: "blur(16px)",
    border: "1px solid rgba(255, 255, 255, 0.18)",
    borderRadius: "20px",
    boxShadow: "0 8px 32px rgba(0, 0, 0, 0.35)",
    marginBottom: "30px",
  };
  const ulStyle = {
    display: "flex",
    listStyle: "none",
    gap: "40px",
    margin: 0,
    padding: 0,
  };
  const logoStyle = {
    fontSize: "2rem",
    fontWeight: "700",
    letterSpacing: "2px",
    color: "#f5e6d3",
  };
  const liStyle = {
    fontSize: "1.05rem",
    fontWeight: "500",
    cursor: "pointer",
    color: "#f5e6d3",
    textTransform: "uppercase",
    letterSpacing: "1px",
    transition: "color 0.3s ease",
  };
  return (
    <nav style={navbarcss}>
      <div style={logoStyle}>☕ Aroma</div>
      <ul style={ulStyle}>
        <li style={liStyle}>Home</li>
        <li style={liStyle}>About</li>
        <li style={liStyle}>Menu</li>
        <li style={liStyle}>Contact</li>
      </ul>
    </nav>
  );
};

export default Navbar;