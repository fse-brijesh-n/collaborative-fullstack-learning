// File: db-connection.js

const mongoose = require('mongoose');

// Connect to MongoDB using Mongoose
const connectDB = async () => {
  try {
    await mongoose.connect('mongodb://127.0.0.1:27017/moviesdb', {
      useNewUrlParser: true,
      useUnifiedTopology: true,
    });
    console.log('MongoDB connected using Mongoose...');
  } catch (err) {
    console.error('Failed to connect to MongoDB:', err);
    process.exit(1);
  }
};

module.exports = connectDB;
