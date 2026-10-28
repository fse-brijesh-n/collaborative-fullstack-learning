const Hero=()=>{
    const herocss={
        display:"flex",
        alignItems:"center",
        justifyContent:"center",
        backgroundSize:"cover",
        backgroundImage:"linear-gradient(rgba(0,0,0,0.45), rgba(0,0,0,0.45)), url('https://images.unsplash.com/photo-1509042239860-f550ce710b93?auto=format&fit=crop&w=1600&q=80')",
        backgroundPosition:"cover",
        borderRadius:"20px",
        height:"480px",
        textAlign:"center"
    }
    const buttoncss={
        padding:"0.9rem 2.5rem",
        borderRadius:"50px",
        height:"40px",
        backgroundColor:"#f5e6d3",
        color:"#1b1512",
        border:"none"
       
    }
   const titlecss={
    fontSize:"3.5rem",
    marginBottom:"1rem"
   }
   const textstyle={
    fontSize:"1.2rem"
   }
    return(
        <section style={herocss}>
          <div>
            <h1 style={titlecss}>Premium Coffee Experience</h1>
            <p style={textstyle}> Handcrafted brews, cozy ambiance, and the finest beans from around the world.</p>
            <button style={buttoncss}>Explore Menu</button>
          </div>
        </section>
    )
}
export default Hero;