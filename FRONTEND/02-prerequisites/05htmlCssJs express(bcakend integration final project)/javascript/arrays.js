// const myarray = [2, 4, 6, 8, 9];
// console.log(myarray);
// const myarray2 = new Array(6, 78, 9, 23, 8);
// console.log(myarray2);
// console.log(myarray[2]);
// console.log(myarray);
// myarray.push(11);
// console.log(myarray);
// myarray.pop(); //delete last value
// myarray.unshift(9); //add first value
// console.log(myarray);
// myarray.shift(); //first value remove
// console.log(myarray);
// console.log(myarray.includes(6)); //check the value is present or not
// console.log(myarray.indexOf(2)); //check index value
// const newarray = myarray.join();
// console.log(myarray);
// console.log(newarray);
// console.log("A", myarray);
// const newarr = myarray.slice(1, 3); //slice proper range tak nhi jata hai:-4,6index tak
// console.log(newarr);
// console.log(myarray);
// console.log("B", myarray);
// const newarr1 = myarray.splice(1, 4); //splice ye pura range tak jata hai:-4,6,8,9 tak
// console.log(newarr1);
// console.log(myarray);
const marvel_heroes = [
  "india",
  "pakistan",
  "bangladesh",
  "chennai",
  "maharastra",
];
const dc_heroes = ["patna", "naubapur", "mumbai", "nepal", "jharkhand"];
marvel_heroes.push(dc_heroes);
console.log(marvel_heroes);
marvel_heroes.concat(dc_heroes);
console.log(marvel_heroes);
const a = [12, 2, 3, 4, [3, 4, 5], 7, [34], 4, 5];
const b = a.flat(Infinity); //it convert in one line ,of all no
console.log(b);
const allarray = [...marvel_heroes, ...dc_heroes];
console.log(allarray);
console.log(Array.isArray("khushi")); //it is not array
console.log(Array.from("khsuhi")); // but it is array because we are using from
console.log(Array.from({ name: "khsuhi" }));
let score1 = 100;
let score2 = 200;
let score3 = 300;
console.log(Array.of(score1, score2, score3)); // means all values in a object
