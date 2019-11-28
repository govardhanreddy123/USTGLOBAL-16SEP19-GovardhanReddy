let myName : string = "mikel";

console.log(myName, typeof myName);

let age : number;

console.log(age , typeof age);

let mobileNumber = 6584793210;

console.log(mobileNumber, typeof mobileNumber );

let address;

address = "asdfer";

address = 4526;

console.log(address, typeof address);

let age1 = function():void{
    console.log(" the age is 26");
}
age1();


class person{
    constructor(public name : string ,public age : number){
    }

}
let person1 = new person("raju", 25);
console.log(person1);


class Student extends person{
    constructor( name : string, age : number, public rollno : number){
        super(name ,age);
    }
}
let student1 = new Student("john",24,122);
console.log(student1);





