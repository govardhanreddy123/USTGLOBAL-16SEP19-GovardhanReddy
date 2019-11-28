function first(){
    setTimeout(function(){
    console.log("first function executed");
},0)
console.log("executed");
}
function second(){
    console.log("second function executed");
}
first();
second();
console.log("======================");
function third(callfun){
    setTimeout(function(){
    console.log("third function executed");
    callfun();
},0)
}
function fourth(){
    console.log("fourth function executed");
}
first(fourth);
