 const message =  new Promise(function(resolve,reject){
if(30>10){
    resolve("success")
}else{
    reject("failed")
}

})
message.then(function(msg){
    console.log("success Message",msg)
}).catch(function(error){
    console.log("failure Message",error)
})
