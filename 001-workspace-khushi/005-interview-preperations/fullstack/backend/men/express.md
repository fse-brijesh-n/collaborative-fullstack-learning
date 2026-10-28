1. **What is Express.js, and why is it used?**
   - Express.js is a web framework for Node.js used to build web applications and APIs. It simplifies routing, middleware integration, and request handling.

2. **How do you install and set up Express in a Node.js project?**
   - Install using `npm install express`, then create a server using `const express = require('express'); const app = express();`.

3. **What are middleware functions in Express?**
   - Middleware functions are functions that execute during the request-response cycle. They can modify request/response objects, end requests, or pass control.

4. **How do you define a basic route in Express?**
   - Use `app.get('/route', (req, res) => { res.send('Hello!'); });` to define a route.

5. **What is the difference between `app.use()` and `app.get()`?**
   - `app.use()` applies middleware to all requests, while `app.get()` handles specific GET requests.

6. **How do you handle POST requests in Express?**
   - Use `app.post('/route', (req, res) => { res.send(req.body); });` and include `express.json()` middleware.

7. **What is `express.Router()` and why is it used?**
   - It allows you to create modular route handlers and separate routes into different files.

8. **How do you handle query parameters in Express?**
   - Use `req.query`, e.g., `req.query.name` for `/route?name=John`.

9. **How do you handle route parameters in Express?**
   - Use `req.params`, e.g., `req.params.id` for `/users/:id`.

10. **How do you implement error handling in Express?**
    - Use middleware: `app.use((err, req, res, next) => { res.status(500).send('Error'); });`.

11. **What is CORS and how do you enable it in Express?**
    - CORS allows cross-origin requests. Enable it using `npm install cors` and `app.use(require('cors')())`.

12. **How do you serve static files in Express?**
    - Use `app.use(express.static('public'))`.

13. **How do you handle form data in Express?**
    - Use `express.urlencoded({ extended: true })` middleware.

14. **What is `next()` in Express middleware?**
    - It passes control to the next middleware in the request-response cycle.

15. **How do you structure an Express application for a large project?**
    - Use modular routing, controllers, services, middleware, and configuration files.

16. **How do you implement authentication in Express?**
    - Use JWT, Passport.js, or session-based authentication.

17. **How do you handle file uploads in Express?**
    - Use `multer` middleware.

18. **How do you connect Express with a database like MongoDB?**
    - Use Mongoose: `mongoose.connect('mongodb://localhost:27017/dbname')`.

19. **What are status codes in Express?**
    - HTTP status codes like 200 (OK), 404 (Not Found), 500 (Internal Server Error).

20. **How do you log requests in Express?**
    - Use `morgan` middleware.

21. **How do you enable sessions in Express?**
    - Use `express-session` package.

22. **How do you secure Express applications?**
    - Use helmet, rate limiting, sanitization, and authentication mechanisms.

23. **What is `app.locals` in Express?**
    - A storage for global variables accessible across the application.

24. **How do you use environment variables in Express?**
    - Use `dotenv` package to load `.env` file variables.

25. **What are some popular templating engines used with Express?**
    - EJS, Pug, Handlebars.

26. **How do you create a RESTful API with Express?**
    - Define routes for CRUD operations and use a database.

27. **What is rate limiting, and how do you implement it in Express?**
    - Limits requests using `express-rate-limit` middleware.

28. **How do you schedule tasks in an Express application?**
    - Use `node-cron` or `agenda`.

29. **What is the difference between synchronous and asynchronous middleware?**
    - Synchronous middleware runs sequentially, while asynchronous uses `async/await` or Promises.

30. **How do you prevent SQL injection in Express?**
    - Use parameterized queries and ORM libraries.

31. **How do you prevent XSS (Cross-Site Scripting) in Express?**
    - Use `helmet` and input sanitization.

32. **How do you prevent CSRF (Cross-Site Request Forgery) attacks?**
    - Use `csurf` middleware.

33. **How do you send an email in an Express application?**
    - Use `nodemailer` package.

34. **How do you compress responses in Express?**
    - Use `compression` middleware.

35. **What is an Express error-handling middleware?**
    - Middleware with four arguments: `(err, req, res, next) => {}`.

36. **How do you implement OAuth in an Express application?**
    - Use Passport.js with OAuth strategies.

37. **How do you manage dependencies in an Express project?**
    - Using `package.json` and `npm`.

38. **How do you implement WebSockets in an Express app?**
    - Use `socket.io` for real-time communication.

39. **How do you validate request data in Express?**
    - Use `express-validator`.

40. **How do you handle background jobs in Express?**
    - Use job queues like `bull` or `agenda`.

41. **What is the role of the `body-parser` module in Express?**
    - Parses request bodies (JSON, URL-encoded).

42. **How do you handle timeouts in Express?**
    - Use `connect-timeout` middleware.

43. **How do you handle concurrent requests in Express?**
    - Implement worker threads, clustering, or load balancing.

44. **What is an API Gateway, and how does it work with Express?**
    - An API Gateway manages API requests and routing.

45. **How do you unit test an Express application?**
    - Use Jest, Mocha, Supertest for testing endpoints.

46. **How do you handle multiple environments in an Express application?**
    - Use `.env` files and configuration objects.

47. **How do you integrate Redis with an Express application?**
    - Use `redis` package for caching.

48. **How do you debug an Express application?**
    - Use `console.log()`, `debug` module, or Node.js debugger.

49. **How do you set up HTTPS in Express?**
    - Use `https` module with SSL certificates.

50. **What is an ETag, and how does it work in Express?**
    - ETags help with caching and reducing unnecessary network traffic.
