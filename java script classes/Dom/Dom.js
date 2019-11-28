// let h1 = document.getElementById("demo");
// console.log(h1);
// console.log(h1.textContent)
// h1.textContent = "good evening"
function showMessage(){
    alert("hii hello welcome!!!!!!")
}
function changeColor(){
    let pelement = document.getElementById("mover")
    pelement.style.color = "green"
}
function removeColor(){
    let pelement = document.getElementById("mover")
    pelement.style.color = "black"
    
}
function printHello(){
    // console.log("hello")
    let show =  document.getElementById("username").value
    document.getElementById('name').textContent= show;
    let x = document.getElementById('user').value;
    
     if(x.length > 5){
        document.getElementById('msg1').innerHTML = 'The user length should be 5';
  }

}
function printHello1(){
    // console.log("hello")
    let show1 =  document.getElementById("password").value
    document.getElementById('password').textContent= show1;

}


let name = "rakesh"
let age = 21
let phoneno = 8857458471
console.log("name is "+name + "age is"+age+"phonenumber is "+phoneno);
console.log(`name is ${name} age is ${age}`)
// document.getElementById("b1").disabled = false
