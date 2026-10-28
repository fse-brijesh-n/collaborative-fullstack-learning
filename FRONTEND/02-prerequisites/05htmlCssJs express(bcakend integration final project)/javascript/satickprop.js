class user{
    constructor(username){
        this.username=username
    }
    logMe()
    {
    console.log(`username:${this.username}`);
    
    }
   static createId(){
        return `123`
    }
}
const hidden= new user("khushi")
console.log(user.createId());
class Teacher extends user{
    constructor(username,email){
        super(username)
        this.email=email
    }
}
const iphone=new Teacher("IPHONE","i@123khu")
iphone.logMe();