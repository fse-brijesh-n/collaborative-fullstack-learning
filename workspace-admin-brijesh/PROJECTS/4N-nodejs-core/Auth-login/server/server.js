// index.js
const express = require('express');
const bodyParser = require('body-parser');
const cors = require('cors');

const app = express();
const port = 3000; // You can choose a different port if needed

// Middleware
app.use(cors()); // Enable Cross-Origin Resource Sharing
app.use(bodyParser.json()); // Parse JSON bodies

// Dummy data for registered users (in a real app, this would be a database)
const users = [
  {
    username: 'john_doe',
    password: 'password123' // Passwords should never be stored in plain text
  },
  {
    username: 'jane_doe',
    password: 'mypassword456'
  }
];

// Register endpoint
app.post('/api/register', (req, res) => {
  const { username, password } = req.body;

  // Simple validation
  if (!username || !password) {
    return res.status(400).json({ message: 'Username and password are required' });
  }

  // Check if user already exists
  const userExists = users.some(user => user.username === username);
  if (userExists) {
    return res.status(400).json({ message: 'User already exists' });
  }

  // Add new user to the dummy data
  users.push({ username, password });

  res.status(201).json({ message: 'User registered successfully' });
});

// Login endpoint
app.post('/api/login', (req, res) => {
  const { username, password } = req.body;

  // Simple validation
  if (!username || !password) {
    return res.status(400).json({ message: 'Username and password are required' });
  }

  // Check if the user exists and the password is correct
  const user = users.find(user => user.username === username);
  if (!user || user.password !== password) {
    return res.status(401).json({ message: 'Invalid username or password' });
  }

  // Success
  res.status(200).json({ message: 'Login successful', user: { username } });
});

// Start the server
app.listen(port, () => {
  console.log(`Server is running at http://localhost:${port}`);
});
