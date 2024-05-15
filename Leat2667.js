// create hello world function

var createHelloWorld = function(){
    return function(){
        return "Hello World";
    }
}

const f=createHelloWorld();
console.log(f()); // Hello World

const g=createHelloWorld();
console.log(g({},null,42)); // Hello World