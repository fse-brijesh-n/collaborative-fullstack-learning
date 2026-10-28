// const arr = [1, 2, 3, 4, 5];
// for (const val of arr) {
//   // in a java script of:-it is use for print total values like output 1,2,3,4,5
//   //and when we write in :-then print his index no 0,1,2,3,4
//   console.log(val);
// }

// const greeting = ["ram", "shayam", "khushi", "nikhil"];
// // for (const greet of greeting)
// console.log(greeting.join(" "));
// const map = new Map();
// map.set[("in", "india")];
// map.set[("usa", "united states of america")];
// map.set[("fr", "france")];
// for (const key in map) {
//   console.log(key);
// }

const coding = ["js", "java", "rb", "python", "c/c++"];
// coding.forEach(function (val) {
//   console.log(val);
// });

// coding.forEach((key) => {
//   console.log(key);
// });
function printMe(item) {
  console.log(item);
}
coding.forEach(printMe);

coding.forEach((item, index, arr) => {
  console.log(item, index, arr);
});
