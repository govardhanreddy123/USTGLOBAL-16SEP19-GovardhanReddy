const employees = new Promise(function(resolve,reject){
    if(30>10){
        resolve([{
            name : "steve",
            age : 60
        },{
            name : "pawan",
            age : 60

        },{
            name : "raju",
            age : 60

        }
        ])
    }
  
    else{
        reject("failed")
    }
    
    })
    employees.then(function(data){
        console.log("employee data",data)
    }).catch(function(error){
        console.log("failure Message",error)
    })

    //closures

    function outerFunction(counter){
        function innerFunction(){
            let count;
            count = counter + 10 
            return count 

        }
        return innerFunction
    }
    let innerFunc = outerFunction(20)
    let counter = innerFunc()
    console.log("counter value",counter)
    






    