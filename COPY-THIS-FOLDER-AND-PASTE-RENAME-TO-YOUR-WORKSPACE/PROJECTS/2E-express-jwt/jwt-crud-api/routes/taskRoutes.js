const express = require("express");
const Task = require("../models/Task");
const jwt = require("jsonwebtoken");

const router = express.Router();
const JWT_SECRET = process.env.JWT_SECRET;

// Middleware to verify JWT
const verifyToken = (req, res, next) => {
  const token = req.header("Authorization");
  if (!token) return res.status(401).json({ error: "No token provided" });

  try {
    const decoded = jwt.verify(token, JWT_SECRET);
    req.user = decoded.id;
    next();
  } catch (err) {
    res.status(401).json({ error: "Invalid token" });
  }
};

// Create Task
router.post("/", verifyToken, async (req, res) => {
  const { title, description } = req.body;
  try {
    const task = new Task({ title, description, user: req.user });
    await task.save();
    res.status(201).json(task);
  } catch (err) {
    res.status(400).json({ error: "Error creating task" });
  }
});

// Get All Tasks
router.get("/", verifyToken, async (req, res) => {
  try {
    const tasks = await Task.find({ user: req.user });
    res.json(tasks);
  } catch (err) {
    res.status(400).json({ error: "Error fetching tasks" });
  }
});

// Update Task
router.put("/:id", verifyToken, async (req, res) => {
  const { title, description, completed } = req.body;
  try {
    const task = await Task.findByIdAndUpdate(req.params.id, { title, description, completed }, { new: true });
    res.json(task);
  } catch (err) {
    res.status(400).json({ error: "Error updating task" });
  }
});

// Delete Task
router.delete("/:id", verifyToken, async (req, res) => {
  try {
    await Task.findByIdAndDelete(req.params.id);
    res.json({ message: "Task deleted" });
  } catch (err) {
    res.status(400).json({ error: "Error deleting task" });
  }
});

module.exports = router;
