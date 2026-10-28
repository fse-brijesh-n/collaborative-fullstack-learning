const Card2 = ()=>{
    const cardcss = {
  background: "rgba(255, 255, 255, 0.08)",
  backdropFilter: "blur(16px)",
  WebkitBackdropFilter: "blur(16px)",
  border: "1px solid rgba(255, 255, 255, 0.18)",
  borderRadius: "20px",
  padding: "2rem 1.5rem",
  width: "280px",
  height: "340px",
  display: "flex",
  flexDirection: "column",
  alignItems: "center",
  justifyContent: "center",
  textAlign: "center",
  boxShadow: "0 8px 32px rgba(0, 0, 0, 0.3)",
  transition: "transform 0.3s ease, boxShadow 0.3s ease",
};

const cardIconStyle = {
  fontSize: "3rem",
  marginBottom: "1rem",
};

const cardTitleStyle = {
  fontSize: "1.5rem",
  fontWeight: "600",
  marginBottom: "0.75rem",
};

const cardTextStyle = {
  fontSize: "1rem",
  fontWeight: "300",
  lineHeight: "1.6",
  color: "#e8d9cc",
};
    return(
  <div style={cardcss}>
    <div style={cardIconStyle}>🥛</div>
    <h3 style={cardTitleStyle}>Cappuccino</h3>
    <p style={cardTextStyle}>
      Creamy steamed milk with a smooth espresso base, topped with frothy foam.
    </p>
  </div>
);
}
export default Card2;
