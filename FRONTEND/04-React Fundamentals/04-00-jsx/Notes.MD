```This is jsx syntax:const navbar = (
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



Now we have have to convert this jsx into a component process:
step1:-create a file like NavBar.jsx
step2:-we have to create javascript ()=>arrow function or funtion() simple function with the same name of the file NavBar
example:-
function NavBar(){

Here,we have add to write javascript , react related synatax like state management hooks api calling

return(
    here we have to write our jsx syntax in a single fragment or single container like<></>or<div></div>
    for example:-
    <>
    
  <nav style={navbarcss}>
    <div style={logoStyle}>☕ Aroma</div>
    <ul style={ulStyle}>
      <li style={liStyle}>Home</li>
      <li style={liStyle}>About</li>
      <li style={liStyle}>Menu</li>
      <li style={liStyle}>Contact</li>
    </ul>
  </nav>

    </>
);

}
export default NavBar;
line no :-19 to 42 is known as a complete single react cmponent
line no 23 to 39 is known as  jsx```



