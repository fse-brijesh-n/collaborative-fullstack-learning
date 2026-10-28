//singleton:-iska use kerte hai jab constructor ka use kerte hai to
//object literals:-iska use kerte hai jab ham user se objet create kerte hai
const mysym = Symbol("key1");
const jsuser = {
  name: "khushi",
  age: 21,
  location: "patna",
  email: "khsuhi@1213",
  [mysym]: "mykeys1",
  isloggedin: false,
  lastloggedin: ["monday", "sunday"],
};
console.log(jsuser.email);
console.log(jsuser["email"]);
console.log(jsuser.mysym);
console.log(jsuser[mysym]);
jsuser.greeting = function () {
  console.log("hello khushi");
};

console.log(jsuser.greeting());
jsuser.greetingtwo = function () {
  console.log(`hello js user  ${this.name}`);
};
console.log(jsuser.greetingtwo());
// jsuser.email = "khushi2123";
//Object.freeze(jsuser); It is used to make an object immutable (read-only).
// console.log(jsuser);
