var brands=['kingfisher','bisleri',' aqua','kinley']
console.log("for of loop");
    for(var element of brands){
        console.log('brand =  ',element);

    }
    console.log("=======================");

    for(var index in brands){
        console.log("brand = ",brands[index]);
    }
    console.log("=======================");
    console.log("for in loop for object")
        var person = {
            name : 'sundari',
            age : 33,
            color : 'white',

        } 
    for(var key in person){
        console.log("value = ",person[key]);
    }
    console.log("=======================");
    console.log("for each method of array")
    var movies = ['sholay','mayabazar','jurassic park','titanic']
    movies.forEach(function(value,index){
        console.log("movie = ",value)
        console.log("movie Index = ",index)
    })
    console.log("=============================")


    console.log("for each for items")
    var items=[
        {
            item : 'bangles',
            id : 1,
            price : 100
        },
        {
            item : 'eyeliner',
            id : 2,
            price : 500

        },
        {
            item : 'watch',
            id : 3,
            price : 5000
        },
        {
            item : 'bike',
            id : 4,
            price : 100000
        }]
   items.forEach(function(item,index){
       console.log("item =",item)
       console.log("index of item = ",index)
   })
