import Card1 from "./card1";
import Card2 from "./Card2";
import Card3 from "./Card3";
import Card4 from "./Card4";

const DashboardCard=()=>{
    const cardcontainercss={
textAlign:"center",
padding:"20px",
boxSizing:"border-box",
width:"100%"
    }
    const textstyle={
        padding:"0px",
        margin:"0px"
       
    }
   const cardcss={
    display:"flex",
    flexWrap:"wrap",
    marginTop:"30px",
    gap:"20px",
    alignItems:"center"
   }
    return(
        <div style={cardcontainercss}>
            <h1 style={textstyle}>welcome ,to the Dashboard</h1>
            <div style={cardcss}>
                <Card1/>
                <Card2/>
                <Card3/>
                <Card4/>
            </div>
        </div>
    )
}
export default DashboardCard;