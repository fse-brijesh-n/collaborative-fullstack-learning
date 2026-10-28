// const tenders = {};
// console.log(tenders);
const tenders = new Object(); //provide object symbol like constructor
console.log(tenders);
const tenderuser = {};
tenderuser.id = "123abc";
tenderuser.email = "@ksjfkjsf";
tenderuser.isloggedin = false;
console.log(tenderuser);
console.log(Object.keys(tenderuser));
console.log(Object.values(tenderuser));
console.log(Object.entries(tenderuser));
console.log(tenderuser.hasOwnProperty("isloggedin")); //output true aya kyuki isloggedin pahle se avilable hai
// const regularuser = {
//   username: "khushi",
//   fullname: {
//     userfullname: { firstName: "ram", lastname: "parsad" },
//   },
// };
// console.log(regularuser.fullname.userfullname.lastname);
// const obj1 = { 1: "a", 2: "b" };
// const obj2 = { 3: "c", 4: "d" };
// // const obj3 = { ...obj1, ...obj2 };// ise bolte hai spread
// // console.log(obj3);
// const obj3 = Object.assign({}, obj1, obj2);
// console.log(obj3);
// const user = {
//   id: "123",
//   Name: "ranbir kapoor",
//   occupision: "singer",
//   resume: {
//     Name: "khushi",
//     linkdinid: "khushi2HFDSHF",
//     education: "mca",
//   },
// };
// console.log(user.Name);
