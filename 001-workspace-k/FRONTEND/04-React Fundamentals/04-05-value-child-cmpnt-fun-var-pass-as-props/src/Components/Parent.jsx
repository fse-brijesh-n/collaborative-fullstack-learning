import React from 'react';
import { useState } from 'react';
import Child from './Child';

const Parent = () => {

  const [offerletter, setOfferletter] = useState("");
  const [giftphone, setPhone] = useState("");
  const [location, setLocation] = useState("");
  const [certificate, setCertificate] = useState("");

  const reciveddata = (data) => {
    setOfferletter(data.offerletter);
    setPhone(data.giftphone);
    setLocation(data.location);
    setCertificate(data.certificate);
  };
  
  return (
    <div>
      <Child reciveddata={reciveddata} />

      <h3>Data received from Child:</h3>

      <p>Offer Letter: {offerletter}</p>
      <p>Gift Phone: {giftphone}</p>
      <p>Location: {location}</p>
      <p>Certificate: {certificate}</p>
    </div>
  );
};

export default Parent;