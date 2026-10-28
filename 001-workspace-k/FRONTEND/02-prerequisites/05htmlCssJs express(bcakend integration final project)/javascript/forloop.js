// //for loop:-in thi loop we use condion until the condition is trur then execute
// for (let index = 1; index <= 10; index++) {
//   // console.log(`outer index is${index}`);
//   for (let index1 = 1; index1 <= 10; index1++) {
//     // console.log(`outer index is${index} inner index is${index1}`);
//     console.log(index + "*" + index1 + "=" + index * index1);
//   }
// }
// for (i = 0; i <= 10; i++) {
//   console.log(i);
//   if (i == 5) {
//     console.log("deticated  value 5");
//     continue;
//   }
// }
let myarray = ["apple", "banana", "grapes"];
console.log(myarray.length);
for (let i = 0; i < myarray.length; i++) {
  const element = myarray[i];
  console.log(element);
}
for (j = 0; j < 20; j++) {
  console.log(`value is ${j}`);
}
