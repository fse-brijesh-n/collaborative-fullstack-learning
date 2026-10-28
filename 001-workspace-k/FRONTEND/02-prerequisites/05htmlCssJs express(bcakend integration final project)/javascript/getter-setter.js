// // in a getter setter method is manly use to get and set the value
// // using constructor
// class user{
//     constructor(email,password)
//     {
//         this._email=email,
//         this._password=password
//     }
//     get password()
//     {
//         return this._password.toUpperCase()
//     }
//     set password(value)
//     {
// this._password=value
//     }
//      get email()
//     {
//         // return this._email.toUpperCase()
//         return `${this._email}khushi`
//     }
//     set email(value)
//     {
// this._email=value
//     }
// }
// const khushi=new user("khushi@123","123")
// console.log(khushi.password);
// console.log(khushi.email);



// using function=>properties_get_set

// function user(email,password)
// {
//     this._email=email
//     this._password=password
//     Object.defineProperty(this,'email',{
//         get:function(){
//             return this._email.toUpperCase()
//         },
//         set:function(value)
//         {
//             this._email=value
//         }
//     })
//      Object.defineProperty(this,'password',{
//         get:function(){
//             return this._password.toUpperCase()
//         },
//         set:function(value)
//         {
//             this._password=value
//         }
//     })
// }
// const tea=new user("nikhil@123",'343')
// console.log(tea.email);
// console.log(tea.password);



//object_get_set
const user={
_email:'ram.com',
_password:"abc",

get email()
{
return this._email.toUpperCase()
},
set email(value)
{
this._email=value
},
get password()
{
return this._password.toUpperCase()
},
set password(value)
{
this._password=value
}
}
const ginger_tea=Object.create(user)
console.log(ginger_tea.email);
console.log(ginger_tea.password);


