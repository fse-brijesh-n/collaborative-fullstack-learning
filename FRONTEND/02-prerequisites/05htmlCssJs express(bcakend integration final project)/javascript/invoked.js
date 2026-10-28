//imidiately invoked function expression IIFE
//means we can use both types of function invoked and arrow function

(function chai() {
  console.log(`db is connected`);
})();
// chai();
((name) => {
  console.log(`db is connected2 ${name}`);
})("khushi");
