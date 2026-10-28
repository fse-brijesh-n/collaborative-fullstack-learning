const bcrypt = require('bcryptjs');
const jwt = require('jsonwebtoken');
const express = require('express');
const User = require("../models/User");
const router = express.Router();
const JWT_SECRET = process.env.JWT_SECRET;

// Register
router.post("/register", async (req, res) => {
  const { name, email, password } = req.body;
  try {
    const user = new User({ name, email, password });
    await user.save();
    res.status(201).json({ message: "User registered successfully" });
  } catch (err) {
    res.status(400).json({ error: "Error registering user" });
  }
});

// Login
router.post("/login", async (req, res) => {
    const { email, password } = req.body;
    try {
      const user = await User.findOne({ email });
      if (!user) return res.status(404).json({ error: "User not found" });
  
      const isMatch = await bcrypt.compare(password, user.password);
      if (!isMatch) return res.status(400).json({ error: "Invalid credentials" });
  
      const token = jwt.sign({ id: user._id }, JWT_SECRET, { expiresIn: "1h" });
      res.json({ token });
    } catch (err) {
      console.error("Error during login:", err);  // Log the error for debugging
      res.status(500).json({ error: "Server error" });
    }
  });
  

module.exports = router;
