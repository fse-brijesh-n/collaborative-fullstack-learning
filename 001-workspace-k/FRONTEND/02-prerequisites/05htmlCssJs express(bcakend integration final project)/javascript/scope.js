// var c = 300;
// let a = 200;
// if (true) {
//   //bracket ke ander jitne vi hai value usko bolte hai block of scope but isme letor const block of scope hao
//   //or var global scope mana jata hai
//   let a = 20;
//   const b = 90;
//   c = 40;
//   console.log("inner value of a=", a);
// }
// console.log("global value", a);
// // console.log(b);
// // console.log(c);
// for (i = 0; i < Array.length; i++) {
//   const element = Array[i];
// }

//function
function one() {
  const username = "khushi";

  function two() {
    const website = "java script";
    console.log(username); // works
    console.log(website); // works
  }

  two();
}

one();

// if (true) {
//   const username = "khushi";
//   if (username === "khushi") {
//     const website = "java script";
//     console.log(username + website);
//   }
//   console.log(website);
// }
// console.log(username);
// function addone(num1) {
//   return num1 + 1;
// }
// addone(5);
// const addtwo = function (num1) {
//   return num1 + 2;
// };
// console.log(addtwo(5));
