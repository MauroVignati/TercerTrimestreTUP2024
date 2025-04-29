"use strict";

const x =10;//x = 10; // ReferenceError: x is not defined
console.log(x);// ReferenceError: x is not defined
// En modo estricto, las variables deben ser declaradas antes de usarlas

function miFuncion() {
  y = 20; // ReferenceError: y is not defined
  console.log(y); // ReferenceError: y is not defined
}
miFuncion();