/*import React from "react";
import { createRoot } from "react-dom/client";
const rootelement = document.getElementById("root");
const root = createRoot(rootelement);
const name="book";
const admin=false;
const user="brijesh"
const css = { color:"red",
    backgroundColor:"blue",
    fontSize:"30px",
 };
 const info={
    class:"mca",
    address:"patna"
 };
 const array=[1,2,3,4,5,6,7,8,9,10]
//now we have provide jsx syntax
const heading = <h1>hello world</h1>;
let element = (
  <div style={css}>
    <h1>name:{name}</h1>
    <h2>class:{info.class}</h2>
    <h3>address:{info.address}</h3>
   {

    array.map(value=>(
        <li key={value}>{value}</li>
    ))
   }
   
{admin?<h1>this is admin</h1>:<h1>this is user:{user}</h1>}
   
  </div>
);
const isloggedin=false;
if(isloggedin)
{
    element=<h1>wecome {user}</h1>
}
else{
    element=<h1>please login</h1>
}
root.render(heading);
root.render(element);**/
 




// import React from "react";

// import {createRoot} from "react-dom/client";
//  const rootelement=document.getElementById("root");
// const root=createRoot(rootelement);
// // const heading=<h1>helloworld</h1>
// // root.render(heading);
// // const css={
// //     display: "flex",
// //     gap:"20px",
// //     justifyContent:"center",
// //     width: "100px",
// //     height:"100px",
// //     alignItems: "center",
// //     border:"5px solid black",
// //     borderRadius: "20px",
// // backgroundColor: "aqua",
// // };
// // let card=(
// // <div className="cardbox" style={css}>
// // <div>box1 </div>
// // </div>
// // );



// // root.render(card);
// const navbarcss={
//     display:"flex",
//     flexDirection:"row",

//     justifyContent:"space-between",
//     alignItems:"center"
// }

// const navbar=(
 
//      <ul style={navbarcss}>
//     <li>About</li>
//     <li>Menu</li>
//     <li>Contactus</li>
//     <li>Services</li>
//  </ul>


// );
// const imagecss={
//     width:"100vw",
//     height:"400px",

// }
// const image="cofee.jpg"

// const  hero=(
//     <img src={image} alt="cofee" style={imagecss} />
// );

// const cardcss={
//     display:"flex",
//     alignItems:"center",
//     padding:"1rem",
//     border:"0.2rem solid black",
// borderRadius:"1rem",
// backgroundColor:"grey",
// width:"29rem",
// height:"15rem",
// justifyContent:"center",
// textAlign:"center"

// }
// const card1=(
//     <div style={cardcss}>
//         <h1>this is my card 1</h1>
//     </div>
// )
// const card2=(
//      <div style={cardcss}>
//         <h1>this is my card 2</h1>
//     </div>
// )
// const card3=(
//      <div style={cardcss}>
//         <h1>this is my card 3</h1>
//     </div>
// )

// const maincss={
//     display:"flex",
//    justifyContent:"space-between",
//    alignItems:"center",
//    padding:"40px",
//    margin:"20px",
//    gap:"50px"
// }
// const  main=(
//    <div style={maincss}>
//      {card1}
//     {card2}
//     {card3}
//    </div>
// );
 
// const footercss={
//     display:"flex",
// alignItems:"center",
// justifyContent:"center"
// }
// const footer=(
//     <div style={footercss}>
//         <h1>this is my footer</h1>
//     </div>
// );
// const page=(
//   <div >
//      {navbar}
//    {hero}
//    {main}
//    {footer}
//   </div>

// );

// // root.render(navbar)
// // root.render(hero)
// // root.render(main)
// // root.render(footer)
// root.render(page)



import React from "react";
import { createRoot } from "react-dom/client";

const rootElement = document.getElementById("root");
const root = createRoot(rootElement);

const globalStyles = `
  @import url('https://fonts.googleapis.com/css2?family=Poppins:wght@300;400;600;700&display=swap');
  * { margin: 0; padding: 0; box-sizing: border-box; }
  body { font-family: 'Poppins', sans-serif; }
`;

const appStyle = {
  minHeight: "100vh",
  background: "linear-gradient(135deg, #1b1512 0%, #3e2f28 100%)",
  color: "#f5e6d3",
  fontFamily: "'Poppins', sans-serif",
  padding: "20px",
};

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

const logoStyle = {
  fontSize: "2rem",
  fontWeight: "700",
  letterSpacing: "2px",
  color: "#f5e6d3",
};

const ulStyle = {
  display: "flex",
  listStyle: "none",
  gap: "40px",
  margin: 0,
  padding: 0,
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

const navbar = (
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

const hero = (
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

const card1 = (
  <div style={cardcss}>
    <div style={cardIconStyle}>☕</div>
    <h3 style={cardTitleStyle}>Espresso</h3>
    <p style={cardTextStyle}>
      Rich, bold, and full-bodied. Our signature espresso brewed to perfection.
    </p>
  </div>
);

const card2 = (
  <div style={cardcss}>
    <div style={cardIconStyle}>🥛</div>
    <h3 style={cardTitleStyle}>Cappuccino</h3>
    <p style={cardTextStyle}>
      Creamy steamed milk with a smooth espresso base, topped with frothy foam.
    </p>
  </div>
);

const card3 = (
  <div style={cardcss}>
    <div style={cardIconStyle}>🍫</div>
    <h3 style={cardTitleStyle}>Mocha</h3>
    <p style={cardTextStyle}>
      A delightful blend of espresso, chocolate, and steamed milk, finished with cream.
    </p>
  </div>
);

const maincss = {
  display: "flex",
  justifyContent: "space-between",
  alignItems: "stretch",
  padding: "40px 20px",
  gap: "40px",
  flexWrap: "wrap",
};

const main = (
  <section style={maincss}>
    {card1}
    {card2}
    {card3}
  </section>
);

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

const footer = (
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

const page = (
  <div style={appStyle}>
    <style>{globalStyles}</style>
    {navbar}
    {hero}
    {main}
    {footer}
  </div>
);

root.render(page);
