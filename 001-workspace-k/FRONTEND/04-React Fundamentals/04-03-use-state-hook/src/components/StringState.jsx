import { useState } from "react";


const StringState=()=>{
const[name,setName]=useState("khushi")
    return(
<>
<h1>hello {name}</h1>
</>
    )
}
export default StringState;