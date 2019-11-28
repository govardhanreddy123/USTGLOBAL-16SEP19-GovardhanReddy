const hobbies = ["sleeping","cricket","eating"," coding","roaming"]
console.log(typeof hobbies);
const isArrayorNot = Array.isArray(hobbies)
console.log("hobbies array or not",isArrayorNot)
const hasCricket = hobbies.includes("cricket");
console.log('using include method  ', hasCricket);
hobbies.push("guiter",'volleyball')
console.log(" after push method",hobbies)
hobbies.pop()
console.log("after  pop method", hobbies)
hobbies.unshift("numismatics","singing");
console.log("after unshift method",hobbies);
hobbies.shift()
console.log("after shift method",hobbies);
 hobbies.splice(1,0,"bird","pubg")
 console.log("after splice method",hobbies);
 Aftersclice = hobbies.slice(2,4)
 console.log("after slice method",hobbies)
 console.log("afterslice method ",Aftersclice)
 console.log(hobbies.indexOf("sleeping"))
 console.log(hobbies.join("- "))


 console.log("====================================")
 const numbers = [100,200,300,400]
 const nums1 =  numbers.map(function(value,index){
     let newvalue =value + 50
     return newvalue
 })
console.log("after map method", nums1)
const nums2 = numbers.map(value=>value+500)
console.log("after map arrow function",nums2)



console.log("===================================")
const filterNum = numbers.filter(function(value,index)
{
    if(value > 200){
        return true
    }
    else{
        return false
    }
})
console.log("after filter method",filterNum)

const filterNum1 = numbers.filter(value=>value > 200)
console.log("after filter method using arrow",filterNum)


console.log("==========================")
count items1 =[{
    name:"earring",
    id:1,
    price:5000
},
{
    name:"kajal",
    id:2,
    price:2500
},
{
    name:"trimmer",
    id:3,
    price:3000
},
{
    name:"beardo",
    id:4,
    price:170
}]
console.log(items1)