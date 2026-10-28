# System Design – Ultimate In‑Depth Guide (Beginner to Advanced)

This guide provides an **exhaustive** exploration of **System Design** – the art of designing scalable, reliable, and maintainable distributed systems. It covers everything from fundamental concepts and architectural patterns to real‑world system design case studies and interview preparation. Each topic is broken down into its smallest components with clear explanations, trade‑offs, and practical insights. This guide is designed to take you from a beginner to a confident system designer ready for any interview.

---

## Table of Contents

1. [Introduction to System Design](#1-introduction-to-system-design)
2. [Fundamental Concepts and Building Blocks](#2-fundamental-concepts-and-building-blocks)
   - 2.1 Client‑Server Model
   - 2.2 Network Protocols (HTTP, TCP/IP, WebSockets)
   - 2.3 Latency and Throughput
   - 2.4 Vertical Scaling vs Horizontal Scaling
   - 2.5 Load Balancing
   - 2.6 Caching (Client, CDN, Application, Database)
   - 2.7 Content Delivery Networks (CDNs)
   - 2.8 Database Fundamentals (SQL vs NoSQL, Indexing)
   - 2.9 Replication and Partitioning (Sharding)
   - 2.10 CAP Theorem
   - 2.11 ACID vs BASE
   - 2.12 Consistency Patterns (Strong, Eventual, etc.)
   - 2.13 Message Queues and Pub/Sub
   - 2.14 API Design (REST, gRPC, GraphQL)
3. [Architectural Patterns and Styles](#3-architectural-patterns-and-styles)
   - 3.1 Monolithic Architecture
   - 3.2 Service‑Oriented Architecture (SOA)
   - 3.3 Microservices Architecture
   - 3.4 Event‑Driven Architecture
   - 3.5 CQRS and Event Sourcing
   - 3.6 Serverless Architecture
   - 3.7 Peer‑to‑Peer Architecture
4. [Key Design Patterns and Distributed System Techniques](#4-key-design-patterns-and-distributed-system-techniques)
   - 4.1 Proxy and Reverse Proxy
   - 4.2 Circuit Breaker
   - 4.3 Bulkhead
   - 4.4 Retry and Exponential Backoff
   - 4.5 Leader Election
   - 4.6 Heartbeat
   - 4.7 Gossip Protocol
   - 4.8 Quorum and Consensus (Paxos, Raft)
   - 4.9 Idempotency
   - 4.10 Rate Limiting
   - 4.11 Consistent Hashing
   - 4.12 Bloom Filters and HyperLogLog
   - 4.13 Merkle Trees
5. [Core Design Trade‑offs and Considerations](#5-core-design-trade‑offs-and-considerations)
   - 5.1 Performance vs Scalability
   - 5.2 Latency vs Throughput
   - 5.3 Availability vs Consistency
   - 5.4 Read‑ vs Write‑Heavy Workloads
   - 5.5 Storage Trade‑offs (B‑tree vs LSM, OLTP vs OLAP)
6. [Data Storage and Database Selection](#6-data-storage-and-database-selection)
   - 6.1 Relational Databases (MySQL, PostgreSQL)
   - 6.2 NoSQL Databases (MongoDB, Cassandra, DynamoDB)
   - 6.3 Key‑Value Stores (Redis, etc.)
   - 6.4 Columnar Databases (Bigtable, HBase)
   - 6.5 Search Engines (Elasticsearch)
   - 6.6 Time‑Series Databases (InfluxDB, TimescaleDB)
   - 6.7 Graph Databases (Neo4j)
7. [Caching Strategies in Depth](#7-caching-strategies-in-depth)
   - 7.1 Cache‑Aside (Lazy Loading)
   - 7.2 Read‑Through / Write‑Through / Write‑Behind
   - 7.3 Refresh‑Ahead
   - 7.4 Eviction Policies (LRU, LFU, TTL)
   - 7.5 Cache Invalidation
8. [Designing Core Services](#8-designing-core-services)
   - 8.1 Authentication and Authorization Systems
   - 8.2 URL Shortener (TinyURL)
   - 8.3 Pastebin
   - 8.4 Rate Limiter
   - 8.5 Notification System
   - 8.6 Chat System (1‑to‑1, Group Chat)
   - 8.7 Search Autocomplete System
9. [Designing Large‑Scale Systems – Case Studies](#9-designing-large‑scale-systems--case-studies)
   - 9.1 Design Twitter
   - 9.2 Design Instagram
   - 9.3 Design YouTube / Netflix (Video Streaming)
   - 9.4 Design Uber / Lyft (Ride‑Hailing)
   - 9.5 Design a Web Crawler
   - 9.6 Design a Distributed Key‑Value Store (like Dynamo)
   - 9.7 Design a Distributed File System (like GFS/HDFS)
10. [Observability, Monitoring, and Deployment](#10-observability-monitoring-and-deployment)
    - 10.1 Logging, Metrics, Tracing
    - 10.2 Health Checks and Liveness/Readiness Probes
    - 10.3 Deployment Strategies (Blue‑Green, Canary, Rolling)
    - 10.4 CI/CD Pipelines
11. [Security and Reliability](#11-security-and-reliability)
    - 11.1 Encryption (in transit, at rest)
    - 11.2 Authentication vs Authorization
    - 11.3 DDoS Mitigation
    - 11.4 Data Backup and Disaster Recovery
12. [System Design Interview Approach](#12-system-design-interview-approach)
    - 12.1 The Step‑by‑Step Framework
    - 12.2 Example: Design a URL Shortener Walkthrough
13. [Glossary and Quick Reference](#13-glossary-and-quick-reference)
14. [Common Interview Questions](#14-common-interview-questions)

---

## 1. Introduction to System Design

**System design** is the process of defining the architecture, components, modules, interfaces, and data for a system to satisfy specified requirements. In the context of software engineering, it often refers to designing **distributed systems** that can serve millions of users reliably and efficiently.

A successful system design balances:
- **Functional requirements** – what the system must do (e.g., user can post a tweet, upload a video).
- **Non‑functional requirements** – quality attributes (scalability, availability, latency, consistency, durability, security).

**Why learn system design?**
- Essential for building large‑scale, production‑ready applications.
- A core part of senior engineering interviews (like FAANG).
- Helps you make informed architectural decisions.

---

## 2. Fundamental Concepts and Building Blocks

### 2.1 Client‑Server Model

The most basic architecture. The client sends a request to the server; the server processes it and returns a response. Everything scales from this.

**Components:**
- **Client**: web browser, mobile app, IoT device.
- **Server**: a machine or cluster that listens for requests.
- **Protocol**: typically HTTP/HTTPS.

### 2.2 Network Protocols

- **HTTP/HTTPS**: request‑response, stateless. Methods: GET, POST, PUT, DELETE.
- **HTTP/2** and **HTTP/3** (QUIC) improve performance.
- **WebSockets**: full‑duplex, persistent connection for real‑time apps.
- **TCP/IP**: reliable, connection‑oriented transport layer.
- **UDP**: connectionless, faster but unreliable (used for video streaming, DNS).

**Connection types:**  
- **Short‑lived** (HTTP/1.0) – new TCP connection per request (slow).  
- **Persistent** (HTTP/1.1 keep‑alive) – reuse connection for multiple requests.  
- **Connection pool** on the server to manage DB connections.

### 2.3 Latency and Throughput

- **Latency**: time for a request to travel from client to server and back (round‑trip time, RTT). Measured in milliseconds.
- **Throughput**: number of requests a system can handle per second (RPS, QPS).  
**Bandwidth** is the maximum data transfer rate (bits per second).

**Improving latency:** use CDNs, caching, reduce network hops, HTTP/2.  
**Improving throughput:** horizontal scaling, load balancing, async processing.

### 2.4 Vertical Scaling vs Horizontal Scaling

- **Vertical scaling (scale up)**: add more resources (CPU, RAM, disk) to a single server. Simple but has limits (machine capacity, cost, single point of failure).
- **Horizontal scaling (scale out)**: add more servers (nodes). Requires load balancing and stateless design to be effective. Better scalability and fault tolerance.

**Stateless vs Stateful services:**
- **Stateless** services do not store session data on the server; any instance can handle any request. Easier to scale horizontally.
- **Stateful** services maintain session state, requiring sticky sessions or a distributed cache.

### 2.5 Load Balancing

A load balancer distributes incoming traffic across multiple backend servers to improve availability and throughput. It can be **hardware** (F5) or **software** (Nginx, HAProxy, Envoy).

**Algorithms:**
- Round‑robin, least connections, least response time, IP hash (sticky sessions).
- **Health checks** remove unhealthy servers.

**Layer 4 (transport)** vs **Layer 7 (application)** load balancing. Layer 7 can inspect HTTP headers, make routing decisions (e.g., path‑based).

**Example with Nginx:**
```
upstream backend {
    server 10.0.0.1:8080;
    server 10.0.0.2:8080;
}
server {
    location / {
        proxy_pass http://backend;
    }
}
```

### 2.6 Caching

Caching stores frequently accessed data in a faster storage layer (e.g., memory) to reduce latency and load on the backend.

**Cache layers:**
1. **Client‑side**: Browser cache (HTTP headers `Cache‑Control`, `ETag`).
2. **CDN**: edge servers cache static assets.
3. **Application cache**: in‑memory stores (Redis, Memcached) for database query results, API responses.
4. **Database cache**: query cache, buffer pool.

**Cache‑aside pattern** (most common):  
- Application first checks cache; if **miss**, fetches from DB, stores in cache, returns.
- Pseudocode:
```
data = cache.get(key)
if data == nil {
    data = db.query(key)
    cache.set(key, data, ttl)
}
return data
```

**Cache invalidation** is hard. Strategies:
- **TTL (Time‑To‑Live)**: automatic expiration.
- **Write‑through**: update cache immediately when data changes.
- **Write‑behind**: write to cache, async write to DB (risk of data loss).

### 2.7 Content Delivery Networks (CDNs)

A CDN is a geographically distributed network of proxy servers that cache static content (images, CSS, JS, videos) closer to users. This reduces latency and bandwidth costs.

**How it works:**
- DNS routes the user to the nearest CDN edge server.
- If content is cached, serve it; otherwise, pull from origin server and cache.

**Popular CDNs:** Cloudflare, Akamai, Amazon CloudFront.

### 2.8 Database Fundamentals

**Relational (SQL) databases** (MySQL, PostgreSQL):  
- Store data in tables with rows and columns.  
- Enforce schema, ACID transactions, relationships.  
- Good for complex queries, joins, data integrity.

**NoSQL databases:**  
- **Key‑value** (Redis, DynamoDB): simple get/put.  
- **Document** (MongoDB): JSON‑like documents, flexible schema.  
- **Column‑family** (Cassandra): wide columns, high write throughput.  
- **Graph** (Neo4j): nodes and edges.

**Indexing:**  
- Indexes speed up read queries (like a book index). B‑tree is the most common.  
- Trade‑off: slower writes and extra storage.  
- Composite indexes for multiple columns.  
- Covering index: all required columns are in the index, avoids table lookup.

### 2.9 Replication and Partitioning (Sharding)

**Replication:**
- **Master‑Slave**: writes go to master, reads can go to slaves. Async or sync replication. Improves read scalability and availability.
- **Master‑Master**: both nodes accept writes (conflict resolution needed).

**Partitioning (Sharding):**
- Splitting a large database into smaller, independent pieces (shards) based on a **shard key** (e.g., user_id).
- **Horizontal partitioning** – rows distributed across shards.
- **Range‑based**, **hash‑based**, or **directory‑based** sharding.
- Benefits: scale writes, improve performance.  
- Drawbacks: complex queries spanning shards, rebalancing when adding shards, loss of ACID across shards.

**Consistent hashing** is used to minimize data movement when adding/removing shards (see 4.11).

### 2.10 CAP Theorem

The CAP theorem states that a distributed data store can provide at most two of the following three guarantees simultaneously:

- **Consistency**: every read receives the most recent write.
- **Availability**: every request receives a (non‑error) response, without guarantee that it contains the most recent write.
- **Partition Tolerance**: the system continues to operate despite network partitions.

In practice, partition tolerance is mandatory in distributed systems. So you must choose between **CP** (consistent but not always available, e.g., HBase) and **AP** (available but eventually consistent, e.g., Cassandra). Many modern databases offer tunable consistency.

### 2.11 ACID vs BASE

- **ACID** (Atomicity, Consistency, Isolation, Durability): properties of traditional SQL transactions. Provides strong guarantees.
- **BASE** (Basically Available, Soft state, Eventual consistency): a more relaxed model used by many NoSQL systems. Sacrifices consistency for availability and partition tolerance.

### 2.12 Consistency Patterns

- **Strong consistency**: after a write completes, any subsequent read will see that value (linearizability).
- **Eventual consistency**: if no new updates are made, eventually all reads will return the last updated value. (DNS, Amazon Dynamo).
- **Causal consistency**: causally related operations are seen by every node in the same order.
- **Read‑your‑writes consistency**: a user always sees their own updates immediately.

**Consensus algorithms** (Paxos, Raft) are used to achieve strong consistency in a distributed environment.

### 2.13 Message Queues and Pub/Sub

Decouple components by allowing asynchronous communication.

**Message Queue (point‑to‑point):**
- Producer sends message to a queue; consumer pulls and processes it.
- Buffering, fault tolerance. Examples: RabbitMQ, AWS SQS.

**Publish‑Subscribe (Pub/Sub):**
- Publishers push messages to topics; multiple subscribers receive them.
- Examples: Apache Kafka (persistent log), Google Pub/Sub.

**Use cases:**  
- Decoupling microservices (order service → inventory service).  
- Handling traffic spikes (queue acts as buffer).  
- Event‑driven architectures.

### 2.14 API Design

**REST (Representational State Transfer):**
- Stateless, resource‑based (nouns), standard HTTP methods (GET, POST, PUT, DELETE).
- JSON most common.
- Versioning: URL path (`/v1/users`) or header.

**gRPC:**
- High‑performance, binary protocol using HTTP/2 and Protocol Buffers.
- Strongly typed contracts, supports streaming (bidirectional).
- Good for internal microservices communication.

**GraphQL:**
- Client specifies exactly the data it needs, avoiding over‑fetching/under‑fetching.
- Single endpoint, query language.
- More complex to cache and secure.

---

## 3. Architectural Patterns and Styles

### 3.1 Monolithic Architecture
The entire application is built as a single unit. Simple to develop and test, but difficult to scale and maintain as it grows.

### 3.2 Service‑Oriented Architecture (SOA)
A coarse‑grained approach where services communicate over an ESB (Enterprise Service Bus). More loosely coupled than monoliths but can become a bottleneck.

### 3.3 Microservices Architecture
The application is decomposed into small, independent services, each with its own database and bounded context. They communicate via lightweight protocols (REST, gRPC, messaging).

**Advantages:** independent deployment, scalability, technology diversity, fault isolation.  
**Challenges:** distributed complexity, data consistency, service discovery, monitoring.

*(Detailed in separate Microservices guide, but here we touch on key design aspects.)*

### 3.4 Event‑Driven Architecture
Components communicate by publishing and consuming events. Decouples producers and consumers temporally. Can use a message broker or event streaming platform (Kafka).  
Patterns: event notification, event‑carried state transfer, event sourcing.

### 3.5 CQRS and Event Sourcing
- **CQRS (Command Query Responsibility Segregation)**: separate read and write models. Write side handles commands and persists events; read side is optimized for queries and updated asynchronously.
- **Event Sourcing**: state is stored as a sequence of immutable events. The current state is derived by replaying events. Together they enable audit trails, temporal queries, and easy rebuilding of read models.

### 3.6 Serverless Architecture
Run code without managing servers (AWS Lambda, Azure Functions, Google Cloud Functions). Scales automatically, pay‑per‑execution. Good for event‑driven, short‑lived tasks. Cold starts can be an issue.

### 3.7 Peer‑to‑Peer Architecture
Decentralized, where nodes act as both clients and servers (BitTorrent, blockchain). No central server, resilient to censorship, but consistency and discovery are more complex.

---

## 4. Key Design Patterns and Distributed System Techniques

### 4.1 Proxy and Reverse Proxy
- **Proxy** (forward proxy): client‑side, hides client identity, can filter traffic.
- **Reverse proxy** (server‑side): sits in front of servers, handles SSL termination, load balancing, caching.

### 4.2 Circuit Breaker
Prevents cascading failures. When a downstream service fails, the circuit breaker opens and stops forwarding requests, instead returning an error or fallback. After a timeout, it allows a limited number of test requests. States: CLOSED, OPEN, HALF‑OPEN. Libraries: Hystrix, Resilience4j, Polly.

### 4.3 Bulkhead
Isolate resources (thread pools, connections) per service so that a failure in one does not exhaust resources for others.

### 4.4 Retry and Exponential Backoff
If a request fails, retry with increasing delays. Use **idempotency** to avoid duplicate processing.

### 4.5 Leader Election
In a distributed cluster, one node is elected as the leader to coordinate tasks (e.g., scheduler, primary database). Uses consensus algorithms (Raft, Paxos) or ZooKeeper/etcd.

### 4.6 Heartbeat
Periodic signals between nodes to detect failures. If a heartbeat is missed, the node is considered dead.

### 4.7 Gossip Protocol
Nodes periodically exchange state information with random peers. Used in distributed databases (Cassandra) for membership and failure detection. Eventually all nodes know the cluster state.

### 4.8 Quorum and Consensus (Paxos, Raft)
To ensure consistency in a replicated system, a write must be acknowledged by a **quorum** (W > N/2) of replicas. Read also needs a quorum (R) such that W + R > N guarantees strong consistency. Paxos and Raft are algorithms to achieve consensus on a sequence of values.

### 4.9 Idempotency
An operation can be applied multiple times without changing the result beyond the initial application. Essential for retries and at‑least‑once delivery. Use unique request IDs.

### 4.10 Rate Limiting
Controls the rate of requests a client can make. Algorithms: token bucket, leaky bucket, fixed window, sliding window. Protects against abuse and ensures fair usage. Implemented using Redis + Lua scripts or API Gateway.

### 4.11 Consistent Hashing
A hashing technique that minimizes reassignment of keys when the number of servers (nodes) changes. The output range of a hash function is treated as a ring. Each node is assigned a position on the ring; a key is assigned to the first node clockwise. Adding/removing a node only affects its immediate neighbors. Used in distributed caches (Memcached) and databases (Cassandra).

### 4.12 Bloom Filters and HyperLogLog
- **Bloom filter**: a probabilistic data structure to test membership. Space‑efficient, can have false positives but no false negatives. Used to avoid expensive lookups (e.g., "is this URL already crawled?").
- **HyperLogLog**: approximate count of unique elements, constant memory (~12KB). Used for cardinality estimation (unique visitors).

### 4.13 Merkle Trees
A tree where each leaf is a hash of a data block, and each non‑leaf is a hash of its children. Enables efficient comparison of large data sets (e.g., in Cassandra for anti‑entropy repair, Git, blockchain).

---

## 5. Core Design Trade‑offs and Considerations

### 5.1 Performance vs Scalability
- Performance: how fast a system responds for a single user.
- Scalability: ability to handle increased load by adding resources. A system can be fast but not scalable.

### 5.2 Latency vs Throughput
Often you need to optimize for either low latency (real‑time trading) or high throughput (batch processing). Asynchronous processing can increase throughput at the cost of latency.

### 5.3 Availability vs Consistency (CAP)
As mentioned, you must often choose between CP and AP depending on the use case. Banking prefers consistency; social media feeds can tolerate eventual consistency.

### 5.4 Read‑ vs Write‑Heavy Workloads
- Write‑heavy: use LSM‑tree storage (Cassandra, RocksDB), log‑structured file systems.
- Read‑heavy: add read replicas, caching layers, use CDN.

### 5.5 Storage Trade‑offs (B‑tree vs LSM, OLTP vs OLAP)
- **B‑tree**: good for read‑heavy, range scans. (MySQL InnoDB)
- **LSM‑tree**: good for write‑heavy, append‑only. (Cassandra, LevelDB)
- **OLTP**: transactional, many small reads/writes, normalized data.
- **OLAP**: analytical, aggregations over large datasets, denormalized star schema (data warehouse).

---

## 6. Data Storage and Database Selection

A detailed breakdown of database types, their internal workings, and when to use them.

### 6.1 Relational Databases
- **MySQL** (InnoDB): ACID, row‑level locking, B‑tree indexes, good for most transactional workloads.
- **PostgreSQL**: advanced features (JSONB, full‑text search, window functions), extensible.
- **Use cases**: e‑commerce, banking, any application needing complex joins and integrity.

### 6.2 NoSQL Databases
- **MongoDB**: document store, BSON format, rich queries, secondary indexes, good for prototyping, flexible schema.
- **Cassandra**: wide‑column store, linear write scalability, eventually consistent, good for time‑series, IoT, chat.
- **DynamoDB**: fully managed, key‑value/document, consistent performance, automatic sharding.

### 6.3 Key‑Value Stores
- **Redis**: in‑memory, supports data structures (lists, sets, sorted sets, streams). Used for caching, session store, rate limiting, leaderboards.
- **etcd** / **Consul**: consistent key‑value store for configuration and service discovery.

### 6.4 Columnar Databases
Store data by columns, highly compressed, optimized for analytics. Examples: **Amazon Redshift**, **Google BigQuery**, **Apache Parquet**.

### 6.5 Search Engines
- **Elasticsearch**: distributed, RESTful, built on Apache Lucene. Full‑text search, log analytics. Inverted indexes.

### 6.6 Time‑Series Databases
Optimized for timestamped data: **InfluxDB**, **TimescaleDB** (PostgreSQL extension). High write throughput, built‑in downsampling and retention policies.

### 6.7 Graph Databases
- **Neo4j**: native graph storage and processing. Cypher query language. Used for social graphs, recommendation engines, fraud detection.

**Selection flow:**  
1. Are you doing complex relationships? → Graph DB.  
2. Is schema fixed, need ACID? → SQL.  
3. High write volume, simple queries? → Cassandra / DynamoDB.  
4. Caching / real‑time counters → Redis.  
5. Full‑text search → Elasticsearch.

---

## 7. Caching Strategies in Depth

### 7.1 Cache‑Aside
Application manages cache; data is loaded on demand. Most common.

### 7.2 Read‑Through / Write‑Through / Write‑Behind
- **Read‑through**: cache sits between app and DB; on cache miss, it loads from DB automatically.
- **Write‑through**: write goes to cache first, then synchronously to DB. Slower but consistent.
- **Write‑behind**: write to cache, async write to DB. Faster but risk of data loss.

### 7.3 Refresh‑Ahead
Proactively refresh the cache entry before it expires to avoid cache miss storms.

### 7.4 Eviction Policies
- **LRU** (Least Recently Used): evict items not recently accessed.
- **LFU** (Least Frequently Used): evict items with lowest access count.
- **TTL** (Time‑To‑Live): expire after a fixed time.
- **FIFO**, **Random**.

### 7.5 Cache Invalidation
The hardest problem. Strategies: **purge on update**, **write‑through**, **tag‑based invalidation**, **versioned keys**.

---

## 8. Designing Core Services

Detailed design walkthroughs for common service types.

### 8.1 Authentication and Authorization Systems
- **Authentication**: verify identity (OAuth2, JWT, SAML).
- **Authorization**: determine permissions (RBAC, ABAC).
- **JWT (JSON Web Token)**: stateless, contains claims, signed. Use access/refresh tokens.
- **OAuth2**: authorization protocol with multiple grant types. Usually delegated to identity providers (Google, Auth0).
- **Design**: Use a dedicated auth service. Clients obtain a JWT, pass it in `Authorization: Bearer` header. API gateway or each service validates the token.

### 8.2 URL Shortener (TinyURL)
**Functional requirements:** given a long URL, generate a short, unique alias; when accessing the short URL, redirect to the original.  
**Non‑functional:** high availability, low latency, scalable.

**Core design:**
- Use a key generation service to create unique short IDs (base62 encoded: [a‑zA‑Z0‑9]).
- Store mapping: `<short_url, long_url>` in a database.
- Redirect: HTTP 301 (permanent) or 302 (temporary).
- For scaling: use distributed ID generator (Snowflake, or pre‑generated tokens). Consistent hashing for database sharding.
- Cache frequently accessed mappings in Redis.

### 8.3 Pastebin
Similar to URL shortener but stores text content. Use an object store (S3) for large pastes, metadata in DB. Key generation same. Add rate limiting.

### 8.4 Rate Limiter
Implement a token bucket per user. Use Redis: `INCR` + `EXPIRE` for fixed window. Sliding window log is more precise but memory intensive. Distributed rate limiter: each node tracks locally and syncs periodically, or use centralized Redis.

### 8.5 Notification System
- Push notifications (mobile), email, SMS, in‑app.
- Use a message queue to decouple trigger from sending.
- Services: notification service (templates, preferences), vendor gateways (Firebase, Twilio), queue (Kafka).
- Store notification preferences and delivery status in database.

### 8.6 Chat System
- **1‑to‑1**: both users connect to chat server via WebSocket. Server routes messages.
- **Group chat**: use a pub‑sub topic per group.
- Scalability: multiple chat servers behind a load balancer; use Redis pub‑sub or Kafka to broadcast messages across servers. Store history in a message database (Cassandra, or time‑partitioned SQL).
- Online status: heartbeat.

### 8.7 Search Autocomplete System
- **Trie** data structure for prefix search.
- For distributed: partition trie by character range, or use Redis sorted sets with ZRANGEBYLEX.
- Precompute top K suggestions per prefix based on frequency.
- Ingest user queries into a data pipeline (Kafka, Spark) to update frequencies.

---

## 9. Designing Large‑Scale Systems – Case Studies

For each system, we follow a structured approach: requirements, capacity estimation, high‑level design, deep dive into key components, and trade‑offs.

### 9.1 Design Twitter
**Requirements:** post tweet (with media), timeline (home timeline), follow/unfollow, search.
**Capacity:** 300M MAU, 600 tweets/sec average, spikes of 10x.

**High‑level design:**
- **Write path**: Tweet service receives tweet, stores in DB, updates user’s timeline cache. For celebrities (many followers), fanout is expensive – use **hybrid**: for normal users, fanout on write to timeline cache (Redis list). For celebrities, pull on read (merge cached timeline with celebrity tweets).
- **Timeline service**: constructs home timeline from cache + celeb pull.
- **Database**: tweets stored in a NoSQL store (Cassandra) keyed by tweet_id. User graph in graph DB or denormalized follow list.
- **Media**: separate media service, store in S3.
- **Search**: Elasticsearch for full‑text search on tweets.

### 9.2 Design Instagram
Similar to Twitter but more photo/video focused. Write‑heavy: upload photo, metadata in DB. Read: feed generation, similar timeline architecture. Use CDN for images. Like/comments – use Redis counters.

### 9.3 Design YouTube / Netflix
- **Video storage**: large files stored in object storage (S3), encoded into multiple formats and resolutions using a transcoding pipeline (job queue + workers).
- **Streaming**: use Adaptive Bitrate Streaming (HLS, DASH). CDN caches video chunks.
- **Database**: video metadata in SQL, views/likes in Redis, user data in SQL.
- **Recommendation engine**: offline machine learning pipeline.

### 9.4 Design Uber / Lyft
- **Core**: ride matching, real‑time location updates.
- **Location service**: drivers send GPS coordinates every few seconds via WebSocket to a location server. Data stored in a geospatial index (Redis Geo, or QuadTree / Google S2).
- **Matching**: when a rider requests a ride, find nearby drivers (geospatial query), estimate ETA, dispatch.
- **Trip state machine**: managed via database with transactional guarantees.
- **Pricing**: dynamic pricing engine (surge).

### 9.5 Design a Web Crawler
- **Components**: URL frontier (priority queue), HTML fetcher (respect `robots.txt`), parser (extract links), duplicate detector (Bloom filter), content storage.
- **Distributed**: multiple fetcher instances, use a consistent hash ring to assign domains to workers to avoid overloading a single server. Politeness delay per domain.

### 9.6 Design a Distributed Key‑Value Store (Dynamo‑style)
- **Partitioning**: consistent hashing.
- **Replication**: replication factor N. Write to coordinator, which sends to N nodes. Wait for W acknowledgments (quorum).
- **Conflict resolution**: vector clocks, last‑write‑wins.
- **Membership and failure detection**: gossip protocol.
- **Hinted handoff**: if a node is down, a replica temporarily holds its data.

### 9.7 Design a Distributed File System (GFS/HDFS)
- **Master‑Slave architecture**: NameNode (metadata) + DataNodes (data blocks).
- File is split into chunks (64MB), each chunk replicated 3 times.
- Master maintains namespace, block locations. Heartbeats from DataNodes.
- Write pipeline: client → primary DataNode → secondary DataNodes → pipelined replication.

---

## 10. Observability, Monitoring, and Deployment

### 10.1 Logging, Metrics, Tracing
- **Logging**: centralized log aggregation (ELK, Loki).
- **Metrics**: CPU, memory, QPS, error rate, latency. Use Prometheus + Grafana.
- **Distributed tracing**: trace a request across microservices (Jaeger, Zipkin) using correlation IDs.

### 10.2 Health Checks and Probes
- **Liveness**: is the application running? Restart if fails.
- **Readiness**: is the application ready to serve traffic? Remove from load balancer if not.

### 10.3 Deployment Strategies
- **Rolling**: update instances one by one.
- **Blue‑Green**: two identical environments, switch traffic after testing new version.
- **Canary**: deploy to a small subset, monitor, gradually increase.

### 10.4 CI/CD Pipelines
Automated build, test, and deployment pipeline. Triggers: push to branch, pull request. Stages: compile, test, build image, push to registry, deploy.

---

## 11. Security and Reliability

### 11.1 Encryption
- **In transit**: TLS/SSL.
- **At rest**: database encryption, disk encryption.
- **End‑to‑end**: only communicating users can read (Signal, WhatsApp).

### 11.2 Authentication vs Authorization
- **Authentication** (AuthN): who you are.
- **Authorization** (AuthZ): what you are allowed to do.

### 11.3 DDoS Mitigation
Rate limiting, IP blacklisting, CDN/WAF (Web Application Firewall), anycast.

### 11.4 Data Backup and Disaster Recovery
- Regular backups (full + incremental), stored in different region.
- Recovery Time Objective (RTO) and Recovery Point Objective (RPO) define acceptable downtime and data loss.

---

## 12. System Design Interview Approach

### 12.1 The Step‑by‑Step Framework

1. **Clarify requirements (5 min)**: ask functional and non‑functional questions. Define use cases, scale (DAU, QPS, data size), expected latency.
2. **Back‑of‑the‑envelope estimation (5 min)**: estimate storage, bandwidth, QPS. Helps scope the design.
3. **High‑level design (10‑15 min)**: draw the main components: clients, load balancer, app servers, database, cache, CDN. Describe data flow.
4. **Deep dive (10‑15 min)**: pick 2‑3 critical components and elaborate. Discuss data model, scalability, trade‑offs. (e.g., for URL shortener: key generation, DB schema, read/write flow).
5. **Wrap up (5 min)**: identify bottlenecks and improvements, discuss monitoring, fault tolerance.

### 12.2 Example: Design a URL Shortener Walkthrough

Following the framework:

**Clarify:**
- Long URLs → short aliases, redirect with 301.
- 100 million new URLs per day → about 1,200 writes/sec.
- Read‑heavy: 10x reads = 12,000 reads/sec.
- URL length up to 7 characters.

**Estimation:**
- Write QPS: 1.2K, read QPS: 12K.
- Storage: 5 years * 100M * 365 * 200B (short+long) ≈ 36.5 TB.
- Need high availability, low latency.

**High‑level:**
- REST API: `POST /shorten` returns short URL, `GET /{short}` redirects.
- Database: key‑value store (DynamoDB, Cassandra) with short_url as primary key.
- Cache: Redis for hot URLs.
- Key generation: pre‑generated keys using base62, stored in a key‑DB, assign to new URLs. Or use Snowflake ID and encode.

**Deep dive:**
- Key generation: use a distributed ID generator (Twitter Snowflake) → unique 64‑bit ID → encode to base62. Or use a token service with two tables.
- Database: shard by short_url hash. Use consistent hashing for scaling.
- Cache: LRU eviction. High hit ratio needed.

---

## 13. Glossary and Quick Reference

*(A compact list of terms with one‑line definitions for quick revision.)*

- **Load Balancer**: distributes traffic across multiple servers.
- **CDN**: edge servers that cache content closer to users.
- **Sharding**: horizontal partitioning of data.
- **Replication**: copying data across nodes for redundancy.
- **Cache**: high‑speed storage for frequently accessed data.
- **Idempotency**: an operation that produces the same result no matter how many times it is executed.
- **Gossip Protocol**: decentralized peer‑to‑peer communication for cluster state.
- **Consistent Hashing**: hashing technique to minimize redistribution when nodes change.
- **Circuit Breaker**: pattern to prevent cascading failures.
- **CAP Theorem**: consistency, availability, partition tolerance – pick two.
- **PACELC**: extension of CAP for distributed systems.
- **Message Queue**: buffer for asynchronous communication.
- **Pub/Sub**: publish‑subscribe messaging pattern.
- **Event Sourcing**: storing state changes as a sequence of events.
- **CQRS**: separate read and write models.

---

## 14. Common Interview Questions

1. Design a URL shortener like TinyURL.
2. Design a rate limiter.
3. Design a chat system (WhatsApp).
4. Design a social media feed (Twitter/Instagram).
5. Design a video streaming platform (YouTube/Netflix).
6. Design a ride‑hailing service (Uber).
7. Design a web crawler.
8. Design a distributed key‑value store.
9. Design a search autocomplete system.
10. How do you scale a database?
11. Explain CAP theorem and give examples.
12. What is eventual consistency? How is it achieved?
13. How do you handle failure in a distributed system?
14. Compare SQL and NoSQL databases.
15. Explain caching strategies and their trade‑offs.
16. What is a CDN and how does it work?
17. How would you design a notification system?
18. Explain the difference between horizontal and vertical scaling.
19. What is a load balancer and what algorithms can it use?
20. Design a distributed file system like GFS.

---

This exhaustive guide equips you with the knowledge and frameworks to tackle any system design problem. Combine it with practice and real‑world case studies to build confidence. Good luck!