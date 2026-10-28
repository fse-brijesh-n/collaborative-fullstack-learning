const Hero=()=>{

    const herocss = {
  display: "flex",
  alignItems: "center",
  justifyContent: "center",
  textAlign: "center",
  height: "480px",
  backgroundImage:
    "linear-gradient(rgba(0,0,0,0.45), rgba(0,0,0,0.45)), url('https://images.unsplash.com/photo-1509042239860-f550ce710b93?auto=format&fit=crop&w=1600&q=80')",
  backgroundSize: "cover",
  backgroundPosition: "center",
  borderRadius: "20px",
  marginBottom: "30px",
  boxShadow: "0 8px 32px rgba(0, 0, 0, 0.4)",
};
const heroContentStyle = {
  background: "rgba(255, 255, 255, 0.1)",
  backdropFilter: "blur(12px)",
  WebkitBackdropFilter: "blur(12px)",
  border: "1px solid rgba(255, 255, 255, 0.2)",
  borderRadius: "20px",
  padding: "2.5rem 4rem",
  boxShadow: "0 8px 32px rgba(0, 0, 0, 0.3)",
};
const heroTitleStyle = {
  fontSize: "3.5rem",
  fontWeight: "700",
  marginBottom: "1rem",
  letterSpacing: "2px",
  textShadow: "2px 2px 8px rgba(0,0,0,0.5)",
};

const heroTextStyle = {
  fontSize: "1.2rem",
  marginBottom: "2rem",
  fontWeight: "300",
};

const buttonStyle = {
  padding: "0.9rem 2.5rem",
  fontSize: "1.1rem",
  fontWeight: "600",
  color: "#1b1512",
  background: "#f5e6d3",
  border: "none",
  borderRadius: "50px",
  cursor: "pointer",
  letterSpacing: "1px",
  boxShadow: "0 4px 15px rgba(0,0,0,0.3)",
  transition: "transform 0.2s ease, background 0.2s ease",
};
    return (
  <section style={herocss}>
    <div style={heroContentStyle}>
      <h1 style={heroTitleStyle}>Premium Coffee Experience</h1>
      <p style={heroTextStyle}>
        Handcrafted brews, cozy ambiance, and the finest beans from around the world.
      </p>
      <button style={buttonStyle}>Explore Menu</button>
    </div>
  </section>
);
}
export default Hero;