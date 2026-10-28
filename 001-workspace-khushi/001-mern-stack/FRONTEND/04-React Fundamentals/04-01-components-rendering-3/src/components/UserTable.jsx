import SearchBar from "./SearchBar";

const UserTable = () => {

    const containercss = {
        width: "100%",
        padding: "30px",
        boxSizing: "border-box"
    };

    const topcss = {
        display: "flex",
        alignItems: "center",
        justifyContent: "space-between"
    };

    const headingcss = {
        margin: "0"
    };

    const addbuttoncss = {
        padding: "10px 18px",
        border: "none",
        borderRadius: "6px",
        background: "#A56F63",
        color: "white",
        cursor: "pointer",
        fontSize: "15px"
    };

    const tablecss = {
        width: "100%",
        borderCollapse: "collapse",
        border: "1px solid #A56F63",
        marginTop: "20px"
    };

    const thcss = {
        border: "1px solid #A56F63",
        padding: "12px"
    };

    const tdcss = {
        border: "1px solid #A56F63",
        padding: "12px",
        textAlign: "center"
    };

    return (
        <div style={containercss}>

            <div style={topcss}>
                <h1 style={headingcss}>Users</h1>

                <button style={addbuttoncss}>
                    + Add User
                </button>
            </div>

            <SearchBar />

            <table style={tablecss}>

                <thead>
                    <tr>
                        <th style={thcss}>NAME</th>
                        <th style={thcss}>EMAIL</th>
                        <th style={thcss}>STATUS</th>
                        <th style={thcss}>ACTION</th>
                    </tr>
                </thead>

                <tbody>
                    <tr>
                        <td style={tdcss}>Rahul</td>
                        <td style={tdcss}>rahul@gmail.com</td>
                        <td style={tdcss}>Active</td>
                        <td style={tdcss}>Edit | Delete</td>
                    </tr>

                    <tr>
                        <td style={tdcss}>Aman</td>
                        <td style={tdcss}>aman@gmail.com</td>
                        <td style={tdcss}>Active</td>
                        <td style={tdcss}>Edit | Delete</td>
                    </tr>
                </tbody>

            </table>

        </div>
    );
};

export default UserTable;