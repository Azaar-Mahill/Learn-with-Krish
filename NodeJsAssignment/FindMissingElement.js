//library to connect
const http = require('http')
//Variable for port
const port = 3000;

//Array with given values
let array =[21,25,29,28,22,24,27,26,30];

//computation
let min = Math.min.apply(null, array);
console.log('minimum value is : '+min);
let max = Math.max.apply(null, array);
console.log('maximum value is : '+max);

//addition upto maximum
let Addition2 = 0;

for(let b=min; b<max+1; b++){
    Addition2 += b;
}

//addition of elements in the array
let Addition3 = 0;

for(let c=0; c<array.length; c++){
    Addition3 += array[c];
}

let check = Addition2 - Addition3;
let answer;
if(check==0){
    answer="Either "+(min-1)+" or "+(max+1);
}else{
    answer=String(check);
}

console.log("answer : "+answer);

//Create server
const server = http.createServer(function(req,res){
    
    res.write(answer);
    res.end();

})

//assign server to listen on the port
server.listen(port, function(error){
    if(error){
        console.log('Error Occured while listening on the port : ', error);

    }else{
        console.log('Server is listening on the port ' + port);
    }
})
