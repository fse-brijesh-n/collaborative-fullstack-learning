const SearchBar=()=>{
    const serchcss={
     padding:"10px",
     width:"250px" ,
border:"1px solid #ccc",
borderRadius:"5px",
margin:"20px 0"
    }
    return(
        <input type="text" placeholder="search user" style={serchcss} />
    )
}
export default SearchBar;