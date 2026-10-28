const user = {
  username: "khushi",
  website: "javascript",
  prize: "999",
  welcomemessage: function () {
    console.log(`${this.username} , welcome to my website`);
  },
};
// user.welcomemessage();
// user.username = "sam";
// user.welcomemessage();

// function chai() {
//   let username = "hitesh";
//   console.log(this.username);
// }
// chai();
// const chai = () => {
//   //arrow function
//   let username = "hitesh";
//   // console.log(this.username);
//   console.log(this);// it is return a object type{}
// };
// chai();

// const addtwo = (num1, num2) => {
//   return num1 + num2;
// };
// const addtwo = (num1, num2) => num1 + num2;
// console.log(addtwo(3, 4));
// const addtwo = (num1, num2) => num1 + num2;
// console.log(addtwo(3, 4));
const addtwo = (num1, num2) => ({ username: "khushi" });
console.log(addtwo(3, 4));
