MongoDB In-Depth Interview Preparation Guide

This guide covers MongoDB from foundational concepts to advanced topics, with detailed explanations and code snippets using the MongoDB Shell (mongosh) and Node.js driver. It prepares you for interviews by covering both theory and practical usage.

---

1. Introduction to MongoDB

MongoDB is a NoSQL, document-oriented database that stores data in flexible, JSON-like documents. Key features:

· Document model: data is stored as BSON (Binary JSON) documents within collections.
· Schemaless (or flexible schema): documents in the same collection can have different fields.
· High scalability: horizontal scaling via sharding.
· Rich query language: supports CRUD operations, aggregations, text search, geospatial queries.
· ACID transactions: multi‑document transactions with snapshot isolation (since 4.0 for replica sets, 4.2 for sharded clusters).
· Indexes: various index types for performance.

When to use MongoDB:

· Unstructured or semi‑structured data.
· Rapid development with evolving schemas.
· High write loads and horizontal scaling.
· Real‑time analytics, IoT, content management, catalogs.

---

2. Installation & Setup

· Local: download from mongodb.com, install, run mongod.
· Cloud: MongoDB Atlas (free tier available).
· Shell: mongosh to connect and run commands.

Connect:

```bash
mongosh "mongodb://localhost:27017"
```

Show databases:

```
show dbs
```

Use a database (creates implicitly):

```
use myDatabase
```

---

3. Basic Concepts

· Database: top‑level container for collections.
· Collection: grouping of documents (analogous to a table in SQL).
· Document: a single record expressed as BSON (similar to a JSON object). Contains field–value pairs.
· BSON: binary‑encoded serialization of JSON‑like documents. Supports additional types like Date, ObjectId, Binary.

Document Structure

```json
{
  "_id": ObjectId("507f1f77bcf86cd799439011"),
  "name": "Alice",
  "age": 30,
  "address": {
    "city": "New York",
    "zip": "10001"
  },
  "hobbies": ["reading", "hiking"]
}
```

· The _id field is mandatory (auto‑generated ObjectId if not provided).
· Maximum document size: 16 MB.

---

4. CRUD Operations

Using mongosh syntax (JavaScript‑like). The Node.js driver has similar methods (e.g., find, insertOne).

Create

```
db.collection.insertOne({ name: "Alice", age: 30 })
db.collection.insertMany([{...}, {...}])
```

Node.js driver:

```js
const { MongoClient } = require('mongodb');
const client = new MongoClient('mongodb://localhost:27017');
await client.connect();
const db = client.db('myDB');
const collection = db.collection('users');
await collection.insertOne({ name: 'Alice', age: 30 });
```

Read

```
db.collection.find({ age: { $gt: 25 } })
db.collection.findOne({ name: "Alice" })
```

Node.js:

```js
const cursor = collection.find({ age: { $gt: 25 } });
const results = await cursor.toArray();
// or forEach
cursor.forEach(doc => console.log(doc));
```

Update

```
db.collection.updateOne(
  { name: "Alice" },
  { $set: { age: 31 } }
)
db.collection.updateMany({}, { $inc: { visits: 1 } })
db.collection.replaceOne({ name: "Alice" }, { name: "Alice", age: 32 })
```

Node.js:

```js
await collection.updateOne(
  { name: 'Alice' },
  { $set: { age: 31 } }
);
```

Delete

```
db.collection.deleteOne({ name: "Alice" })
db.collection.deleteMany({ age: { $lt: 18 } })
```

Node.js:

```js
await collection.deleteOne({ name: 'Alice' });
```

Bulk Write

```
db.collection.bulkWrite([
  { insertOne: { document: { name: "Bob" } } },
  { updateOne: { filter: { name: "Alice" }, update: { $set: { age: 30 } } } },
  { deleteOne: { filter: { name: "Charlie" } } }
])
```

---

5. Query Operators

Comparison Operators

· $eq, $ne, $gt, $gte, $lt, $lte, $in, $nin

Example:

```
db.products.find({ price: { $gte: 100, $lte: 200 } })
```

Logical Operators

· $and, $or, $not, $nor

```
db.users.find({
  $or: [
    { age: { $lt: 18 } },
    { status: "new" }
  ]
})
```

Element Operators

· $exists: matches documents with a field.
· $type: matches BSON type.

```
db.users.find({ email: { $exists: true } })
db.users.find({ age: { $type: "int" } })
```

Array Operators

· $all, $elemMatch, $size

```
db.articles.find({ tags: { $all: ["mongodb", "database"] } })
db.scores.find({ grades: { $elemMatch: { $gte: 90, $lt: 100 } } })
db.products.find({ colors: { $size: 3 } })
```

Evaluation Operators

· $regex, $expr, $jsonSchema, $mod, $text

```
db.users.find({ name: { $regex: /^A/, $options: 'i' } })
db.orders.find({ $expr: { $gt: ["$total", "$paid"] } })
```

Projection

Return only specific fields:

```
db.users.find({}, { name: 1, age: 1, _id: 0 })
```

Note: 1 includes, 0 excludes.

---

6. Indexing

Indexes improve query performance. Without indexes, MongoDB performs a collection scan.

Creating Indexes

```
db.collection.createIndex({ field: 1 })       // ascending
db.collection.createIndex({ field: -1 })      // descending
db.collection.createIndex({ field1: 1, field2: -1 }) // compound
```

Index Types

· Single field
· Compound
· Multikey (for array fields)
· Text: for full‑text search (db.collection.createIndex({ description: "text" }))
· Geospatial: 2dsphere for Earth‑like geometry, 2d for flat
· Hashed: hashed shard key
· Wildcard: { "$**": 1 } indexes all fields (useful for unstructured data)
· TTL (Time‑To‑Live): documents are automatically removed after a period

Index Options

· unique: ensures unique values
· sparse: only indexes documents that contain the field
· partialFilterExpression: index only documents matching a condition
· expireAfterSeconds (for TTL)

```
db.users.createIndex({ email: 1 }, { unique: true, sparse: true })
db.sessions.createIndex({ createdAt: 1 }, { expireAfterSeconds: 3600 })
```

Explain & Performance

Check query execution plan:

```
db.collection.find({ age: 30 }).explain("executionStats")
```

Look for COLLSCAN vs IXSCAN. nReturned vs totalDocsExamined.

Indexing Best Practices

· Understand your queries; index fields used in filter, sort, and join.
· Compound index order matters: equality, sort, range.
· Covering query: when the index contains all fields needed, MongoDB returns from the index directly (fast).
· Avoid too many indexes (write performance overhead).

Dropping Indexes

```
db.collection.dropIndex({ field: 1 })
db.collection.dropIndexes() // drop all except _id
```

---

7. Aggregation Framework

Aggregation pipelines process data sequentially through multiple stages. Each stage transforms documents as they pass through.

Pipeline Stages (Common)

· $match: filter documents (similar to find)
· $group: group by a key, perform aggregations ($sum, $avg, $min, $max, $push, $addToSet)
· $sort: sort documents
· $project: reshape documents (include/exclude fields, create new computed fields)
· $unwind: deconstruct an array field into multiple documents
· $lookup: left outer join with another collection
· $addFields / $set: add new fields
· $limit, $skip: pagination
· $facet: multiple parallel pipelines
· $bucket, $bucketAuto: grouping into buckets
· $merge / $out: write results to a collection

Example: Total orders per customer

```
db.orders.aggregate([
  { $group: { _id: "$customerId", totalAmount: { $sum: "$amount" } } },
  { $sort: { totalAmount: -1 } },
  { $limit: 10 }
])
```

Example: Join with users

```
db.orders.aggregate([
  { $lookup: {
      from: "users",
      localField: "customerId",
      foreignField: "_id",
      as: "customer"
  }},
  { $unwind: "$customer" },
  { $project: { "customer.name": 1, amount: 1 } }
])
```

Expressions in Aggregation

· $sum, $avg, $max, $min, $first, $last
· $cond, $ifNull, $switch
· String, date, arithmetic operators

Example: { $project: { discountPrice: { $multiply: ["$price", 0.9] } } }

Aggregation Pipeline Optimization

· Place $match and $limit early to reduce data.
· Use indexes in $match, $sort, $group where possible.
· Avoid $unwind on large arrays unless necessary.

---

8. Data Modeling

Embedded Documents (Denormalized)

Embed related data inside a single document. Good for one‑to‑one or one‑to‑few relationships that are read together.

```json
{
  "_id": 1,
  "name": "Alice",
  "address": {
    "street": "123 Main St",
    "city": "New York"
  }
}
```

Advantages: single read, atomic updates (within the document).
Disadvantages: data duplication, larger documents, unbounded growth.

Referenced Documents (Normalized)

Use references (object IDs) between collections. Good for many‑to‑many or independent entities.

```json
// users
{ "_id": 1, "name": "Alice" }

// orders
{ "_id": 101, "userId": 1, "total": 150 }
```

Advantages: avoids duplication, flexible relationships.
Disadvantages: need joins ($lookup), can be slower.

Decision Factors

· Embed when data is mostly read together, doesn’t grow unbounded, and is seldom accessed independently.
· Reference when entities have independent lifecycles, many‑to‑many relationships, or when document size would exceed 16MB.
· A hybrid approach (embedded list of IDs) is also common.

---

9. Transactions

MongoDB supports multi‑document ACID transactions across multiple collections/databases (since 4.0). They use snapshot isolation.

Using Core Driver (Node.js)

```js
const session = client.startSession();
try {
  session.startTransaction();
  await collection1.insertOne({ ... }, { session });
  await collection2.updateOne({ ... }, { $set: { ... } }, { session });
  await session.commitTransaction();
} catch (error) {
  await session.abortTransaction();
} finally {
  session.endSession();
}
```

Important Points

· Transactions have a default timeout (60 seconds).
· Only available on replica sets or sharded clusters (not standalone).
· They incur performance overhead; use them only when necessary.
· Inside a transaction, all operations must use the same session.

---

10. Replication

Replication ensures high availability and data redundancy. A replica set is a group of mongod instances that maintain the same data set.

· Primary: receives all write operations.
· Secondaries: replicate the primary's oplog and can serve read operations (if read preference is set).
· Arbiter (optional): votes in elections but does not store data.

Setup

Basic configuration:

```
rs.initiate({
  _id: "myReplicaSet",
  members: [
    { _id: 0, host: "localhost:27017" },
    { _id: 1, host: "localhost:27018" },
    { _id: 2, host: "localhost:27019" }
  ]
})
```

Write Concern

Controls acknowledgment level:

```
db.collection.insertOne({ ... }, { writeConcern: { w: "majority", j: true } })
```

w: 1 – primary acknowledgment; w: "majority" – majority of members; j: true – journaled.

Read Concern / Read Preference

· primary (default): all reads from primary.
· secondary: read from secondaries.
· nearest: lowest latency member.

```
db.collection.find().readPref("secondary")
```

---

11. Sharding

Sharding distributes data across multiple machines to support large datasets and high throughput.

· Shard: a replica set that stores a subset of data.
· Mongos: query router; client connects to mongos.
· Config servers: store metadata (replica set).

Shard Key

The field on which data is distributed. Choose carefully as it cannot be changed later.

Sharding Strategies

· Hashed sharding: uniform distribution using hash of the key.
· Ranged sharding: data divided into contiguous ranges based on shard key values.

Enable Sharding

```
sh.enableSharding("myDatabase")
sh.shardCollection("myDatabase.myCollection", { userId: "hashed" })
```

Balancing

The balancer automatically migrates chunks between shards to maintain even distribution.

---

12. Security

Authentication

Enable access control (create users):

```
use admin
db.createUser({
  user: "admin",
  pwd: "password",
  roles: [{ role: "userAdminAnyDatabase", db: "admin" }]
})
```

Start mongod with --auth.

Role-Based Access Control (RBAC)

Built‑in roles: read, readWrite, dbAdmin, userAdmin, clusterAdmin, root.

Grant:

```
db.grantRolesToUser("alice", [{ role: "readWrite", db: "myDB" }])
```

Encryption

· TLS/SSL: encrypt data in transit.
· Encryption at rest: WiredTiger encryption (available in Enterprise/Atlas).
· Client‑side field level encryption (CSFLE): encrypt specific fields before sending to the server.

Network Security

· Bind IP to localhost in development.
· Use firewall, VPN, and never expose MongoDB directly to the internet without proper configuration.

Auditing

Enterprise feature to log all operations.

---

13. Backup & Restore

mongodump / mongorestore

Logical backup:

```bash
mongodump --uri="mongodb://localhost:27017" --out=/backup
mongorestore --uri="mongodb://localhost:27017" /backup
```

Filesystem Snapshots

If using WiredTiger, you can take filesystem snapshots of data directory (consistent with journal).

MongoDB Atlas

Automated continuous backups and point‑in‑time recovery.

Backup with oplog

mongodump --oplog creates a point‑in‑time snapshot.

---

14. Monitoring & Performance

MongoDB Tools

· mongostat: real‑time metrics (inserts, queries, network, etc.)
· mongotop: shows read/write activity per collection
· db.serverStatus(): comprehensive server status
· db.currentOp(): current running operations

Database Profiler

Set profiling level:

```
db.setProfilingLevel(2)  // log all operations
db.system.profile.find({ ns: "myDB.myCollection" }).sort({ ts: -1 }).limit(5)
```

Explain Plan

Analyze query performance as shown in indexing section.

Index Usage

```
db.collection.aggregate([{ $indexStats: {} }])
```

Performance Advisors

Atlas provides Performance Advisor and slow query logs.

Key Metrics

· Queues (readers/writers)
· Lock percentage
· Cache utilization (WiredTiger cache)
· Oplog window (replication lag)

---

15. Drivers & ODMs

MongoDB Node.js Native Driver

As shown in CRUD examples. Use the official mongodb package.

```js
const { MongoClient } = require('mongodb');
const client = new MongoClient(uri);
await client.connect();
const db = client.db('test');
const result = await db.collection('users').findOne({ _id: ObjectId("...") });
```

Mongoose (ODM)

Provides schema definitions, validation, middleware, and query building.

```js
const mongoose = require('mongoose');
await mongoose.connect('mongodb://localhost/test');

const userSchema = new mongoose.Schema({
  name: String,
  email: { type: String, required: true, unique: true },
  age: Number
});
const User = mongoose.model('User', userSchema);

// Create
const user = new User({ name: 'Alice', email: 'a@b.com' });
await user.save();

// Query
const users = await User.find({ age: { $gte: 18 } });

// Update
await User.updateOne({ _id: id }, { $set: { name: 'Bob' } });
```

Other Drivers

Python (pymongo), Java, C#, etc.

---

16. Advanced Topics

Change Streams

Real‑time notifications of database changes. Available on replica sets and sharded clusters.

```js
const changeStream = collection.watch();
changeStream.on('change', next => {
  console.log(next);
});
```

Filters can be applied: collection.watch([{ $match: { operationType: 'insert' } }]).

GridFS

Stores large files (>16 MB) by splitting into chunks. Two collections: fs.files and fs.chunks.

```js
const bucket = new mongodb.GridFSBucket(db);
const uploadStream = bucket.openUploadStream('myFile.txt');
fs.createReadStream('./file.txt').pipe(uploadStream);
```

Full-Text Search

Use text indexes:

```
db.articles.createIndex({ body: "text" })
db.articles.find({ $text: { $search: "mongodb" } })
```

Atlas Search (full‑text engine based on Lucene) provides richer capabilities.

Geospatial Queries

2dsphere index for geometry queries:

```
db.places.createIndex({ location: "2dsphere" })
db.places.find({
  location: {
    $near: {
      $geometry: { type: "Point", coordinates: [-73.97, 40.77] },
      $maxDistance: 1000
    }
  }
})
```

Time Series Collections (v5.0+)

Optimized for time‑series data (sensors, logs). Automatically optimizes storage and indexing.

```
db.createCollection("sensorData", {
  timeseries: { timeField: "timestamp", metaField: "metadata" }
})
```

Schema Validation

Define JSON Schema to enforce document structure.

```
db.createCollection("users", {
  validator: {
    $jsonSchema: {
      bsonType: "object",
      required: ["name", "email"],
      properties: {
        name: { bsonType: "string", description: "must be a string" },
        email: { bsonType: "string", pattern: "^.+@.+$" }
      }
    }
  }
})
```

Capped Collections

Fixed‑size collections that maintain insertion order; old documents are automatically removed (circular buffer). Good for logs and queues.

```
db.createCollection("log", { capped: true, size: 5242880, max: 5000 })
```

Aggregation: $facet, $merge

$facet runs multiple pipelines on the same input:

```
db.collection.aggregate([
  { $facet: {
      "category1": [ { $match: { type: "A" } }, ... ],
      "category2": [ { $match: { type: "B" } }, ... ]
  }}
])
```

$merge writes results to an existing collection (upsert/merge behavior).

Atlas (Cloud)

MongoDB Atlas provides fully managed databases, auto‑scaling, global clusters, and integrated features like Atlas Search, Data Lake, and Charts.

---

17. Best Practices

· Design schema based on access patterns: embed what is read together, reference what is independent.
· Choose appropriate shard keys to ensure even distribution and avoid hotspotting.
· Index fields used in queries, especially for large collections.
· Monitor slow queries and optimize with indexes or schema changes.
· Use the latest MongoDB version for performance and features.
· Secure your deployment: enable auth, use TLS, restrict network access, use least‑privilege roles.
· Regular backups and test restore procedures.
· Avoid unbounded arrays; consider referencing instead.
· Limit result size with limit() and use projections.
· Use connection pooling in drivers (MongoClient handles it).
· Handle errors and retry transient network issues.
· Use transactions sparingly; design data models to avoid them when possible.

---

This guide covers MongoDB from basics to advanced production‑ready topics, with practical examples and explanations suitable for interviews. For interacting with MongoDB in Node.js, refer to the driver and Mongoose sections, as they integrate with Express.js and Node.js.
