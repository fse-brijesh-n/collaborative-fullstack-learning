// function pegion(a, b) {
//   if (a == undefined && b === undefined) {
//     console.log("please enter value of a and b");
//     return;
//   }
//   console.log(a + b);
// }
// pegion(3, 4);
// function user(username) {
//   if (!username) {
//     console.log("please enter user name");
//     return;
//   }
//   return `${username}is loggerdin`;
// }
// console.log(user("khushi"));

// function calculateprize(...num1) {
//   return num1;
// }
// console.log(calculateprize(200, 600, 500, 200));

// const user = {
//   name: "khushi",
//   courseprize: "400",
//   language: "c language",
// };
// function handleobj(anyobject) {
//   return `user choice language is ${anyobject.language} and his prizes ${anyobject.courseprize}`;
// }
// console.log(handleobj(user));

const myarray = [300, 400, 500, 1000];
function secondvalue(getarray) {
  return getarray[1];
}
console.log(secondvalue([200, 400, 500, 700]));
