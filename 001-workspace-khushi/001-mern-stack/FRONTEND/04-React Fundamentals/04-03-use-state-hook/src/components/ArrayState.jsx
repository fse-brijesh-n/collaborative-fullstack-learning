import { useState } from "react"
const ArrayState=()=>{
const[array,SetArray]=useState([1,2,3,7,4])
    return(
<h1>{array.map((num)=>{
return(

        <div>
     <li key={num}>
{num}

    </li>   
    <br/>
    </div>
    
)})}</h1>
)
} 
export default ArrayState;