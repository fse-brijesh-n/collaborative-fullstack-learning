class User {
    constructor(username) {
        this.username = username;
    }

    logMe() {
        console.log(`username is ${this.username}`);
    }
}

class Teacher extends User {
    constructor(username, email, password) {
        super(username);
        this.email = email;
        this.password = password;
    }

    addCourse() {
        console.log(`A new course was added by ${this.username}`);
    }
}

// Teacher object
const chai = new Teacher("chai", "khushi@123", "234");
chai.addCourse();
chai.logMe();

// User object
const masalachai = new User("masalachai");
masalachai.logMe();

console.log(chai instanceof Teacher); // true
console.log(chai instanceof User);    // true
