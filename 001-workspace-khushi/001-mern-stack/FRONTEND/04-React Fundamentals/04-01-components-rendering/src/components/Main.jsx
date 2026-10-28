import Card1 from "./Card1.jsx";
import Card2 from "./Card2.jsx";
import Card3 from "./Card3.jsx";
const Main = () => {
  const maincss = {
    display: "flex",
    justifyContent: "space-between",
    alignItems: "stretch",
    padding: "40px 20px",
    gap: "40px",
    flexWrap: "wrap",
  };
  return (
    <section style={maincss}>
      <Card1 />
      <Card2 />
      <Card3 />
    </section>
  );
};
export default Main;
