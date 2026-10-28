import React from "react";
import "./Card.css";
import chip from "../assets/chip.jpg";
import swip from "../assets/swip.png";
const Card = () => {
  return (
    <div className="card" style={{ display: "flex", justifyContent: "center"}}>
      <div className="bankname">
        <p>BANK OF INDIA</p>
      </div>

      <div className="chip">
        <img src={chip} alt="Card Chip" />
        <img src={swip} alt="Contactless" />
      </div>

      <div className="details">
        <div className="cardno">
          <p>6785</p>
          <p>5674</p>
          <p>4356</p>
          <p>5456</p>
        </div>

        <div className="validity">
          <div>
            Valid
            <br />
            <div className="till">till</div>
          </div>

          <div>06/28</div>
        </div>

        <div className="sign">
          <div className="signature">Khushi</div>

          <div className="logo">
            VISA <br /> DEBIT
          </div>
        </div>
      </div>
    </div>
  );
};

export default Card;