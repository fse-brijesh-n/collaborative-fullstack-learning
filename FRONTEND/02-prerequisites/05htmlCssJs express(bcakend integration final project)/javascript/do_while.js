let i = 0;
while (i <= 20) {
  console.log(`your no is ${i}`);
  i = i + 2;
}
let j = 1;
do {
  console.log(`${j}`);
  j++;
} while (j <= 10);

// let myarray = ["khushi", "ram", "shyam"];
// let arr = 0;
// while (arr <= myarray.length) {
//   console.log(`${myarray[arr]}`);
//   arr++;
// }

let myarray = ["khushi", "ram", "shyam"];
let arr = 0;
let result = "";

while (arr < myarray.length) {
  result += myarray[arr] + " ";
  arr++;
}

console.log(result.trim());
//trim is mailnly use for remove the space of next line all output print in only one line
