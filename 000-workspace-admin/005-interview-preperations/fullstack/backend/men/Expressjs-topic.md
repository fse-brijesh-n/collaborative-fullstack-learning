Express.js In-Depth Interview Preparation Guide

This guide covers Express.js from beginner to advanced concepts, with detailed explanations and code snippets. It assumes a working knowledge of Node.js fundamentals.

---

1. What is Express.js?

Express.js is a minimal, unopinionated web framework for Node.js. It provides a thin layer of fundamental web application features—routing, middleware, and HTTP utilities—on top of Node's http module. It is part of the MEAN/MERN stacks and is the most popular Node.js framework.

Key features:

· Robust routing (URL-based, HTTP method-based)
· Middleware support for extending functionality
· Template engine integration
· Simple error handling
· Easily extensible with thousands of third-party middleware

---

2. Setting Up an Express Application

Installation

```bash
npm init -y
npm install express
```

Basic Server

```js
const express = require('express');
const app = express();
const PORT = process.env.PORT || 3000;

app.get('/', (req, res) => {
  res.send('Hello World');
});

app.listen(PORT, () => {
  console.log(`Server running on port ${PORT}`);
});
```

Express Application Generator (scaffolding)

```bash
npx express-generator myapp --view=ejs
cd myapp && npm install
npm start
```

Creates a skeleton with routes, views, and public folder.

---

3. Middleware

Middleware functions have access to the request (req), response (res), and the next function in the request‑response cycle. They can:

· Execute code
· Modify req and res
· End the request–response cycle
· Call the next middleware

Types of Middleware

· Application-level – app.use() or app.METHOD()
· Router-level – router.use()
· Error-handling – four arguments (err, req, res, next)
· Built-in – express.static(), express.json(), express.urlencoded()
· Third-party – morgan, cors, etc.

Execution Order

Middlewares are executed in the order they are added. You can attach to a specific path or globally.

Example: Custom Logger

```js
app.use((req, res, next) => {
  console.log(`${req.method} ${req.url} - ${new Date().toISOString()}`);
  next();
});
```

Place it before routes.

Common Middleware

· express.json() – parses JSON request bodies (replaces body-parser)
· express.urlencoded({ extended: true }) – parses URL-encoded bodies
· express.static('public') – serves static files from public/ directory
· morgan – HTTP request logger
· cors – enables Cross-Origin Resource Sharing
· helmet – sets security headers
· compression – gzip compression
· cookie-parser – parse cookies

Example combining:

```js
const express = require('express');
const morgan = require('morgan');
const cors = require('cors');
const helmet = require('helmet');
const compression = require('compression');
const app = express();

app.use(helmet());
app.use(cors({ origin: 'https://example.com' }));
app.use(compression());
app.use(morgan('combined'));
app.use(express.json());
app.use(express.static('public'));
```

---

4. Routing

Routing refers to determining how an application responds to a client request at a particular endpoint (URI/path) and HTTP method.

Basic Route

```js
app.get('/users', (req, res) => {
  res.json([{ id: 1, name: 'John' }]);
});
```

Route Parameters

```js
app.get('/users/:id', (req, res) => {
  const id = req.params.id;
  // retrieve user by id
  res.json({ id, name: 'John' });
});
```

Multiple parameters: /users/:userId/books/:bookId

Query Strings

Accessed via req.query:

```js
app.get('/search', (req, res) => {
  const { q, page } = req.query;
  res.send(`Search for: ${q}, page: ${page}`);
});
```

Route Handlers Chaining

Pass multiple callbacks or an array:

```js
app.get('/dashboard',
  authenticate,
  authorize('admin'),
  (req, res) => {
    res.render('dashboard');
  }
);
```

Router Module (express.Router)

For modularizing routes:

```js
// routes/users.js
const router = require('express').Router();

router.get('/', (req, res) => {
  res.send('User list');
});
router.post('/', (req, res) => {
  res.status(201).send('User created');
});
module.exports = router;

// app.js
const userRouter = require('./routes/users');
app.use('/users', userRouter);
```

app.use vs app.all vs app.route

· app.use('/path', ...) – matches any HTTP method whose path starts with the prefix.
· app.all('/path', ...) – matches all HTTP methods for the exact path.
· app.route('/path') – chain methods for same path:
  ```js
  app.route('/book')
    .get((req, res) => res.send('Get a book'))
    .post((req, res) => res.send('Add a book'))
    .put((req, res) => res.send('Update the book'));
  ```

Express 5 vs 4 routing (if asked)

Express 5 introduces better async support and path‑to‑regexp updates, but the concepts remain.

---

5. Request and Response Objects

Request (req)

Important properties:

· req.params – route parameters (:id)
· req.query – query string parameters
· req.body – parsed request body (needs express.json() etc.)
· req.headers – request headers
· req.cookies – cookies (needs cookie-parser)
· req.ip – client IP
· req.path – the URL path without query
· req.method – HTTP method

Methods:

· req.accepts(types) – content negotiation
· req.get(field) – get a specific header

Response (res)

Important methods:

· res.send(body) – send response of various types (Buffer, String, Object, Array)
· res.json(obj) – send JSON response (sets Content-Type)
· res.status(code) – set HTTP status (chainable)
· res.redirect([status,] path) – redirect
· res.sendFile(path [, options]) – send a file
· res.download(path [, filename]) – prompt download
· res.render(view [, locals]) – render a view
· res.set(field, value) / res.header() – set headers
· res.cookie(name, value [, options]) – set a cookie
· res.end() – end response without data

---

6. Serving Static Files

Use express.static middleware:

```js
app.use(express.static('public'));
// Multiple directories
app.use('/static', express.static('public'));
app.use('/uploads', express.static('uploads'));
```

Now http://localhost:3000/style.css serves public/style.css.

For production, consider a reverse proxy (Nginx) to serve static files more efficiently.

---

7. Template Engines

Express supports many template engines (Pug, EJS, Handlebars, etc.). Set it up:

```bash
npm install ejs
```

```js
app.set('view engine', 'ejs');
// Optional: set custom views directory (default is ./views)
app.set('views', './views');
```

Render a view:

```js
app.get('/', (req, res) => {
  res.render('index', { title: 'Home', message: 'Hello' });
});
```

views/index.ejs:

```html
<!DOCTYPE html>
<html>
<head><title><%= title %></title></head>
<body><h1><%= message %></h1></body>
</html>
```

---

8. Error Handling

Synchronous Errors

Express catches errors thrown inside route handlers automatically.

Asynchronous Errors

In Express 4, uncaught rejections in async route handlers will not be caught automatically (they result in UnhandledPromiseRejection). You must pass errors to next(err) or use a wrapper.

Solutions:

1. Manually catch:

```js
app.get('/data', async (req, res, next) => {
  try {
    const data = await fetchData();
    res.json(data);
  } catch (err) {
    next(err); // pass to error-handling middleware
  }
});
```

2. Use an async wrapper:

```js
const asyncHandler = fn => (req, res, next) =>
  Promise.resolve(fn(req, res, next)).catch(next);

app.get('/data', asyncHandler(async (req, res) => {
  const data = await fetchData();
  res.json(data);
}));
```

3. Use express-async-errors:

```js
require('express-async-errors');
// Now async errors are passed to next automatically
```

Error-Handling Middleware

Defined with four parameters (err, req, res, next):

```js
app.use((err, req, res, next) => {
  console.error(err.stack);
  res.status(err.status || 500).json({
    error: {
      message: err.message,
      status: err.status || 500
    }
  });
});
```

Place it after all other routes and middlewares.

Creating Errors with http-errors

```js
const createError = require('http-errors');
app.get('/user', (req, res, next) => {
  if (!req.query.id) next(createError(400, 'Missing id'));
  // ...
});
```

404 Handling

Add as the last route before error handler:

```js
app.use((req, res, next) => {
  next(createError(404, 'Not Found'));
});
```

---

9. Security

Helmet

Sets various HTTP headers to protect against well-known vulnerabilities.

```js
const helmet = require('helmet');
app.use(helmet());
```

Rate Limiting

Prevent brute-force and DoS attacks with express-rate-limit.

```js
const rateLimit = require('express-rate-limit');
const limiter = rateLimit({
  windowMs: 15 * 60 * 1000, // 15 minutes
  max: 100,
  standardHeaders: true,
  legacyHeaders: false,
});
app.use('/api/', limiter);
```

CORS

```js
const cors = require('cors');
app.use(cors({ origin: 'https://example.com', credentials: true }));
```

For preflight requests, the cors middleware handles OPTIONS automatically.

CSRF Protection

Use csrf-csrf (double submit cookie pattern) as csurf is deprecated.

```js
const { doubleCsrf } = require('csrf-csrf');
const { generateToken, doubleCsrfProtection, invalidCsrfTokenError } = doubleCsrf({
  getSecret: (req) => req.secret, // use a persistent secret or session secret
  cookieName: 'x-csrf-token',
  cookieOptions: { sameSite: 'strict', secure: true, httpOnly: true },
  size: 64,
});

app.use(doubleCsrfProtection);
// expose a route to get the token
app.get('/csrf-token', (req, res) => {
  res.json({ csrfToken: generateToken(req) });
});
// The client must send the token in headers ('x-csrf-token') or as a hidden field.

// Error handling for CSRF token errors
app.use((err, req, res, next) => {
  if (err === invalidCsrfTokenError) {
    return res.status(403).json({ error: 'Invalid CSRF token' });
  }
  next(err);
});
```

Input Validation

Always validate user input to prevent injection attacks.

```js
const { body, validationResult } = require('express-validator');
app.post('/register',
  body('email').isEmail().normalizeEmail(),
  body('password').isLength({ min: 8 }).withMessage('Must be at least 8 chars'),
  (req, res) => {
    const errors = validationResult(req);
    if (!errors.isEmpty()) return res.status(400).json({ errors: errors.array() });
    // ... proceed with valid data
  }
);
```

Additional Measures

· Enable HTTPS (via reverse proxy or built-in)
· Prevent parameter pollution using hpp
· Sanitize MongoDB queries with express-mongo-sanitize
· Set cookie: { secure: true, httpOnly: true } for session cookies
· Avoid exposing error stack traces in production

---

10. Authentication & Authorization

JWT (JSON Web Tokens)

Stateless authentication using signed tokens.

Install: jsonwebtoken, bcryptjs (for password hashing)

```js
const jwt = require('jsonwebtoken');
const bcrypt = require('bcryptjs');

// Register
app.post('/register', async (req, res) => {
  const hashedPassword = await bcrypt.hash(req.body.password, 12);
  const user = await User.create({ email: req.body.email, password: hashedPassword });
  res.status(201).json({ id: user.id });
});

// Login
app.post('/login', async (req, res) => {
  const user = await User.findOne({ email: req.body.email });
  if (!user || !(await bcrypt.compare(req.body.password, user.password))) {
    return res.status(401).json({ message: 'Invalid credentials' });
  }
  const token = jwt.sign({ userId: user.id }, process.env.JWT_SECRET, { expiresIn: '1h' });
  res.json({ token });
});

// Middleware to protect routes
function authenticateToken(req, res, next) {
  const authHeader = req.headers['authorization'];
  const token = authHeader && authHeader.split(' ')[1]; // Bearer TOKEN
  if (!token) return res.sendStatus(401);
  jwt.verify(token, process.env.JWT_SECRET, (err, user) => {
    if (err) return res.sendStatus(403);
    req.user = user;
    next();
  });
}

// Protect a route
app.get('/profile', authenticateToken, (req, res) => {
  res.json({ userId: req.user.userId });
});
```

Passport.js

Middleware supporting multiple authentication strategies (local, JWT, Google, GitHub, etc.). Set up strategy, initialize Passport, and use passport.authenticate() as middleware.

Session-Based Authentication

Using express-session and a session store (e.g., Redis).

```js
const session = require('express-session');
const RedisStore = require('connect-redis')(session);

app.use(session({
  store: new RedisStore({ client: redisClient }),
  secret: process.env.SESSION_SECRET,
  resave: false,
  saveUninitialized: false,
  cookie: { secure: process.env.NODE_ENV === 'production', httpOnly: true, maxAge: 24*60*60*1000 }
}));

// Login sets req.session.userId = user.id
// Logout destroys session
app.post('/logout', (req, res) => {
  req.session.destroy(err => {
    if (err) return res.status(500).send('Could not log out.');
    res.clearCookie('connect.sid');
    res.send('Logged out');
  });
});
```

---

11. File Uploads

Use multer to handle multipart/form-data.

```bash
npm install multer
```

Basic Single File Upload

```js
const multer = require('multer');
const upload = multer({ dest: 'uploads/' }); // temporary folder

app.post('/profile', upload.single('avatar'), (req, res) => {
  console.log(req.file); // file info
  console.log(req.body); // other fields
  res.send('File uploaded');
});
```

Configuring Storage & File Filters

```js
const storage = multer.diskStorage({
  destination: (req, file, cb) => cb(null, 'public/uploads'),
  filename: (req, file, cb) => {
    const uniqueSuffix = Date.now() + '-' + Math.round(Math.random() * 1E9);
    cb(null, file.fieldname + '-' + uniqueSuffix + path.extname(file.originalname));
  }
});
const fileFilter = (req, file, cb) => {
  if (file.mimetype.startsWith('image/')) cb(null, true);
  else cb(new Error('Only images allowed'), false);
};
const upload = multer({ storage, fileFilter, limits: { fileSize: 5 * 1024 * 1024 } });
```

Multiple Files

· upload.array('photos', 12) – multiple files with same field name
· upload.fields([{ name: 'avatar', maxCount: 1 }, { name: 'gallery', maxCount: 8 }])

Error Handling for Multer

Multer errors are attached to err and can be caught in error-handling middleware:

```js
app.post('/upload', (req, res, next) => {
  upload.single('avatar')(req, res, (err) => {
    if (err) {
      if (err.code === 'LIMIT_FILE_SIZE') return res.status(413).send('File too large');
      return res.status(400).send(err.message);
    }
    // proceed
  });
});
```

---

12. Cookies & Sessions

Cookies

Use cookie-parser:

```js
const cookieParser = require('cookie-parser');
app.use(cookieParser());

// Set cookie
res.cookie('name', 'value', { maxAge: 900000, httpOnly: true, secure: true, sameSite: 'strict' });
// Read cookie
const name = req.cookies.name;
// Clear cookie
res.clearCookie('name');
```

Sessions

express-session stores session data on the server, with only a session ID sent as a cookie. For production, use a scalable store (Redis, MongoDB).

```js
const session = require('express-session');
app.use(session({
  secret: 'your-secret-key',
  resave: false,
  saveUninitialized: false,
  store: MongoStore.create({ mongoUrl: 'mongodb://localhost/sessions' }) // example
}));
```

Session data is accessed via req.session.

---

13. Logging

· morgan – HTTP request logging (standard Apache combined, dev, etc.)
· winston / pino – general-purpose logging with levels, transports, and structured output.

Example with winston:

```js
const winston = require('winston');
const logger = winston.createLogger({
  level: 'info',
  format: winston.format.json(),
  transports: [new winston.transports.File({ filename: 'error.log', level: 'error' }),
               new winston.transports.File({ filename: 'combined.log' })]
});
if (process.env.NODE_ENV !== 'production') {
  logger.add(new winston.transports.Console({ format: winston.format.simple() }));
}
app.use(morgan('combined', { stream: { write: message => logger.info(message.trim()) } }));
```

---

14. Database Integration

Express itself is database-agnostic, but common choices:

MongoDB with Mongoose

```js
const mongoose = require('mongoose');
mongoose.connect(process.env.MONGO_URI);

app.get('/users', async (req, res, next) => {
  try {
    const users = await User.find();
    res.json(users);
  } catch (err) { next(err); }
});
```

SQL with Sequelize (MySQL/PostgreSQL)

```js
const { Sequelize, DataTypes } = require('sequelize');
const sequelize = new Sequelize(process.env.DB_URL);

const User = sequelize.define('User', {
  name: DataTypes.STRING,
  email: DataTypes.STRING
});

app.get('/users', async (req, res, next) => {
  const users = await User.findAll();
  res.json(users);
});
```

Connection Pooling is handled by the driver/ORM.

---

15. MVC Pattern & Project Structure

Example folder layout:

```
├── src/
│   ├── controllers/
│   │   └── userController.js
│   ├── models/
│   │   └── userModel.js
│   ├── routes/
│   │   └── userRoutes.js
│   ├── middlewares/
│   │   ├── auth.js
│   │   └── errorHandler.js
│   ├── services/
│   │   └── userService.js
│   └── app.js
├── public/
├── views/
├── .env
└── package.json
```

Controller example:

```js
// controllers/userController.js
exports.getAllUsers = async (req, res, next) => {
  try {
    const users = await User.find();
    res.json(users);
  } catch (err) { next(err); }
};
```

Routes:

```js
const router = require('express').Router();
const userController = require('../controllers/userController');
router.get('/', userController.getAllUsers);
module.exports = router;
```

---

16. Environment Variables & Configuration

Use dotenv to load .env:

```js
require('dotenv').config();
const config = {
  port: process.env.PORT || 3000,
  dbUrl: process.env.DATABASE_URL,
  jwtSecret: process.env.JWT_SECRET
};
```

Never commit .env; provide a .env.example with dummy values.

---

17. Caching

· In-memory caching (e.g., node-cache) for small, frequent data.
· Redis for distributed, persistent caching.

Example using Redis:

```js
const redis = require('redis');
const client = redis.createClient({ url: process.env.REDIS_URL });
client.connect();

app.get('/posts/:id', async (req, res, next) => {
  try {
    const cacheKey = `post:${req.params.id}`;
    const cached = await client.get(cacheKey);
    if (cached) return res.json(JSON.parse(cached));
    const post = await Post.findById(req.params.id);
    await client.setEx(cacheKey, 3600, JSON.stringify(post));
    res.json(post);
  } catch (err) { next(err); }
});
```

---

18. API Design Best Practices

· Use nouns for resources, HTTP methods for actions (GET /users, POST /users, etc.).
· Version your API (/api/v1/users).
· Return proper status codes: 200, 201, 204, 400, 401, 403, 404, 500.
· Consistent error response format: { error: { message, status } }.
· Support filtering, sorting, pagination via query params:
  ```js
  app.get('/books', async (req, res) => {
    const { page = 1, limit = 10, sort = 'title' } = req.query;
    const books = await Book.find()
      .sort(sort)
      .skip((page - 1) * limit)
      .limit(Number(limit));
    res.json({ data: books, page: Number(page), limit: Number(limit) });
  });
  ```

---

19. Advanced Routing Patterns

Nested Routes & Merge Params

When using express.Router, you can preserve parent parameters with mergeParams: true.

```js
const router = express.Router({ mergeParams: true });
router.get('/:commentId', (req, res) => {
  // req.params.postId, req.params.commentId
});
app.use('/posts/:postId/comments', router);
```

Route-Level Middleware

Apply middleware to a specific route or router:

```js
router.use(authMiddleware);
// or
router.get('/profile', authMiddleware, controller);
```

Router Parameters

router.param() runs for certain param.

```js
router.param('id', (req, res, next, id) => {
  User.findById(id, (err, user) => {
    if (err) return next(err);
    if (!user) return next(new Error('User not found'));
    req.user = user;
    next();
  });
});
router.get('/:id', (req, res) => {
  res.json(req.user);
});
```

---

20. Compression

Enable gzip compression using compression middleware to reduce response size.

```js
const compression = require('compression');
app.use(compression({ level: 6 })); // level 0-9, 6 is default good balance
```

---

21. Performance Optimization

· Use the cluster module or PM2 to utilize all CPU cores.
· Serve static assets via Nginx instead of Express.
· Enable gzip compression.
· Use caching (Redis, in-memory) for frequent queries.
· Avoid synchronous code in production.
· Set NODE_ENV=production to enable view caching, less verbose logs, etc.
· Limit body size to prevent large payloads:
  ```js
  app.use(express.json({ limit: '10kb' }));
  ```
· Use express-slow-down to delay repeated requests from an IP.

---

22. Testing Express Applications

Integration Testing with Supertest

```js
const request = require('supertest');
const app = require('../app');

describe('GET /', () => {
  it('responds with Hello World', async () => {
    const response = await request(app).get('/');
    expect(response.statusCode).toBe(200);
    expect(response.text).toBe('Hello World');
  });
});

describe('POST /users', () => {
  it('creates a user and returns 201', async () => {
    const res = await request(app)
      .post('/users')
      .send({ name: 'Alice', email: 'alice@example.com' });
    expect(res.statusCode).toBe(201);
    expect(res.body).toHaveProperty('id');
  });
});
```

Mocking Dependencies

Use Jest to mock modules (e.g., database calls, external APIs) during unit tests.

End-to-End Testing

Cypress, Playwright, or Selenium can test Express apps from the browser.

---

23. Graceful Shutdown & Health Checks

Graceful Shutdown

Handle SIGTERM and SIGINT to close the server and database connections cleanly.

```js
const server = app.listen(PORT, () => console.log(`Server running`));

const shutdown = () => {
  console.log('Shutting down gracefully...');
  server.close(() => {
    console.log('Closed remaining connections');
    mongoose.connection.close(false).then(() => {
      console.log('DB disconnected');
      process.exit(0);
    });
  });
  setTimeout(() => { console.error('Forcing shutdown'); process.exit(1); }, 10000);
};
process.on('SIGTERM', shutdown);
process.on('SIGINT', shutdown);
```

Health Check Endpoint

Provide a simple endpoint for load balancers / orchestrators.

```js
app.get('/health', (req, res) => res.status(200).json({ status: 'UP' }));
```

---

24. CORS Detailed

Preflight requests: browsers automatically send an OPTIONS request before non‑simple requests. The cors middleware handles it. For custom preflight handling, configure options:

```js
const corsOptions = {
  origin: function (origin, callback) {
    const whitelist = ['http://example1.com', 'http://example2.com'];
    if (whitelist.indexOf(origin) !== -1 || !origin) callback(null, true);
    else callback(new Error('Not allowed by CORS'));
  },
  methods: ['GET', 'POST', 'PUT'],
  allowedHeaders: ['Content-Type', 'Authorization'],
  credentials: true,
  maxAge: 86400
};
app.use(cors(corsOptions));
```

---

25. Custom Middleware Examples

Timing Middleware

```js
app.use((req, res, next) => {
  const start = process.hrtime();
  res.on('finish', () => {
    const diff = process.hrtime(start);
    const time = diff[0] * 1e3 + diff[1] * 1e-6; // ms
    console.log(`${req.method} ${req.originalUrl} ${time.toFixed(2)}ms`);
  });
  next();
});
```

Auth Middleware (simplified)

```js
function isAuthenticated(req, res, next) {
  if (req.session && req.session.userId) return next();
  return res.status(401).json({ message: 'Not authenticated' });
}
app.use('/admin', isAuthenticated);
```

---

26. TypeScript with Express

```bash
npm install typescript @types/node @types/express ts-node
npx tsc --init
```

Example:

```ts
import express, { Request, Response, NextFunction } from 'express';
const app = express();

app.get('/hello', (req: Request, res: Response) => {
  res.send('Hello TypeScript');
});

interface User {
  id: number;
  name: string;
}
app.get('/user', (req: Request<{}, {}, {}, {id: string}>, res: Response<User>) => {
  res.json({ id: Number(req.query.id), name: 'Alice' });
});

app.listen(3000, () => console.log('TS server'));
```

---

27. GraphQL with Express

GraphQL can be added as Express middleware using express-graphql or Apollo Server.

```js
const { graphqlHTTP } = require('express-graphql');
const { buildSchema } = require('graphql');

const schema = buildSchema(`
  type Query {
    hello: String
    user(id: Int!): User
  }
  type User {
    id: Int
    name: String
  }
`);

const root = {
  hello: () => 'Hello world!',
  user: ({id}) => ({ id, name: `User ${id}` })
};

app.use('/graphql', graphqlHTTP({
  schema,
  rootValue: root,
  graphiql: true // interactive playground
}));
```

---

28. Deploying Express

Development

node app.js or nodemon app.js for auto-restart.

Production

· Set NODE_ENV=production
· Use a process manager like PM2:
  ```bash
  pm2 start app.js -i max --name my-api
  ```
· Use Nginx as a reverse proxy (or cloud provider's load balancer)
· Run behind HTTPS

Docker

```dockerfile
FROM node:18-alpine
WORKDIR /app
COPY package*.json ./
RUN npm ci --production
COPY . .
EXPOSE 3000
CMD ["node", "app.js"]
```

PM2 Configuration (ecosystem.config.js)

```js
module.exports = {
  apps: [{
    name: 'api',
    script: 'app.js',
    instances: 'max',
    exec_mode: 'cluster',
    env: { NODE_ENV: 'production' }
  }]
};
```

---

29. Common Third-Party Middleware Quick Reference

Middleware Purpose
helmet Security headers
cors Cross-origin resource sharing
compression Gzip compression
morgan HTTP request logging
cookie-parser Parsing cookies
express-session Session management
express-rate-limit Rate limiting
express-validator Input validation
multer File upload handling
passport Authentication
connect-redis Redis session store
hpp HTTP Parameter Pollution protection
csurf (deprecated) / csrf-csrf CSRF protection

---

This comprehensive guide covers Express.js from foundational concepts to advanced production‑ready patterns, equipping you for in‑depth interviews.
