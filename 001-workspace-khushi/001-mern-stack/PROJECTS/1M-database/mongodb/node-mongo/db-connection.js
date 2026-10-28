const {MongoClient}=require('mongodb');

const getMongoDBConnection=async()=>{
 try{
    const dbUrl="mongodb://127.0.0.1:27017/moviesdb";
    const client= await MongoClient.connect(dbUrl);
    return client.db();
 }catch(err){
 throw err;
 }
}
module.exports={
    getMongoDBConnection
}