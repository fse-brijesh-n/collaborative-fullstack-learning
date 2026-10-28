function setusername(username)
{
    this.username=username
    console.log("called")   
}
function createusername(username,email,password){
setusername.call(this,username)
    this.email=email
    this.password=password
}
const result=new createusername("khushi","khushi@11",123)
console.log(result)
