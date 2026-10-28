import React from 'react';

const Child = ({ reciveddata }) => {

  const data = {
    offerletter: "joiningdate",
    giftphone: "applephone",
    location: "pitwans",
    certificate: "master's degree"
  };

  return (
    <div>
      <button onClick={() => reciveddata(data)}>
        Send Data to Parent
      </button>
    </div>
  );
};

export default Child;