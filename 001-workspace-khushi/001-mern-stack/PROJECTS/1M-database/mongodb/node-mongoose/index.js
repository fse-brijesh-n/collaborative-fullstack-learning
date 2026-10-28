// File: server.js

const express = require('express');
const connectDB = require('./db-connection');
const mongoose = require('mongoose');

const app = express();
app.use(express.json()); // Middleware for JSON parsing

// Define a Mongoose schema and model for the movies collection
const movieSchema = new mongoose.Schema({
  title: { type: String, required: true },
  genre: { type: String },
  about: {
    director: { type: String },
    year: { type: Number },
  },
});

const Movie = mongoose.model('Movie', movieSchema);

// Start the server after connecting to MongoDB
connectDB().then(() => {
  app.listen(8080, () => {
    console.log('Server is running on port: 8080');
  });
});

// Fetch all movies with pagination and projection
app.get('/movies', async (req, res) => {
  try {
    const page = parseInt(req.query.page) || 0;
    const limit = parseInt(req.query.limit) || 10;
    const skipCount = page * limit;

    const movies = await Movie.find({}, { title: 1, genre: 1 }) // Include `title` and `genre`
      .sort({ title: -1 })
      .skip(skipCount)
      .limit(limit);

    res.status(200).json(movies);
  } catch (err) {
    console.error('Error fetching movies:', err);
    res.status(500).json({ error: 'Internal server error' });
  }
});

// Fetch a movie by ID
app.get('/movies/:id', async (req, res) => {
  try {
    const id = req.params.id;
    const movie = await Movie.findById(id);

    if (!movie) {
      return res.status(404).json({ error: 'Movie not found' });
    }

    res.status(200).json(movie);
  } catch (err) {
    console.error('Error fetching movie by ID:', err);
    res.status(500).json({ error: 'Internal server error' });
  }
});

// Insert a new movie
app.post('/movies', async (req, res) => {
  try {
    const newMovie = new Movie(req.body);
    const savedMovie = await newMovie.save();

    res.status(201).json(savedMovie);
  } catch (err) {
    console.error('Error adding a new movie:', err);
    res.status(500).json({ error: 'Internal server error' });
  }
});

// Update an existing movie by ID
app.put('/movies/:id', async (req, res) => {
  try {
    const id = req.params.id;
    const updatedMovie = await Movie.findByIdAndUpdate(id, req.body, {
      new: true, // Return the updated document
      runValidators: true, // Ensure validation rules are applied
    });

    if (!updatedMovie) {
      return res.status(404).json({ error: 'Movie not found' });
    }

    res.status(200).json(updatedMovie);
  } catch (err) {
    console.error('Error updating movie:', err);
    res.status(500).json({ error: 'Internal server error' });
  }
});

// Delete a movie by ID
app.delete('/movies/:id', async (req, res) => {
  try {
    const id = req.params.id;
    const deletedMovie = await Movie.findByIdAndDelete(id);

    if (!deletedMovie) {
      return res.status(404).json({ error: 'Movie not found' });
    }

    res.status(204).send(); // No content
  } catch (err) {
    console.error('Error deleting movie:', err);
    res.status(500).json({ error: 'Internal server error' });
  }
});
