Node.js In-Depth Interview Preparation Guide

This guide covers Node.js from beginner to advanced topics, with detailed explanations and code snippets. It is designed for interview preparation and deeper understanding of the runtime.

---

1. What is Node.js?

Node.js is an open-source, cross-platform JavaScript runtime environment that executes JavaScript code outside a browser. It uses Google Chrome’s V8 engine and is built on top of libuv, which provides the event loop and asynchronous I/O. Node.js enables building fast, scalable network applications using JavaScript.

Key characteristics:

· Single-threaded (main execution thread), but uses background threads (libuv thread pool) for I/O and heavy tasks.
· Event-driven – uses events and callbacks/promises.
· Non-blocking I/O – operations do not block the main thread.
· NPM ecosystem – largest package registry.

---

2. Installation & Version Management

· Download from nodejs.org (LTS recommended).
· Use nvm (Node Version Manager) for managing multiple versions:
  ```bash
  nvm install 20
  nvm use 20
  ```
· Check version: node -v
· REPL: type node in terminal.

---

3. Global Objects

Available in all modules without importing:

· global – the global namespace (similar to window in browsers; avoid polluting it).
· process – information and control over the current Node.js process.
· console – logging utility.
· Buffer, setTimeout, setInterval, setImmediate, clearTimeout, clearInterval.
· __dirname, __filename – only available in CommonJS modules (not in ESM without workarounds).

Example:

```js
console.log(__dirname);  // directory name of current module
console.log(__filename); // full path of current module
console.log(process.env.NODE_ENV);
process.exit(0);
```

---

4. Modules System

CommonJS (CJS)

Default module system. Uses require() and module.exports.

```js
// math.js
const add = (a, b) => a + b;
module.exports = { add };

// app.js
const math = require('./math');
console.log(math.add(2, 3)); // 5
```

Each file is wrapped in a function providing require, module, exports, __dirname, __filename.

ES Modules (ESM)

Enabled by using .mjs extension or "type": "module" in package.json.

```js
// math.mjs
export const add = (a, b) => a + b;

// app.mjs
import { add } from './math.mjs';
console.log(add(2, 3));
```

Differences:

· No require, module, __dirname, __filename by default; use import.meta.url.
· Strict mode by default.
· Async loading possible.

Module Caching

Modules are cached after first load. The same object is returned on subsequent require calls. To clear cache: delete require.cache[require.resolve('./module')].

Module Resolution Algorithm

· Core modules (e.g., fs) loaded first.
· File modules: relative/absolute paths with extensions .js, .json, .node (and .mjs for ESM).
· Directory: looks for index.js or package.json main field.
· node_modules traversal upward.

---

5. Package Management (npm / npx / yarn)

npm

· npm init -y creates package.json.
· Dependencies: npm install <pkg> (saves to dependencies).
· Dev dependencies: npm install --save-dev <pkg> (saves to devDependencies).
· Global install: npm install -g <pkg>.
· Scripts: define in "scripts" and run with npm run <script>.
· npm ci installs from package-lock.json for reproducible builds.
· npx executes packages without installing globally: npx create-react-app.

Semantic Versioning (semver)

MAJOR.MINOR.PATCH (e.g., 2.3.1).

· ^ (caret): allows minor and patch updates (^2.3.1 → 2.x.x).
· ~ (tilde): allows only patch updates (~2.3.1 → 2.3.x).
· *, >=, etc.

package-lock.json / yarn.lock

Locks exact dependency tree for consistency across environments.

---

6. Core Modules In-Depth

6.1 fs (File System)

Provides synchronous and asynchronous file operations. Use promise-based API (fs.promises) for modern code.

```js
const fs = require('fs');
const fsp = require('fs/promises');

// Asynchronous callback
fs.readFile('/path/file.txt', 'utf8', (err, data) => {
  if (err) throw err;
  console.log(data);
});

// Promise-based
await fsp.readFile('/path/file.txt', 'utf8');

// Stream-based for large files
const readStream = fs.createReadStream('bigfile.txt');
readStream.on('data', chunk => console.log(chunk));
readStream.on('end', () => console.log('Done'));
```

Watch for changes:

```js
fs.watch('file.txt', (event, filename) => {
  console.log(`File ${filename} changed: ${event}`);
});
// or fs.watchFile (polling)
```

Sync vs Async: Sync methods (e.g., fs.readFileSync) block the event loop; avoid in servers.

6.2 path

Utility for working with file paths, cross-platform.

```js
const path = require('path');
path.join('/foo', 'bar', 'baz');        // '/foo/bar/baz' (normalizes)
path.resolve('foo', 'bar');             // absolute path: /current/dir/foo/bar
path.basename('/foo/bar/baz.txt');      // 'baz.txt'
path.dirname('/foo/bar/baz.txt');       // '/foo/bar'
path.extname('index.html');             // '.html'
path.parse('/home/user/file.txt');      // { root, dir, base, ext, name }
```

6.3 os

Operating system-related utility methods.

```js
const os = require('os');
os.cpus().length;         // number of CPU cores
os.totalmem();
os.freemem();
os.platform();            // 'linux', 'darwin', 'win32'
os.homedir();
os.tmpdir();
os.networkInterfaces();
```

6.4 url

URL resolution and parsing.

```js
const url = require('url');
const myURL = new URL('https://example.com/path?name=Node#hash');
myURL.hostname;   // 'example.com'
myURL.pathname;   // '/path'
myURL.searchParams.get('name'); // 'Node'

// Legacy API
url.parse('https://example.com/path?name=Node', true);
url.format({ protocol: 'https', host: 'example.com', pathname: '/path' });
```

6.5 http and https

Create HTTP servers and make requests without frameworks.

```js
const http = require('http');

// Server
const server = http.createServer((req, res) => {
  const { method, url, headers } = req;
  let body = [];
  req.on('data', chunk => body.push(chunk));
  req.on('end', () => {
    body = Buffer.concat(body).toString();
    res.statusCode = 200;
    res.setHeader('Content-Type', 'application/json');
    res.end(JSON.stringify({ url, method, body }));
  });
});
server.listen(3000, () => console.log('Server on port 3000'));

// Client request
const options = {
  hostname: 'jsonplaceholder.typicode.com',
  path: '/todos/1',
  method: 'GET'
};
const req = http.request(options, res => {
  let data = '';
  res.on('data', chunk => data += chunk);
  res.on('end', () => console.log(JSON.parse(data)));
});
req.end();
```

6.6 events

Core of Node's event-driven architecture. The EventEmitter class is used to handle custom events.

```js
const EventEmitter = require('events');
class MyEmitter extends EventEmitter {}
const myEmitter = new MyEmitter();

myEmitter.on('event', (a, b) => {
  console.log('event:', a, b);
});
myEmitter.emit('event', 'hello', 'world'); // triggers

// Once listener
myEmitter.once('onceEvent', () => console.log('only once'));

// Error event: if error emitted without listener, process exits.
myEmitter.on('error', (err) => console.error(err));
myEmitter.emit('error', new Error('oh no!'));
```

6.7 stream

Streams are collections of data that might not be available all at once. Four fundamental types:

· Readable: source of data (e.g., fs.createReadStream).
· Writable: destination (e.g., fs.createWriteStream).
· Duplex: both readable and writable (e.g., TCP socket).
· Transform: modifies data while reading/writing (e.g., compression).

```js
const { Readable, Writable, Transform, pipeline } = require('stream');
const { createReadStream, createWriteStream } = require('fs');

// Readable
const readable = Readable.from(['hello', 'world']);
readable.on('data', chunk => console.log(chunk.toString()));

// Writable
const writable = new Writable({
  write(chunk, enc, cb) {
    console.log('wrote:', chunk.toString());
    cb();
  }
});
readable.pipe(writable);

// Transform (uppercase)
const transform = new Transform({
  transform(chunk, enc, cb) {
    cb(null, chunk.toString().toUpperCase());
  }
});
process.stdin.pipe(transform).pipe(process.stdout);

// Pipeline (handles backpressure and cleanup)
pipeline(
  createReadStream('input.txt'),
  transform,
  createWriteStream('output.txt'),
  (err) => { if (err) console.error(err); else console.log('Done'); }
);
```

Backpressure: When a readable stream pushes data faster than the writable can consume, the writable's internal buffer grows. Streams handle this by pausing the readable. Use pipe() or pipeline() to manage backpressure automatically.

Object Mode: Streams can emit JavaScript objects instead of buffers/strings by setting objectMode: true.

6.8 buffer

A Buffer is a chunk of memory allocated outside the V8 heap, used to handle raw binary data.

```js
const buf1 = Buffer.alloc(10);               // filled with zeros
const buf2 = Buffer.from('Hello', 'utf8');   // from string
const buf3 = Buffer.from([0x48, 0x65]);      // from array

console.log(buf2.toString());                 // 'Hello'
console.log(buf2.toJSON());                   // { type: 'Buffer', data: [ ... ] }

// Buffers compared to TypedArrays: Buffer is a subclass of Uint8Array.
buf1.write('Node', 0, 'utf8');
const sliced = buf2.slice(0, 2); // shares memory
const copy = Buffer.alloc(5);
buf2.copy(copy);
Buffer.concat([buf1, buf2]);
```

6.9 crypto

Cryptographic functionality: hashing, HMAC, encryption, decryption.

```js
const crypto = require('crypto');

// Hash
const hash = crypto.createHash('sha256');
hash.update('some data');
console.log(hash.digest('hex'));

// HMAC
const hmac = crypto.createHmac('sha256', 'secret-key');
hmac.update('message');
console.log(hmac.digest('hex'));

// Encrypt/Decrypt (AES-256-CBC)
const algorithm = 'aes-256-cbc';
const key = crypto.randomBytes(32);
const iv = crypto.randomBytes(16);
const cipher = crypto.createCipheriv(algorithm, key, iv);
let encrypted = cipher.update('secret message', 'utf8', 'hex');
encrypted += cipher.final('hex');
const decipher = crypto.createDecipheriv(algorithm, key, iv);
let decrypted = decipher.update(encrypted, 'hex', 'utf8');
decrypted += decipher.final('utf8');

// Random bytes, UUID
crypto.randomBytes(16, (err, buf) => console.log(buf.toString('hex')));
crypto.randomUUID();
```

6.10 child_process

Run system commands or other scripts in subprocesses.

```js
const { exec, execFile, spawn, fork } = require('child_process');

// exec: buffers output, good for short commands
exec('ls -la', (error, stdout, stderr) => {
  console.log(stdout);
});

// execFile: like exec but runs a specific file
execFile('node', ['--version'], (error, stdout) => console.log(stdout));

// spawn: streams output, better for long-running processes
const child = spawn('ping', ['-c', '3', 'google.com']);
child.stdout.on('data', data => console.log(`stdout: ${data}`));
child.stderr.on('data', data => console.error(`stderr: ${data}`));
child.on('close', code => console.log(`exit code: ${code}`));

// fork: special spawn for Node modules, communication channel included
const forked = fork('./worker.js');
forked.on('message', msg => console.log('from worker:', msg));
forked.send({ hello: 'world' });
```

6.11 cluster

Create child processes sharing the same server port, leveraging multi-core systems.

```js
const cluster = require('cluster');
const http = require('http');
const numCPUs = require('os').cpus().length;

if (cluster.isMaster) {
  console.log(`Master ${process.pid} is running`);
  for (let i = 0; i < numCPUs; i++) {
    cluster.fork();
  }
  cluster.on('exit', (worker) => {
    console.log(`worker ${worker.process.pid} died`);
    cluster.fork(); // restart
  });
} else {
  http.createServer((req, res) => {
    res.writeHead(200);
    res.end('Hello from worker ' + process.pid);
  }).listen(8000);
}
```

Use cluster module or PM2 for production.

6.12 worker_threads

Run CPU-intensive JavaScript in separate threads, enabling true parallel execution.

```js
// main.js
const { Worker } = require('worker_threads');
function runWorker(workerData) {
  return new Promise((resolve, reject) => {
    const worker = new Worker('./worker.js', { workerData });
    worker.on('message', resolve);
    worker.on('error', reject);
    worker.on('exit', code => {
      if (code !== 0) reject(new Error(`Worker stopped with exit code ${code}`));
    });
  });
}
runWorker(42).then(result => console.log(result)); // 84

// worker.js
const { parentPort, workerData } = require('worker_threads');
parentPort.postMessage(workerData * 2);
```

---

7. Asynchronous Programming in Depth

Callbacks (Error-First)

Traditional pattern: first argument is error, second is result.

```js
function readJSON(filename, callback) {
  fs.readFile(filename, 'utf8', (err, data) => {
    if (err) return callback(err);
    try {
      const parsed = JSON.parse(data);
      callback(null, parsed);
    } catch (e) {
      callback(e);
    }
  });
}
```

Promises

Modern approach; chainable, better error handling.

```js
function readJSON(filename) {
  return new Promise((resolve, reject) => {
    fs.readFile(filename, 'utf8', (err, data) => {
      if (err) return reject(err);
      try {
        resolve(JSON.parse(data));
      } catch (e) { reject(e); }
    });
  });
}
// Or with util.promisify
const util = require('util');
const readFile = util.promisify(fs.readFile);
```

Async/Await

Syntactic sugar for Promises.

```js
async function main() {
  try {
    const data = await readFile('config.json', 'utf8');
    const config = JSON.parse(data);
    console.log(config);
  } catch (err) {
    console.error(err);
  }
}
```

Caution: async functions that reject without try/catch will cause unhandled promise rejection (may crash process in future Node).

---

8. The Event Loop – Deep Dive

Node.js event loop is the heart of its non-blocking I/O. It runs in a single thread and goes through several phases:

1. Timers – execute setTimeout and setInterval callbacks whose time threshold has passed.
2. Pending callbacks – execute I/O callbacks deferred to the next loop iteration.
3. Idle, prepare – internal use.
4. Poll – retrieve new I/O events; execute I/O-related callbacks (excluding close callbacks, timers, and setImmediate). Node may block here when there are no timers.
5. Check – setImmediate callbacks.
6. Close callbacks – e.g., socket.on('close', ...).

Microtasks: process.nextTick and Promises are processed after each phase (between phases) and before the event loop continues. nextTick has higher priority than Promises.

Example:

```js
setTimeout(() => console.log('timeout'), 0);
setImmediate(() => console.log('immediate'));
process.nextTick(() => console.log('nextTick'));
Promise.resolve().then(() => console.log('promise'));
console.log('main');
// Output: main, nextTick, promise, timeout, immediate   (or sometimes immediate before timeout, see below)
```

Note: The order of setTimeout(fn,0) and setImmediate is non-deterministic when called from the top level, but when called inside an I/O cycle, setImmediate always fires first.

---

9. Streams & Backpressure – Advanced

· Flowing vs Paused mode (Readable): when .pipe() or data event is used, the stream is in flowing mode. Use readable.pause() and readable.resume() to control.
· Implementing a custom stream: extend stream classes.

```js
const { Readable } = require('stream');
class MyReadable extends Readable {
  constructor(options) { super(options); this.index = 0; }
  _read(size) {
    if (this.index > 5) this.push(null);
    else {
      const buf = Buffer.from(`chunk-${this.index++}`);
      this.push(buf);
    }
  }
}
```

· Pipeline API: stream.pipeline() handles cleanup and backpressure automatically (recommended over .pipe() for production).
· Stream error propagation: errors do not propagate through .pipe(); you must attach 'error' listeners manually. pipeline catches them.

---

10. Error Handling Patterns

· Operational errors (e.g., file not found) vs programmer errors (bugs). Handle operational errors gracefully; crash on programmer errors in production.
· In callbacks: always check err first.
· With async/await: wrap in try/catch or handle rejection with .catch().
· Unhandled Rejections:
  ```js
  process.on('unhandledRejection', (reason, promise) => {
    console.log('Unhandled Rejection at:', promise, 'reason:', reason);
    // application-specific logging, shutdown
  });
  ```
· Uncaught Exceptions: severe, should restart process.
  ```js
  process.on('uncaughtException', (err) => {
    console.error('Uncaught Exception:', err);
    process.exit(1); // best practice after cleanup
  });
  ```
· Use express-async-errors for Express (not part of core, but common).

---

11. Debugging & Profiling

· Node Inspector: node --inspect index.js and open chrome://inspect.
· CLI debugger: node inspect index.js.
· Logging: use util.debuglog, debug module, or structured logging with pino/winston.
· Profiling:
  · CPU: node --prof generates v8.log, analyze with node --prof-process.
  · Heap snapshots: node --inspect, use Memory tab.
  · Clinic.js and 0x for flamegraphs.

---

12. Environment Variables & Configuration

· Access via process.env.
· Load from .env with dotenv package:
  ```js
  require('dotenv').config();
  const PORT = process.env.PORT || 3000;
  ```
· Use NODE_ENV to differentiate environments (development, production, test).
· Best practice: validate environment variables with library like envalid.

---

13. Security Best Practices

· Avoid eval(), new Function(), and similar dynamic code execution.
· Prevent prototype pollution: avoid deep-merging user input; use safe libraries.
· Secure dependencies: npm audit, use Snyk.
· Use helmet for Express (not core, but relevant). For plain HTTP servers, set appropriate headers.
· Validate input: all user input must be validated/sanitized.
· Avoid blocking the event loop: keep CPU-intensive tasks out of main thread.
· Handle errors gracefully to avoid crashing entire process.
· Limit payload size, especially for JSON parsing.
· Use --experimental-policy for permissions? (experimental)

---

14. Testing Node.js Applications

Unit Testing with Jest / Mocha

```js
// sum.js
function sum(a, b) { return a + b; }
module.exports = sum;

// sum.test.js (Jest)
const sum = require('./sum');
test('adds 1 + 2 to equal 3', () => {
  expect(sum(1, 2)).toBe(3);
});
```

Mocking with Jest

```js
const fs = require('fs');
jest.mock('fs');
test('reads file', () => {
  fs.readFileSync.mockReturnValue('fake content');
  const content = fs.readFileSync('/fake/path', 'utf8');
  expect(content).toBe('fake content');
});
```

Testing Asynchronous Code

```js
test('async test', async () => {
  const data = await fetchData();
  expect(data).toHaveProperty('id');
});
```

Use supertest for HTTP-based testing, but it integrates with Express; for native http servers, you can test by making requests or extracting server logic.

---

15. TypeScript with Node.js

· Install typescript, ts-node, @types/node.
· tsconfig.json with "module": "commonjs" or "esnext", "target": "es2020".
· Use types for Node core: import * as fs from 'fs'; works.
· Example:

```ts
import { readFile } from 'fs/promises';
async function main(): Promise<void> {
  const data = await readFile('file.txt', 'utf8');
  console.log(data);
}
main();
```

---

16. Building CLI Tools

· Use commander or yargs for argument parsing.
· Include #!/usr/bin/env node at the top.
· Specify "bin" field in package.json.
· Example with yargs:

```js
#!/usr/bin/env node
const yargs = require('yargs/yargs');
const { hideBin } = require('yargs/helpers');
const argv = yargs(hideBin(process.argv)).argv;
if (argv.verbose) console.log('Verbose mode');
```

---

17. Native Addons (N-API)

Allow C/C++ code to be called from Node.js for performance or system access. Use node-addon-api (C++ wrapper) for simplicity. Brief example:

```cpp
#include <napi.h>
Napi::String Method(const Napi::CallbackInfo& info) {
  Napi::Env env = info.Env();
  return Napi::String::New(env, "world");
}
Napi::Object Init(Napi::Env env, Napi::Object exports) {
  exports.Set(Napi::String::New(env, "hello"), Napi::Function::New(env, Method));
  return exports;
}
NODE_API_MODULE(addon, Init)
```

---

18. WebSocket with Node (native ws library)

Not built-in, but ws is a standard WebSocket implementation.

```js
const WebSocket = require('ws');
const wss = new WebSocket.Server({ port: 8080 });
wss.on('connection', ws => {
  ws.on('message', message => console.log('received: %s', message));
  ws.send('Hello from server');
});
```

---

19. Microservices & Communication Patterns

Node.js is often used for microservices. Communication:

· HTTP/REST (using http module or Express).
· Message brokers (RabbitMQ, Kafka) – use libraries like amqplib or kafkajs.
· gRPC – @grpc/grpc-js and @grpc/proto-loader.
· Circuit breaker pattern using opossum library.
· Service discovery and API gateways are architectural concerns.

Example message broker pattern:

```js
// Producer
const amqp = require('amqplib');
async function send() {
  const conn = await amqp.connect('amqp://localhost');
  const channel = await conn.createChannel();
  const queue = 'tasks';
  await channel.assertQueue(queue, { durable: true });
  channel.sendToQueue(queue, Buffer.from('Hello'));
}
```

---

20. Deployment & Production

Process Manager (PM2)

· pm2 start app.js -i max for clustering.
· pm2 logs, pm2 monit.
· Ecosystem file ecosystem.config.js:

```js
module.exports = {
  apps: [{
    name: 'api',
    script: './dist/server.js',
    instances: 'max',
    exec_mode: 'cluster',
    env: { NODE_ENV: 'production' }
  }]
};
```

Docker

Multi-stage builds reduce image size.

```dockerfile
FROM node:18-alpine AS build
WORKDIR /app
COPY package*.json ./
RUN npm ci --production
COPY . .
RUN npm run build

FROM node:18-alpine
WORKDIR /app
COPY --from=build /app/dist ./dist
COPY package*.json ./
RUN npm ci --production
EXPOSE 3000
CMD ["node", "dist/main.js"]
```

Graceful Shutdown

```js
const server = app.listen(3000);
process.on('SIGTERM', () => {
  console.log('SIGTERM signal received.');
  server.close(() => {
    console.log('HTTP server closed.');
    // close database connections, etc.
    process.exit(0);
  });
  // Force shutdown after 10s
  setTimeout(() => { console.error('Forcing shutdown'); process.exit(1); }, 10000);
});
```

Nginx as Reverse Proxy

Typical configuration:

```
server {
    listen 80;
    server_name example.com;
    location / {
        proxy_pass http://localhost:3000;
        proxy_http_version 1.1;
        proxy_set_header Upgrade $http_upgrade;
        proxy_set_header Connection 'upgrade';
        proxy_set_header Host $host;
        proxy_cache_bypass $http_upgrade;
    }
}
```

Environment-Specific Configuration

Use separate .env files or config module that loads based on NODE_ENV.

---

21. Memory Leaks & Performance Tuning

· Common causes: global variables, unclosed streams, forgotten timers/event listeners, closures retaining large objects.
· Use process.memoryUsage() to monitor.
· Heap snapshots with Chrome DevTools or v8.getHeapSnapshot().
· Tools: clinic doctor, 0x, node --prof.
· Avoid synchronous file operations in production; they block event loop.

---

22. More Advanced Built-in Modules

· dns: domain name resolution.
· net: raw TCP servers/clients.
· tls: TLS/SSL implementation.
· readline: reading from readable streams line by line.
· util: utility functions (promisify, inherits, types, TextEncoder/Decoder backport).
· zlib: compression/decompression (gzip, deflate).
· v8: access V8-specific APIs.
· vm: run code in sandboxed context.
· tty, repl, console, etc.

---

This guide covers Node.js comprehensively from beginner to advanced topics. All code examples are ready for use and interview discussion. For Express.js-specific topics, refer to a separate guide.
