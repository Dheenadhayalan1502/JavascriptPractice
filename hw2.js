var a=10;
let b=20;
const c=30;


console.log("Outside block:");
console.log(a); 
console.log(b); 
console.log(c); 


if (true) {

    var x = 100;
    let y = 200;
    const z = 300;

    console.log("Inside block:");

    console.log(x);
    console.log(y); 
    console.log(z); 
}


console.log("Outside block:");

console.log(x);



function test() {

    var p = 1000;
    let q = 2000;
    const r = 3000;

    console.log("Inside function:");

    console.log(p); 
    console.log(q); 
    console.log(r); 
}

test();
