//filter command is manly use to filter and search the data from the array
// const mynums=[1,2,3,4,5,6,]
// const newnums=mynums.filter(function(num){//using function simple
//     console.log( num>4)
//     return num>4
// })
//console.log(newnums)



// const mynums=[1,2,3,4,5,6,]
// const newnums=mynums.filter((num)=>{//using arrow function
   
//     return num>4
// })
// console.log(newnums)


// const coding=["js","python","rb"]
// const values=coding.forEach((item)=>{
//     console.log(item)
// return item
// })
// console.log(coding.join(" "))
// console.log(values)


const mynums=[1,2,3,4,5,6,7,8,9]
const newnums=[]
mynums.forEach((num)=>{
    if(num>4)
    {
        newnums.push(num)
    }
})
console.log(newnums)



const mynumbers=[1,2,3,4,5,6,7,8,9,10]
// const newnumbers=mynumbers.map((num)=>{
//     return num+1;
    
// })
const newnumbers=mynumbers
.map((num)=>num*10)
.map((num)=>num+1)
console.log(newnumbers)

const mynum=[1,2,3]
// const mynumms=mynum.reduce(function(acc,curraval)
// {
//     console.log(`acc:${acc} and curraval: ${curraval} `)
//     return acc+curraval
// },0)
const mynumms=mynum.reduce((acc,curraval)=>acc+curraval,0)
console.log(mynumms)



const shopingcart=[
    {
        couresename:"js",
prize:999
    },
     {
        couresename:"java",
prize:900
    },
     {
        couresename:"python",
prize:1009
    },
]
const total=shopingcart.reduce((acc,item)=>acc+item.prize,0)
console.log(total)