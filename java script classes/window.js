console.log("window object", window);
console.log("this keyword",this);
console.log(this == window)

// window.alert("welcome to javascript class");
// alert("welcome to my world");
// let confirmDelete = confirm("are you sure you want to delete");
// console.log('confirm delete',confirmDelete);
// let username  = prompt("what is your name",'Govardhan')
// console.log("username",username);



const person = {
firstname : "alia",
age : 26 ,
lastname : "kappor" ,
getName : function(){
    return this.firstname + " " + this.lastname
        
    }
}
let fullname =person.getName();
console.log("fullname",fullname);