const promiseone=new Promise(function(resolve,reject){
    setTimeout(function(){
        console.log('tea is ready');
        resolve();
    },1000)
})
promiseone.then(function(){
    console.log("program execute");
})


new Promise(function(resolve,reject){
    setTimeout(function(){
        console.log('coffee is ready');
        resolve();
    },1000)
}).then(function(){
    console.log("task execute");
})
const Promisethree=new Promise(function(resolve,reject){
    setTimeout(function(){
        resolve({username:"khushi",classnm:"javascript"})
    },1000)

})
Promisethree.then(function(user){
    console.log(user)
})


const Promisefour=new Promise(function(resolve,reject){
    setTimeout(function(){
        let error=true
        if(!error)
        {
        resolve({username:"khushi",classnm:"javascript"})
        }
        else{
            reject('error:something went wrong')
        }
    },1000)

})
const username=Promisefour.then((user)=>{
    console.log(user)
    return user.username
}).then((username)=>{
    console.log(username)
}).catch(function(error){
    console.log(error)
}).finally(()=>console.log("the promises is either resolved or reject"))


const Promisefive=new Promise(function(resolve,reject){
    setTimeout(function(){
        let error=true
        if(!error)
        {
        resolve({username:"khushi",classnm:"javascript"})
        }
        else{
            reject('error:something went wrong')
        }
    },1000)

})
async function consumePromisesFive(){
    try
    {
const response=await Promisefive
console.log(response)
}catch(error){
    console.log(error)
}
}
consumePromisesFive()

// async function getallusers() {
//     try{
//     const response=await fetch('https://jsonplaceholder.typicode.com/users')
//  const data= await response.json()
//  console.log(data)   

// }catch(error)
// {
//     console.log("E:",error)
// }
// }
// getallusers()



fetch('https://jsonplaceholder.typicode.com/users')
.then((response)=>{
    return response.json()
})
.then((data)=>{
    console.log(data)
})
.catch((error)=>console.log(error))