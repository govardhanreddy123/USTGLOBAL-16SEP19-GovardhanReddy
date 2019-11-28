//Named functions
function add(num1,num2){
    console.log('sum=',num1+num2);
}
add(10,20)


//Function Expression (ananymous)
var sub = function(num1,num2){
    var subvalue = num1-num2;
    return subvalue;
}
var value = sub(90,80);
console.log("value= ",value);
//invoked functions

var div=(num1,num2)=>{
    console.log("value",num1/num2);
}
div(10,5);

var div1 = num1 =>{
    console.log("value= ",num1)
}
div1(15);
 

var div2 = num1 => console.log(num1);
var add1 = (num1,num2) => num1+num2;
var value= add(10,20);


greeting("chandan");
function greeting(msg){
    console.log("hello ",msg);
}


 greet("dinga");
var greet = function(msg){
    console.log("hii",msg);
}


greets("dinga");
var greets=(msg) =>{
console.log("hii",msg);
}


















