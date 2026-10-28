const Card1 = () => {

    const cardcss = {
        display: "flex",
        flexDirection: "column",
        boxSizing: "border-box",
        border: "1px solid #FFDADA",
        borderRadius: "10px",
        height: "130px",
        width: "220px",
        color: "#A56F63",
        background: "#FFD6E0",
        boxShadow: "0px 2px 5px rgba(0,0,0,0.1)",
        gap: "20px",
        alignItems: "center",
        justifyContent: "center"
    };

    return (
        <div style={cardcss}>

            <p>Users Total</p>

            <h1>120</h1>

        </div>
    );
};

export default Card1;