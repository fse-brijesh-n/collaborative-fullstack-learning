import DashboardCard from "./DashboardCard";
import Navbar from "./Navbar"
import Siderbar from "./Sidebar"
import UserTable from "./UserTable";

const AdminLayout=()=>{
    const layoutcss={
        display:"flex",
        flexDirection:"column",
        minHeight:"100vh"
    }
    const bodyStyle={
        display:"flex",
        flex:"1"
    }
const contentStyle={
display:"flex",
justifyContent:"flex-start",
alignItems:"flex-start",
flex:"1"
}
    return(
        <>
        <div style={layoutcss}>
        <Navbar/>
<div style={bodyStyle}>
        <Siderbar/>
        <main style={contentStyle}>
        <DashboardCard/>
        <UserTable/>
        </main>
        
        </div>
        </div>
        </>
    )
}
export default AdminLayout;