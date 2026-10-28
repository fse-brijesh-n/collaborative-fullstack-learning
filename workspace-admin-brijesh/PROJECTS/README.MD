# Node.js Notes

## What is Node.js?
Node.js is an open-source, cross-platform JavaScript runtime environment that allows developers to run JavaScript on the server side. It is built on Google Chrome's V8 JavaScript engine and is designed to build scalable network applications.

---

## Key Features of Node.js

1. **Asynchronous and Event-Driven**:
   - All APIs in Node.js are asynchronous, meaning non-blocking.
   - The event-driven architecture makes it efficient for handling concurrent operations.

2. **Fast Execution**:
   - Powered by the V8 engine, Node.js executes JavaScript code at lightning speed.

3. **Single Threaded but Scalable**:
   - Uses a single-threaded model with event looping, enabling the handling of multiple requests efficiently.

4. **No Buffering**:
   - Node.js applications output data in chunks, eliminating buffering.

5. **NPM (Node Package Manager)**:
   - A vast library of reusable packages to accelerate development.

---

## Installation

### Installing Node.js
1. Download the latest version of Node.js from the [official website](https://nodejs.org/).
2. Follow the installation instructions for your operating system.

### Verifying Installation
```bash
node -v
npm -v
```

---

## Core Modules

Node.js provides many built-in modules:

### Commonly Used Modules
1. **`fs`**: File System module for handling file operations.
2. **`http`**: For creating HTTP servers.
3. **`url`**: For URL parsing and manipulation.
4. **`path`**: Utilities for working with file and directory paths.
5. **`events`**: EventEmitter class for working with events.
6. **`os`**: Provides information about the operating system.

---

## Building a Simple HTTP Server

```javascript
const http = require('http');

const server = http.createServer((req, res) => {
  res.writeHead(200, { 'Content-Type': 'text/plain' });
  res.end('Hello, World!');
});

server.listen(3000, () => {
  console.log('Server running at http://localhost:3000/');
});
```

---

## File System Module (`fs`)

### Reading a File
```javascript
const fs = require('fs');

fs.readFile('example.txt', 'utf8', (err, data) => {
  if (err) {
    console.error(err);
    return;
  }
  console.log(data);
});
```

### Writing to a File
```javascript
fs.writeFile('output.txt', 'Hello, Node.js!', (err) => {
  if (err) {
    console.error(err);
    return;
  }
  console.log('File written successfully');
});
```

---

## NPM (Node Package Manager)

### Installing a Package
```bash
npm install <package-name>
```

### Uninstalling a Package
```bash
npm uninstall <package-name>
```

### Global Installation
```bash
npm install -g <package-name>
```

---

## Express.js Framework

Express.js is a minimal and flexible Node.js web application framework.

### Installing Express
```bash
npm install express
```

### Basic Express Server
```javascript
const express = require('express');
const app = express();

app.get('/', (req, res) => {
  res.send('Welcome to Express!');
});

app.listen(3000, () => {
  console.log('Server running on port 3000');
});
```

---

## Middleware in Express
Middleware functions are functions that execute during the lifecycle of a request to the server.

### Example Middleware
```javascript
app.use((req, res, next) => {
  console.log('Middleware executed');
  next();
});
```

---

## EventEmitter

### Using EventEmitter
```javascript
const EventEmitter = require('events');

const myEmitter = new EventEmitter();

myEmitter.on('event', () => {
  console.log('An event occurred!');
});

myEmitter.emit('event');
```

---

## Working with Databases

### MongoDB Integration with Mongoose

#### Installation
```bash
npm install mongoose
```

#### Connecting to MongoDB
```javascript
const mongoose = require('mongoose');

mongoose.connect('mongodb://127.0.0.1:27017/exampleDB', {
  useNewUrlParser: true,
  useUnifiedTopology: true
});

const db = mongoose.connection;
db.on('error', console.error.bind(console, 'Connection error:'));
db.once('open', () => {
  console.log('Connected to MongoDB');
});
```

---

## Error Handling

### Example
```javascript
process.on('uncaughtException', (err) => {
  console.error('Uncaught Exception:', err);
});

process.on('unhandledRejection', (reason, promise) => {
  console.error('Unhandled Rejection:', reason);
});
```

---

## Best Practices
1. Use environment variables for sensitive data (e.g., `dotenv` package).
2. Modularize code for better maintainability.
3. Use asynchronous programming (e.g., `async/await`).
4. Properly handle errors and edge cases.
5. Optimize performance by using caching where necessary.

---

## Resources
- [Node.js Official Documentation](https://nodejs.org/)
- [Express.js Documentation](https://expressjs.com/)
- [Mongoose Documentation](https://mongoosejs.com/docs/)

