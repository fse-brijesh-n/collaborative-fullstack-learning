Mongoose In-Depth Interview Preparation Guide

This guide covers Mongoose (the MongoDB ODM for Node.js) from basic setup to advanced patterns. It includes practical code examples and explanations essential for interviews and production usage.

---

1. Introduction to Mongoose

Mongoose is an Object Data Modeling (ODM) library for MongoDB and Node.js. It provides a schema-based solution to model application data, including built-in type casting, validation, query building, and business logic hooks.

Why Mongoose?

· Enforces a schema at the application level (MongoDB itself is schemaless).
· Provides validation and type casting.
· Simplifies queries with chainable syntax.
· Supports middleware (pre/post hooks) for cross-cutting concerns.
· Handles relationships via populate() (reference) and subdocuments (embedding).
· Offers transactions, aggregation pipelines, and plugins for reusable logic.

---

2. Installation & Setup

```bash
npm install mongoose
```

---

3. Connecting to MongoDB

```js
const mongoose = require('mongoose');

mongoose.connect('mongodb://localhost:27017/myapp')
  .then(() => console.log('Connected to MongoDB'))
  .catch(err => console.error('Connection error:', err));
```

Connection options (Mongoose 6+):

· useNewUrlParser, useUnifiedTopology no longer needed (they are default).
· Other common options: dbName, maxPoolSize, auth (via URI).

Events:

```js
mongoose.connection.on('connected', () => console.log('Mongoose connected'));
mongoose.connection.on('error', err => console.error(err));
mongoose.connection.on('disconnected', () => console.log('Mongoose disconnected'));
```

Graceful shutdown:

```js
process.on('SIGINT', async () => {
  await mongoose.connection.close();
  process.exit(0);
});
```

---

4. Schemas

A schema defines the structure of documents within a collection. It maps to MongoDB collections.

```js
const { Schema } = mongoose;

const userSchema = new Schema({
  name: String,
  age: Number,
  email: { type: String, unique: true, required: true },
  createdAt: { type: Date, default: Date.now }
});
```

4.1 SchemaTypes

Available types: String, Number, Date, Buffer, Boolean, Schema.Types.Mixed, Schema.Types.ObjectId, Array, Decimal128, Map.

```js
const blogSchema = new Schema({
  title: String,
  body: String,
  comments: [{ body: String, date: Date }],        // array of subdocuments
  meta: {                                          // nested object
    votes: Number,
    favs: Number
  },
  tags: [String],                                   // array of strings
  author: { type: Schema.Types.ObjectId, ref: 'User' },
  // Mixed: any type
  extra: Schema.Types.Mixed
});
```

4.2 Schema Options

```js
const opts = {
  timestamps: true,        // adds createdAt, updatedAt
  versionKey: false,       // removes __v
  collection: 'articles',  // explicit collection name
  strict: true,           // only fields in schema are saved (default true)
  toJSON: { virtuals: true },
  toObject: { virtuals: true },
  id: true                 // virtual id as string
};
const articleSchema = new Schema({ ... }, opts);
```

---

5. Models

A model is a compiled version of the schema that provides an interface to the database for creating, querying, updating, and deleting documents.

```js
const User = mongoose.model('User', userSchema); // collection name: 'users'
```

5.1 Creating Documents (Instances)

```js
const user = new User({
  name: 'Alice',
  age: 30,
  email: 'alice@example.com'
});

await user.save();  // saves to database
```

Alternatively, use model static methods:

```js
await User.create({ name: 'Bob', age: 25, email: 'bob@example.com' });
```

---

6. CRUD Operations

6.1 Create

· Model.create(doc) – inserts one or many documents.
· new Model(doc).save()

```js
const alice = await User.create({ name: 'Alice', email: 'alice@test.com' });
// multiple
const users = await User.create([
  { name: 'Bob', email: 'bob@test.com' },
  { name: 'Charlie', email: 'charlie@test.com' }
]);
```

6.2 Read

```js
// find all
const allUsers = await User.find();

// with filter
const adults = await User.find({ age: { $gte: 18 } });

// find one
const user = await User.findOne({ email: 'alice@test.com' });

// find by id
const userById = await User.findById('507f1f77bcf86cd799439011');

// query builder
const count = await User.countDocuments({ age: { $gt: 20 } });

// chaining
User.find({ age: { $gte: 18 } })
  .where('name').equals('Alice')
  .sort({ age: -1 })
  .limit(10)
  .select('name email')
  .exec((err, docs) => { ... });
```

6.3 Update

· Model.updateOne(filter, update, options)
· Model.updateMany(filter, update, options)
· Model.findByIdAndUpdate(id, update, options) – returns the document (by default, the old one, { new: true } returns the updated one).
· Model.findOneAndUpdate(filter, update, options)
· doc.save() after modifying fields (for instance updates with validation/hooks).

```js
// update one
await User.updateOne({ _id: userId }, { $set: { age: 31 } });

// find and update
const updated = await User.findByIdAndUpdate(
  userId,
  { $set: { age: 31 } },
  { new: true, runValidators: true }
);
```

6.4 Delete

· Model.deleteOne(filter)
· Model.deleteMany(filter)
· Model.findByIdAndDelete(id)
· Model.findOneAndDelete(filter)

```js
await User.deleteOne({ email: 'bob@test.com' });
await User.findByIdAndDelete(userId);
```

6.5 Bulk Operations

```js
await User.bulkWrite([
  { insertOne: { document: { name: 'X' } } },
  { updateOne: { filter: { name: 'Alice' }, update: { $set: { age: 32 } } } },
  { deleteOne: { filter: { name: 'Bob' } } }
]);
```

---

7. Schema Validation

Mongoose provides built-in and custom validators. Validation runs on save() (not on findOneAndUpdate unless runValidators: true).

7.1 Built-in Validators

```js
const productSchema = new Schema({
  name: { type: String, required: [true, 'Name is required'] },
  price: { type: Number, required: true, min: 0, max: 100000 },
  category: { type: String, enum: ['Electronics', 'Books', 'Clothing'] },
  tags: { type: [String], validate: {
    validator: v => v.length <= 5,
    message: 'Cannot have more than 5 tags'
  }}
});
```

7.2 Custom Validators

```js
const userSchema = new Schema({
  phone: {
    type: String,
    validate: {
      validator: function(v) {
        return /\d{3}-\d{3}-\d{4}/.test(v);
      },
      message: props => `${props.value} is not a valid phone number!`
    }
  }
});
```

7.3 Async Validators

```js
const userSchema = new Schema({
  email: {
    type: String,
    validate: {
      validator: async function(v) {
        const user = await this.constructor.findOne({ email: v });
        return !user; // return false if email exists
      },
      message: 'Email already exists'
    }
  }
});
```

7.4 Handling Validation Errors

```js
try {
  await user.save();
} catch (error) {
  if (error.name === 'ValidationError') {
    for (let field in error.errors) {
      console.log(error.errors[field].message);
    }
  }
}
```

---

8. Middleware (Hooks)

Middleware functions are executed before (pre) or after (post) certain operations. They can be document-level, query-level, aggregate-level, or model-level.

8.1 Document Middleware

Triggers on save, validate, remove, updateOne (for documents).

```js
userSchema.pre('save', function(next) {
  this.name = this.name.charAt(0).toUpperCase() + this.name.slice(1);
  next();
});

userSchema.post('save', function(doc, next) {
  console.log(`User ${doc._id} saved`);
  next();
});
```

Important: In pre('save'), this refers to the document being saved. For pre('updateOne'), this is the query.

8.2 Query Middleware

Applies to find, findOne, findOneAndUpdate, etc.

```js
userSchema.pre('find', function() {
  this.where({ active: true }); // only active users
});
// post example
userSchema.post('find', function(docs) {
  console.log(`Query returned ${docs.length} results`);
});
```

8.3 Aggregate Middleware

```js
userSchema.pre('aggregate', function() {
  this.pipeline().unshift({ $match: { active: true } });
});
```

8.4 Model Middleware

Triggers on insertMany.

8.5 Error Handling Middleware

```js
userSchema.post('save', function(error, doc, next) {
  if (error.name === 'MongoServerError' && error.code === 11000) {
    next(new Error('Duplicate key error'));
  } else {
    next(error);
  }
});
```

---

9. Virtuals

Virtuals are document properties that are computed on the fly and are not stored in MongoDB. They can be used for formatting or derived data.

```js
userSchema.virtual('fullName').get(function() {
  return `${this.firstName} ${this.lastName}`;
}).set(function(v) {
  const parts = v.split(' ');
  this.firstName = parts[0];
  this.lastName = parts[1];
});
```

Enable virtuals in JSON output with toJSON: { virtuals: true } schema option.

9.1 Virtual Population

Reverse references without storing foreign keys.

```js
// In User schema
userSchema.virtual('posts', {
  ref: 'Post',
  localField: '_id',
  foreignField: 'author'
});
// Later: await User.findOne().populate('posts');
```

---

10. Subdocuments & Nested Schemas

```js
const childSchema = new Schema({ name: String });
const parentSchema = new Schema({
  children: [childSchema],   // array of subdocuments
  spouse: childSchema        // single subdocument
});

// Access/modify subdocs
parent.children.push({ name: 'Emma' });
parent.children[0].name = 'Ella';
```

Subdocuments have their own _id (can be disabled with _id: false in schema). They trigger their own validation, middleware.

---

11. Population (References)

Population replaces specified paths in a document with documents from other collections.

```js
const storySchema = new Schema({
  author: { type: Schema.Types.ObjectId, ref: 'User' },
  fans: [{ type: Schema.Types.ObjectId, ref: 'User' }]
});
```

11.1 Basic Population

```js
const story = await Story.findOne({ title: 'My Story' }).populate('author');
// story.author is now a User document

// Multiple paths
await Story.find().populate('author').populate('fans');

// Select fields
await Story.find().populate('author', 'name email');
```

11.2 Nested Population (deep populate)

```js
await User.find()
  .populate({
    path: 'posts',
    populate: {
      path: 'comments',
      model: 'Comment',
      select: 'text'
    }
  });
```

11.3 Query Conditions in Populate

```js
await Story.find().populate({
  path: 'fans',
  match: { age: { $gte: 18 } },
  options: { limit: 5, sort: { name: 1 } }
});
```

Note: Unmatched documents will have null in the path; consider filtering out or using virtuals.

---

12. Indexes

Mongoose supports index creation via schema definitions.

```js
const userSchema = new Schema({
  email: { type: String, unique: true },  // unique index
  username: { type: String, index: true }, // simple index
  location: { type: { type: String, default: 'Point' }, coordinates: [Number] }
});
userSchema.index({ name: 1, age: -1 }); // compound index
userSchema.index({ description: 'text' }); // text index

// 2dsphere index
userSchema.index({ location: '2dsphere' });

// Ensure indexes in production (Mongoose builds them automatically but can use syncIndexes)
await User.syncIndexes(); // ensures indexes match schema
```

Options: background: true (deprecated in recent versions, but still accepted), sparse, unique, partialFilterExpression.

---

13. Query Building

Mongoose queries are not promises by default; they are thenable. You can execute them with .exec() (returns a proper Promise) or with callback/await (Mongoose 6+).

```js
// Without exec: await triggers the query, but exec is safer for stack traces
const users = await User.find({ age: { $gte: 18 } }).exec();
```

13.1 Query Helpers

Extend the query prototype for reusable chainable methods.

```js
userSchema.query.byName = function(name) {
  return this.where({ name: new RegExp(name, 'i') });
};
// usage
const users = await User.find().byName('alice').exec();
```

13.2 Statics

Add static methods to the model.

```js
userSchema.statics.findByName = function(name) {
  return this.find({ name: new RegExp(name, 'i') });
};
const users = await User.findByName('alice');
```

13.3 Instance Methods

Add methods to documents.

```js
userSchema.methods.sameLastName = function() {
  return this.model('User').find({ lastName: this.lastName });
};
const similar = await user.sameLastName();
```

---

14. Plugins

Reusable modules that extend schema functionality.

```js
function timestampPlugin(schema, options) {
  schema.add({ createdAt: Date, updatedAt: Date });
  schema.pre('save', function(next) {
    if (!this.createdAt) this.createdAt = new Date();
    this.updatedAt = new Date();
    next();
  });
}

const userSchema = new Schema({ name: String });
userSchema.plugin(timestampPlugin);
```

Popular third-party plugins: mongoose-paginate-v2, mongoose-autopopulate, mongoose-unique-validator, etc.

---

15. Transactions

Mongoose supports multi-document transactions since MongoDB 4.0 (replica set needed).

```js
const session = await mongoose.startSession();
session.startTransaction();

try {
  const user = await User.create([{ name: 'Alice' }], { session });
  await Account.create([{ userId: user[0]._id, balance: 0 }], { session });
  await session.commitTransaction();
  console.log('Transaction committed');
} catch (error) {
  await session.abortTransaction();
  console.error('Transaction aborted');
} finally {
  session.endSession();
}
```

Use the session option in all operations inside the transaction.

Important: For find queries within a transaction, you must also pass the session.

---

16. Discriminators

Discriminators allow you to store multiple related models in the same MongoDB collection, sharing the same base schema but having different schemas (polymorphism).

```js
const eventSchema = new Schema({ time: Date }, { discriminatorKey: 'kind' });
const Event = mongoose.model('Event', eventSchema);

// discriminator
const ClickedLinkEvent = Event.discriminator('ClickedLink', new Schema({
  url: String
}));

// Both stored in 'events' collection, distinguished by 'kind' field.
const event = new ClickedLinkEvent({ time: new Date(), url: 'https://...' });
await event.save(); // kind: 'ClickedLink'
```

Queries automatically return the correct document type.

---

17. Aggregation with Mongoose

Use Model.aggregate() to run pipelines. Mongoose casts types, but results are plain objects.

```js
const pipeline = [
  { $match: { status: 'active' } },
  { $group: { _id: '$category', total: { $sum: '$amount' } } },
  { $sort: { total: -1 } }
];
const results = await Transaction.aggregate(pipeline);
```

Adding virtuals: Aggregation results are plain objects; you may hydrate them back to Mongoose documents with Model.hydrate().

17.1 Using $lookup with Population

Aggregation's $lookup is more flexible than populate, but Mongoose's populate is often simpler.

---

18. Timestamps

Set timestamps: true in schema options to automatically add createdAt and updatedAt fields.

```js
const userSchema = new Schema({ name: String }, { timestamps: true });
// or custom field names
const userSchema = new Schema({ name: String }, { timestamps: { createdAt: 'created_at', updatedAt: 'updated_at' } });
```

updatedAt is updated when save() or findOneAndUpdate (with timestamps: true in options) is called.

---

19. Mongoose with TypeScript

Mongoose provides TypeScript support via @types/mongoose (included in newer versions) or native typed models.

```ts
import mongoose, { Schema, Document, Model } from 'mongoose';

interface IUser extends Document {
  name: string;
  email: string;
  age?: number;
}

const userSchema = new Schema<IUser>({
  name: { type: String, required: true },
  email: { type: String, required: true },
  age: Number
});

const User: Model<IUser> = mongoose.model<IUser>('User', userSchema);

// usage with types
const user = await User.findById(id).exec();
if (user) {
  user.name = 'Updated'; // typesafe
  await user.save();
}
```

---

20. Error Handling

Common errors:

· ValidationError – when schema validation fails.
· MongoServerError – e.g., duplicate key (code 11000).
· CastError – when casting fails (e.g., invalid ObjectId).
· VersionError – document modified by another operation (optimistic concurrency).

```js
try {
  await user.save();
} catch (err) {
  if (err.name === 'ValidationError') { ... }
  else if (err.code === 11000) { /* duplicate */ }
  else { throw err; }
}
```

---

21. Best Practices

· Design schemas based on your application's access patterns. Embed frequently accessed together, reference otherwise.
· Avoid unbounded arrays (e.g., large embedded arrays). Use separate collections and populate.
· Use select() to limit fields returned, especially for large documents.
· Use lean() for read-only queries that return plain JS objects (faster, no getters/setters/virtuals).
  ```js
  const users = await User.find().lean();
  ```
· Set maxTimeMS for queries to prevent long-running operations.
· Use runValidators: true when using findByIdAndUpdate to enforce validations.
· Handle connection events and reconnect logic (Mongoose default reconnection often works, but can be customized).
· Use indexes strategically; monitor performance with explain().
· Close connections gracefully on application shutdown.
· Use transactions only when ACID is needed; they have overhead.
· Prefer exec() for better stack traces.
· Sanitize user inputs to avoid NoSQL injection (Mongoose casts types, but use express-mongo-sanitize for extra safety).

---

This guide covers Mongoose from fundamental setup to advanced patterns, providing you with the knowledge to use it effectively in production and answer interview questions with confidence.
