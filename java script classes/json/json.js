const person = {
    name : "sundari",
    age  : 100,
    color :"white",
    address : {
            city : "bijapur",
            state : "karnataka",
            pincode : 594521
    },
    hobbies : ["coding ",'birdwatching',"singing"]
}
console.log("javascript person object",person)
const jsonObject = JSON.stringify(person)
console.log('json person object',jsonObject)
const javaScriptPersonObject = JSON.parse(jsonObject)
console.log("java script person object after parse",javaScriptPersonObject)
localStorage.setItem("email","billgates@gmail.com");    
const emailID   =localStorage.getItem("email")
console.log("email ID",emailID)
localStorage.clear();


