// const user = {
//     username:"khushi",
//     logincount:8,
//     signedin:true,
//     getuserdetails:function(){
//         // console.log("got user details from dayabase")
//         // console.log(`username:${this.username}`)
//         console.log(this);
        
//     }
// }

// console.log(user.username);
// console.log(user.getuserdetails())
// console.log(this);
// const primiseone=new Promise()
// const date=new date()

function user(username,logincount,isloggedin)
{
    this.username=username;
    this.logincount=  logincount;
    this.isloggedin=isloggedin
    this.greeting=function(){
        console.log(`welcome${this.user}`);
        
    }
    return this
}
const userone=new user("khushisharma",12,true)
const usertwo=new user("chai",11,false)
console.log(userone)
console.log(usertwo);
