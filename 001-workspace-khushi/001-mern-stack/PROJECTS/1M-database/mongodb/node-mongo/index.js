const express = require('express');
const { getMongoDBConnection } = require('./db-connection');
const { ObjectId } = require('mongodb');
const app = express();
app.use(express.json());//midleware 
let db;

async function init() {
  try {
    db = await getMongoDBConnection(); // Await the connection
    console.log('MongoDB connected...');
    
    app.listen(8080, () => {
      console.log('Server is running on port: 8080');
    });
  } catch (err) { 
    console.error('Failed to connect to MongoDB', err); // Log error
    process.exit(1); // Exit process with failure code
  }
}

init();


// Fetch all the movies
app.get('/movies', async (req, res) => {
    try {
      if (!db) {
        return res.status(500).json({ error: 'Database not initialized' });
      }
  
      // Pagination logic
      const page = parseInt(req.query.page) || 0; // Default to page 0 if not provided
      const limit = parseInt(req.query.limit) || 10; // Default to 10 items per page
      const skipCount = page * limit; // Calculate documents to skip
  
      // Query the movies collection
      const movies = await db.collection('movies')
        .find({})
        .sort({ name: -1 }) // Sort by name in descending order
        .skip(skipCount)    // Skip specified number of documents
        .limit(limit)       // Limit the number of documents
        .project({ name: 0, "about.year": 0 }) // Include `name` and exclude `about.year`
        .toArray();         // Convert cursor to array
  
      res.status(200).json(movies); // Send the movies as response
    } catch (err) {
      console.error('Error fetching movies:', err); // Log the error
      res.status(500).json({ error: 'Internal server error' });
    }
  });
  
//fetch by id

app.get('/movies/:id', async (req,res)=>{
    try{
        if (!db) {
            return res.status(500).json({ error: 'Database not initialized' }); // Check if db is initialized
          }
        const id=req.params.id;
        const result=await db.collection('movies').findOne({_id:new ObjectId(id)});
        res.status(200).json(result);
    }catch(err){
        console.error('Error fetching movies:', err); // Log error details
        res.status(500).json({ error: 'Internal server error' });

    }
})


 //insert the api
 app.post('/movies', async (req,res)=>{

    try{
        if (!db) {
            return res.status(500).json({ error: 'Database not initialized' }); // Check if db is initialized
          }
    const body=req.body;
    const result=await db.collection('movies').insertOne(body);
    res.status(201).json(result);

    }catch(err){
        console.error('Error fetching movies:', err); // Log error details
        res.status(500).json({ error: 'Internal server error' });
    }
 })

  //update the api
  app.put('/movies/:id', async (req,res)=>{

    try{
        if (!db) {
            return res.status(500).json({ error: 'Database not initialized' }); // Check if db is initialized
          }
        const id=req.params.id;
        const body=req.body;
        const query={_id: new ObjectId(id)};
        const updateDoc={$set:{...body}};
        const result=await db.collection('movies').updateOne(query,updateDoc );
        res.status(200).json(result);
    }catch(err){
        console.error('Error fetching movies:', err); // Log error details
        res.status(500).json({ error: 'Internal server error' });
    }
 })

  //delete the api
  app.delete('/movies/:id', async (req,res)=>{

    try{
        if (!db) {
            return res.status(500).json({ error: 'Database not initialized' }); // Check if db is initialized
          }
          const id=req.params.id;
          const result= await db.collection('movies').deleteOne({_id:new ObjectId(id)});
          res.status(204).json(result);

    }catch(err){
        console.error('Error fetching movies:', err); // Log error details
        res.status(500).json({ error: 'Internal server error' });
    }
 })