let request = document.getElementById('req');
let Qform = document.getElementById('quoteForm');
let learn = document.getElementById('learn');
let submit = document.getElementById('submit');
let tableContainer = document.getElementById('tableContainer');

function reqbtn(e) {
    console.log(e.target.value);
    Qform.style.display = "block";
    tableContainer.style.display = "none"; // hide table when showing form again
}

function teachbtn(e) {
    console.log(e.target.value);
}

request.addEventListener("click", reqbtn);
learn.addEventListener("click", teachbtn);

const form_data = {
    name: "",
    email: "",
    phone: "",
    permanentaddres: "",
    requirement: ""
};

function datasubmit(e) {
    e.preventDefault();
    let form = e.target.form;
    form_data.name = form.elements["name"].value;
    form_data.email = form.elements["email"].value;
    form_data.phone = form.elements["phone"].value;
    form_data.permanentaddres = form.elements["permanentaddres"].value;
    form_data.requirement = form.elements["requirement"].value;
    console.log(form_data);
    Qform.style.display = "none";
    displaysubmited_data();
}

function displaysubmited_data() {
    // Build table HTML
    let tableHtml = `<table>
        <tr><th>Field</th><th>Value</th></tr>
        <tr><td>Name</td><td>${form_data.name}</td></tr>
        <tr><td>Email</td><td>${form_data.email}</td></tr>
        <tr><td>Phone</td><td>${form_data.phone}</td></tr>
        <tr><td>Permanent Address</td><td>${form_data.permanentaddres}</td></tr>
        <tr><td>Requirement</td><td>${form_data.requirement}</td></tr>
    </table>`;
    tableContainer.innerHTML = tableHtml;
    tableContainer.style.display = "block";
}

submit.addEventListener("click", datasubmit);
fetch("https://jsonplaceholder.typicode.com/users")
.then(Response=>{
    console.log(Response);
}).catch(
    console.log()
)
const users = [
    {
        id: 1,
        name: "Leanne Graham",
        username: "Bret",
        email: "Sincere@april.biz",
        address: {
            city: "Gwenborough",
            zipcode: "92998-3874"
        }
    },
    {
        id: 2,
        name: "Ervin Howell",
        username: "Antonette",
        email: "Shanna@melissa.tv",
        address: {
            city: "Wisokyburgh",
            zipcode: "90566-7771"
        }
    },
    {
        id: 3,
        name: "Clementine Bauch",
        username: "Samantha",
        email: "Nathan@yesenia.net",
        address: {
            city: "McKenziehaven",
            zipcode: "59590-4157"
        }
    }
];
document.writeln(users+"<br>") 
for(let i=0;i<users.length;i++)
{
    if(users[i].id===1)
    {
      document.writeln(users[i].id+"<br>");
      document.write(users[i].name+"<br>");
        document.write(users[i].username+"<br>");
      document.write(users[i].email+"<br>");
        document.write(users[i].address+"<br>");
      document.write(users[i].address.city+"<br>");
      document.write(users[i].address.zipcode)
    }
}
fetch("data.json",{
    // method:"GET",
    method:"POST"
    // method:"PUT",
    // method:"DELETE"
})
.then(function(Response){
    return Response.json();
})
.then(function(Response){
console.log(Response)
Response.forEach((user)=>{
console.log(user.id+": "+user.name+",email:"+user.email);
console.log(user.name)
}).catch((error)=>{
console.log(error)
})
const user=Response.filter((user)=>{
    // if(user.id==1)
    // {
    //     // console.log(user)
    //     return user;
        
    // }
    if(user.id!==1&&user.id!==2)
    return user
})
console.log(user);
})
fetch("https://jsonplaceholder.typicode.com/users", {
    method: "POST",
    headers: {
        "Content-Type": "application/json"
    },
    body: JSON.stringify({
        name: "Rahul",
        email: "rahul@gmail.com"
    })
})
.then(function(response) {
    return response.json();
})
.then(function(data) {
    console.log(data);
})
.catch(function(error) {
    console.log(error);
})
fetch("https://jsonplaceholder.typicode.com/users/1", {
    method: "PUT",

    headers: {
        "Content-Type": "application/json"
    },

    body: JSON.stringify({
        name: "Khushi",
        email: "khushi@gmail.com"
    })
})
.then(function(response) {
    return response.json();
})
.then(function(data) {
    console.log(data);
})
.catch(function(error) {
    console.log(error);
});
fetch("https://jsonplaceholder.typicode.com/users/1", {
    method: "PATCH",

    headers: {
        "Content-Type": "application/json"
    },

    body: JSON.stringify({
        email: "newemail@gmail.com"
    })
})
.then(function(response) {
    return response.json();
})
.then(function(data) {
    console.log(data);
})
.catch(function(error) {
    console.log(error);
});

fetch("https://jsonplaceholder.typicode.com/users/1", {
    method: "DELETE"
})
.then(function(response) {
    return response.json();
})
.then(function(data) {
    console.log(data);
})
.catch(function(error) {
    console.log(error);
});
fetch("https://jsonplaceholder.typicode.com/users",{
    method:"post",
    headers:{
"content-type":"application/json"
    },
    body: JSON.stringify({
        name:"allooo",
        email:"kachalu.com"
    })
}).then(function(response){
    return response.json();
})
.then(function(data){
    console.log(data);
}).catch(function(error)
{
    console.log(error)
})
