import Card1 from "./Card1";
import Card2 from "./Card2";
import Card3 from "./Card3";
const Main=()=>{
   const maincss={
    display:"flex",
    justifyContent:"space-between",
    alignItems:"center",
    gap:"40px",
    padding:"40px 20px"
   }
    return(
        <section style={maincss}>
            <Card1/>
            <Card2/>
            <Card3/>
        </section>
    )
}
export default Main;