//in a control flow statement we use the if -elseif-else,switch case,conditional operator-?: statement
const isloggedin = true;
const temprature = 41;
if (temprature < 50) {
  console.log("less than 50");
} else {
  console.log("greater than 50");
}

const months = 11;
switch (months) {
  case 1:
    console.log("january");
    break;

  case 2:
    console.log("february");
    break;

  case 3:
    console.log("march");
    break;

  case 4:
    console.log("april");
    break;

  case 5:
    console.log("may");
    break;

  case 6:
    console.log("june");
    break;

  case 7:
    console.log("july");
    break;
  case 8:
    console.log("auguest");
    break;

  case 9:
    console.log("september");
    break;
  case 10:
    console.log("october");
    break;
  case 11:
    console.log("november");
    break;
  case 12:
    console.log("december");
    break;
  default:
    console.log("not a month");
}
let a = 22;
a % 2 == 0 ? console.log("even") : console.log("odd");
const username = true;
const islogged = false;
if (username || islogged) {
  console.log("execute");
} else {
  console.log("not execute");
}
const useremail = [];
if (useremail) {
  console.log("true");
} else {
  console.log("false");
}
//falsy values
// false 0,-0,BigInt,0n,"",nan,undefined,null
//truthy values
//"0",'false',"",[],{},function(){}

//nullish coalescing operator(??):nukk undefined

let val1;
val1 = 5 ?? 10;
console.log(val1);
val2 = null ?? 20;
console.log(val2);
val3 = null ?? 10 ?? 40;
console.log(val3);
