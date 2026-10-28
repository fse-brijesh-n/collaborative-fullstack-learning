Redis – Complete In‑Depth Guide (Beginner to Advanced)

with Spring Boot – Every Topic Covered Exhaustively

This document is the ultimate resource for Redis. It begins with absolute fundamentals and progresses to advanced internals, clustering, security, modules, and production patterns. Each section is broken down into its smallest components, with clear explanations and Spring Boot code examples where applicable. No topic is omitted.

---

Table of Contents

1. Introduction to Redis
2. Installation & Setup
3. Redis Architecture & Single‑Threaded Event Loop
4. Core Data Types & Commands – In Depth
   · 4.1 Strings
   · 4.2 Hashes
   · 4.3 Lists
   · 4.4 Sets
   · 4.5 Sorted Sets
   · 4.6 Streams
   · 4.7 Geospatial Indexes
   · 4.8 HyperLogLog
   · 4.9 Bitmaps
   · 4.10 Bitfields
5. Key Expiration & TTL
6. Pipelining
7. Transactions
8. Pub/Sub Messaging
9. Keyspace Notifications
10. Lua Scripting
11. Persistence – RDB, AOF & Hybrid
12. Replication & High Availability
13. Redis Sentinel
14. Redis Cluster
15. Security – Authentication, ACLs & TLS
16. Memory Management & Internal Encoding
17. Eviction Policies & LRU/LFU Algorithms
18. Monitoring, Logging & Troubleshooting
19. Backup & Restore
20. Redis Stack & Modules
21. Spring Boot with Redis – All Integration Recipes
    · 21.1 Dependencies & Auto‑Configuration
    · 21.2 RedisTemplate & StringRedisTemplate
    · 21.3 Operations for Every Data Type (with code)
    · 21.4 Caching with @Cacheable, @CacheEvict, etc.
    · 21.5 Session Management with Spring Session Redis
    · 21.6 Pub/Sub with MessageListenerContainer
    · 21.7 Reactive Redis (ReactiveRedisTemplate)
    · 21.8 Streams with Consumer Groups
    · 21.9 Redisson – Distributed Locks, Maps, etc.
    · 21.10 Testing with Embedded Redis & Testcontainers
    · 21.11 Health Checks & Actuator
    · 21.12 Connection Pooling & Lettuce Tuning
22. Common Patterns & Use Cases
    · 22.1 Caching Patterns
    · 22.2 Session Store
    · 22.3 Rate Limiting
    · 22.4 Leaderboard / Real‑time Ranking
    · 22.5 Distributed Locks (Redlock)
    · 22.6 Task Queues (Simple & Reliable)
    · 22.7 Full‑Page Cache & API Response Cache
    · 22.8 Real‑time Analytics
    · 22.9 Geospatial Applications
    · 22.10 Event Sourcing & CQRS with Streams
23. Redis in Microservices & Cloud‑Native
24. Performance Tuning & Benchmarking
25. Common Pitfalls & Anti‑patterns
26. Redis vs Other Technologies
27. Interview Questions & Answers

---

1. Introduction to Redis

Redis (Remote Dictionary Server) is an open‑source, in‑memory data structure store used as a database, cache, message broker, and streaming engine. It stores data in RAM for sub‑millisecond latency and optionally persists it to disk. Its rich set of data structures and atomic operations make it incredibly versatile.

Key characteristics:

· In‑memory with optional disk persistence.
· Single‑threaded command processing (avoids locks).
· Rich data types: Strings, Hashes, Lists, Sets, Sorted Sets, Streams, Geospatial, HyperLogLog, Bitmaps, Bitfields.
· Atomic operations: all commands are atomic; Lua scripts enable custom atomic operations.
· Replication (master‑slave) and automatic failover with Sentinel.
· Partitioning via Redis Cluster for horizontal scaling.
· Extensible via modules (RediSearch, RedisJSON, RedisTimeSeries, etc.) and Lua scripting.
· Versatile: used for caching, session stores, real‑time analytics, rate limiting, message queues, leaderboards, geospatial queries, and more.

---

2. Installation & Setup

Using Docker (recommended for development)

```bash
docker run --name redis -p 6379:6379 -d redis:7.2
```

With custom config:

```bash
docker run -d --name redis -p 6379:6379 -v /path/to/redis.conf:/usr/local/etc/redis/redis.conf redis:7.2 redis-server /usr/local/etc/redis/redis.conf
```

Native installation (Ubuntu)

```bash
sudo apt install redis-server
sudo systemctl start redis
```

Connect via CLI

```bash
redis-cli -h host -p port -a password
```

---

3. Redis Architecture & Single‑Threaded Event Loop

Redis uses a single‑threaded event loop to process commands. I/O multiplexing (epoll/kqueue) allows it to handle many concurrent connections without threads. Command execution is sequential and atomic, eliminating locking and context‑switching overhead. Blocking commands (like KEYS *) should be avoided because they stall the entire server. Modern Redis also uses background threads for tasks like unlinking large objects.

---

4. Core Data Types & Commands – In Depth

All Redis commands are atomic. Keys are binary‑safe (up to 512 MB).

4.1 Strings

Stores text, integers, binary up to 512 MB. Most basic type.

Key commands: SET key value [EX seconds] [NX|XX], GET, DEL, INCR / DECR, APPEND, GETRANGE, SETRANGE, MSET / MGET, SETEX, SETNX (deprecated, use SET … NX), GETDEL.

Spring Boot:

```java
@Autowired private StringRedisTemplate redisTemplate; // or RedisTemplate<String, String>
ValueOperations<String, String> ops = redisTemplate.opsForValue();
ops.set("greeting", "Hello, Redis!");
String val = ops.get("greeting");
ops.increment("counter", 1L);
ops.set("token", "abc123", Duration.ofMinutes(1));
```

4.2 Hashes

Map between string fields and string values.

Commands: HSET key field value [field value …], HGET, HGETALL, HDEL, HEXISTS, HINCRBY, HKEYS, HVALS, HLEN, HMGET.

Spring Boot:

```java
HashOperations<String, String, Object> hashOps = redisTemplate.opsForHash();
hashOps.put("user:1001", "name", "Alice");
hashOps.put("user:1001", "age", "30");
Map<String, Object> user = hashOps.entries("user:1001");
```

4.3 Lists

Linked lists of strings; can be used as stacks, queues.

Commands: LPUSH, RPUSH, LPOP, RPOP, LLEN, LRANGE key start stop, LINDEX, LSET, LREM, LTRIM, blocking ops BLPOP / BRPOP / BLMOVE.

Spring Boot:

```java
ListOperations<String, String> listOps = redisTemplate.opsForList();
listOps.leftPush("tasks", "task1");
listOps.rightPush("tasks", "task2");
String task = listOps.rightPop("tasks");
List<String> all = listOps.range("tasks", 0, -1);
```

4.4 Sets

Unordered collection of unique strings.

Commands: SADD, SREM, SMEMBERS, SISMEMBER, SCARD, SRANDMEMBER, SPOP, SMOVE, set arithmetic: SUNION, SINTER, SDIFF.

Spring Boot:

```java
SetOperations<String, String> setOps = redisTemplate.opsForSet();
setOps.add("languages", "Java", "Python");
boolean exists = setOps.isMember("languages", "Java");
Set<String> union = setOps.union("set1", "set2");
```

4.5 Sorted Sets

Each member has a score (float), kept sorted.

Commands: ZADD, ZRANGE, ZRANGEBYSCORE, ZREVRANGE, ZRANK, ZREM, ZSCORE, ZINCRBY, ZUNIONSTORE, ZINTERSTORE, blocking BZPOPMIN/BZPOPMAX.

Spring Boot:

```java
ZSetOperations<String, String> zsetOps = redisTemplate.opsForZSet();
zsetOps.add("leaderboard", "player1", 100);
Set<String> top3 = zsetOps.reverseRange("leaderboard", 0, 2);
Long rank = zsetOps.rank("leaderboard", "player1");
```

4.6 Streams

Append‑only log with consumer groups for reliable messaging.

Commands: XADD, XREAD, XREADGROUP, XGROUP CREATE/DESTROY/SETID, XACK, XPENDING, XRANGE, XDEL, XLEN, XTRIM.

Spring Boot (raw and listener):

```java
// Publishing
redisTemplate.opsForStream().add("mystream", Map.of("field", "value"));

// Consumer group listener (see section 21.8)
```

4.7 Geospatial Indexes

Store coordinates and query by radius/distance.

Commands: GEOADD, GEOPOS, GEODIST, GEOSEARCH.

Spring Boot:

```java
GeoOperations<String, String> geoOps = redisTemplate.opsForGeo();
geoOps.add("cities", new Point(2.3522, 48.8566), "Paris");
Distance dist = geoOps.distance("cities", "Paris", "London", Metrics.KILOMETERS);
```

4.8 HyperLogLog

Probabilistic unique count with ~12 KB memory.

Commands: PFADD, PFCOUNT, PFMERGE.

Spring Boot:

```java
HyperLogLogOperations<String, String> hllOps = redisTemplate.opsForHyperLogLog();
hllOps.add("visitors", "user1", "user2");
Long unique = hllOps.size("visitors");
```

4.9 Bitmaps

Strings can be operated as bitmaps.

Commands: SETBIT, GETBIT, BITCOUNT, BITOP, BITPOS.

Spring Boot: use ValueOperations to get/set bytes or execute(RedisCallback).

4.10 Bitfields

Arbitrary bit‑length integers within a string.

Command: BITFIELD.

---

5. Key Expiration & TTL

Set expiration via EXPIRE, PEXPIRE, EXPIREAT, SETEX, or SET … EX. Check with TTL, PTTL. Expired keys are automatically deleted.

Spring Boot:

```java
redisTemplate.opsForValue().set("key", "value", Duration.ofMinutes(5));
Long remaining = redisTemplate.getExpire("key");
```

---

6. Pipelining

Send multiple commands without waiting for each reply, reducing RTT.

Spring Boot (Lettuce):

```java
List<Object> results = redisTemplate.executePipelined(
    new SessionCallback<Object>() {
        public Object execute(RedisOperations ops) {
            ops.opsForValue().set("a", "1");
            ops.opsForValue().set("b", "2");
            return null;
        }
    });
```

---

7. Transactions

Group commands into atomic, isolated execution using MULTI, EXEC, DISCARD, WATCH (optimistic locking).

Spring Boot:

```java
redisTemplate.execute(new SessionCallback<Object>() {
    public Object execute(RedisOperations ops) {
        ops.multi();
        ops.opsForValue().set("x", "1");
        ops.opsForValue().set("y", "2");
        return ops.exec();
    }
});
```

---

8. Pub/Sub Messaging

Fire‑and‑forget message broadcasting. Not persisted.

Commands: PUBLISH, SUBSCRIBE, UNSUBSCRIBE, PSUBSCRIBE.

Spring Boot:

```java
// Listener
@Component
public class MyListener implements MessageListener {
    public void onMessage(Message msg, byte[] pattern) { ... }
}
// Register
@Bean
RedisMessageListenerContainer container(RedisConnectionFactory factory, MessageListener listener) {
    RedisMessageListenerContainer c = new RedisMessageListenerContainer();
    c.setConnectionFactory(factory);
    c.addMessageListener(listener, new PatternTopic("mychannel"));
    return c;
}
// Publish
redisTemplate.convertAndSend("mychannel", "Hello");
```

---

9. Keyspace Notifications

Enable with notify-keyspace-events config. Subscribe to __keyevent@* or __keyspace@* channels. Useful for cache invalidation, event triggers.

---

10. Lua Scripting

Execute custom atomic logic server‑side.

Example (inventory decrement):

```lua
local key = KEYS[1]
local needed = tonumber(ARGV[1])
local current = tonumber(redis.call('GET', key) or 0)
if current >= needed then
    redis.call('DECRBY', key, needed)
    return 1
else
    return 0
end
```

Spring Boot:

```java
DefaultRedisScript<Long> script = new DefaultRedisScript<>();
script.setScriptSource(new ResourceScriptSource(new ClassPathResource("decr.lua")));
script.setResultType(Long.class);
Long result = redisTemplate.execute(script, List.of("stock"), "5");
```

---

11. Persistence – RDB, AOF & Hybrid

· RDB: periodic snapshots. Fast restart, compact.
· AOF: logs every write. More durable; appendfsync can be everysec.
· Hybrid (Redis 4.0): combines AOF and RDB for faster rewrites.

Configuration: in redis.conf:

```
save 900 1
save 300 10
save 60 10000
appendonly yes
aof-use-rdb-preamble yes
```

---

12. Replication & High Availability

Master‑slave replication: master asynchronously sends writes to replicas. Replicas are read‑only by default. Partial resynchronization handles brief disconnections.

Command: REPLICAOF <masterip> <masterport>.

Spring Boot: use Sentinel or Cluster; not usually standalone replication.

---

13. Redis Sentinel

Provides monitoring, notification, and automatic failover. Requires at least 3 Sentinel nodes for quorum.

Spring Boot:

```java
RedisSentinelConfiguration sentinel = new RedisSentinelConfiguration()
    .master("mymaster")
    .sentinel("sentinel1", 26379)
    .sentinel("sentinel2", 26379);
LettuceConnectionFactory factory = new LettuceConnectionFactory(sentinel);
```

or application.yml:

```yaml
spring:
  data:
    redis:
      sentinel:
        master: mymaster
        nodes: sentinel1:26379,sentinel2:26379
```

---

14. Redis Cluster

Data sharded across nodes via 16384 hash slots (CRC16(key) % 16384). Automatic failover if replicas exist.

Spring Boot:

```java
RedisClusterConfiguration cluster = new RedisClusterConfiguration()
    .clusterNode("node1", 6379)
    .clusterNode("node2", 6379);
LettuceConnectionFactory factory = new LettuceConnectionFactory(cluster);
```

or application.yml:

```yaml
spring:
  data:
    redis:
      cluster:
        nodes: node1:6379,node2:6379
```

---

15. Security – Authentication, ACLs & TLS

· Legacy: requirepass and AUTH.
· ACLs (Redis 6+): fine‑grained permissions.
  ```bash
  ACL SETUSER appuser on >password ~cache:* +get +set
  ```
· TLS: tls-port, certificates.

Spring Boot with ACL:

```java
config.setUsername("appuser");
config.setPassword(RedisPassword.of("password"));
```

---

16. Memory Management & Internal Encoding

Redis uses specialized encodings to save memory: int, embstr, quicklist, listpack, intset, skiplist.

Memory optimization tips: use HSET instead of multiple keys, prefer listpack boundaries, avoid large keys.

---

17. Eviction Policies & LRU/LFU Algorithms

When maxmemory is reached, keys are evicted based on policy:

· noeviction: errors.
· allkeys-lru: evict least recently used.
· allkeys-lfu: evict least frequently used.
· volatile-lru/lfu/ttl/random: only keys with expiry.
· allkeys-random/volatile-random.

Set in redis.conf: maxmemory-policy allkeys-lru.

Spring Boot: configure cache TTL or use Redisson eviction.

---

18. Monitoring, Logging & Troubleshooting

· INFO – detailed server stats.
· SLOWLOG – record slow queries.
· LATENCY DOCTOR – diagnose latency.
· MONITOR (dev only) – real‑time command log.
· Redis Exporter for Prometheus.

Spring Boot Actuator auto‑discovers Redis and exposes health/micrometer metrics.

---

19. Backup & Restore

· RDB backup: trigger BGSAVE, copy dump.rdb.
· AOF backup: copy AOF file.
· Automated: cron + BGSAVE + upload to S3.

Restore: stop Redis, replace file, restart.

---

20. Redis Stack & Modules

· RediSearch: full‑text search, secondary indexes.
· RedisJSON: native JSON documents.
· RedisGraph: graph database.
· RedisTimeSeries: time‑series data.
· RedisBloom: Bloom/Cuckoo filters, Count‑Min Sketch.
· RedisAI: serve ML models.
· RedisGears: serverless functions.

Spring Boot integration: Redisson partially supports JSON; other modules have separate Java clients.

---

21. Spring Boot with Redis – All Integration Recipes

21.1 Dependencies & Auto‑Configuration

```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-data-redis</artifactId>
</dependency>
```

Auto‑configured RedisConnectionFactory via spring.redis.* properties.

21.2 RedisTemplate & StringRedisTemplate

```java
@Bean
public RedisTemplate<String, Object> redisTemplate(RedisConnectionFactory factory) {
    RedisTemplate<String, Object> template = new RedisTemplate<>();
    template.setConnectionFactory(factory);
    template.setKeySerializer(new StringRedisSerializer());
    template.setValueSerializer(new GenericJackson2JsonRedisSerializer());
    return template;
}
```

21.3 Operations for Every Data Type

We already demonstrated all operations earlier (sections 4.1‑4.10). All accessible via redisTemplate.opsFor*().

21.4 Caching with Annotations

```java
@Configuration
@EnableCaching
public class CacheConfig {
    @Bean
    public RedisCacheManager cacheManager(RedisConnectionFactory factory) {
        return RedisCacheManager.builder(factory)
            .cacheDefaults(RedisCacheConfiguration.defaultCacheConfig()
                .entryTtl(Duration.ofMinutes(10)))
            .build();
    }
}

@Service
public class UserService {
    @Cacheable(value = "users", key = "#id")
    public User getUser(String id) { /* DB */ }
    @CacheEvict(value = "users", key = "#id")
    public void deleteUser(String id) {}
}
```

21.5 Session Management

```java
@Configuration
@EnableRedisHttpSession
public class SessionConfig {}
```

Session data stored in Redis, shared across instances.

21.6 Pub/Sub with MessageListenerContainer

Already covered in Section 8.

21.7 Reactive Redis

```java
@Autowired private ReactiveRedisTemplate<String, Object> reactiveTemplate;
Mono<Object> get(String key) {
    return reactiveTemplate.opsForValue().get(key);
}
```

21.8 Streams with Consumer Groups

```java
@Bean
public StreamMessageListenerContainer<String, MapRecord<String, String, String>> listenerContainer(
        RedisConnectionFactory factory) {
    var options = StreamMessageListenerContainer.StreamMessageListenerContainerOptions
        .builder().pollTimeout(Duration.ofSeconds(1)).build();
    return StreamMessageListenerContainer.create(factory, options);
}

@PostConstruct
public void startListener() {
    container.receive(Consumer.from("group", "consumer1"),
        StreamOffset.create("mystream", ReadOffset.lastConsumed()),
        record -> {
            System.out.println("Got: " + record.getValue());
            redisTemplate.opsForStream().acknowledge("group", record);
        });
}
```

21.9 Redisson – Distributed Locks

```xml
<dependency>
    <groupId>org.redisson</groupId>
    <artifactId>redisson-spring-boot-starter</artifactId>
    <version>3.23.0</version>
</dependency>
```

```java
@Autowired private RedissonClient redisson;
public void doLocked() {
    RLock lock = redisson.getLock("myLock");
    lock.lock();
    try {
        // critical section
    } finally {
        lock.unlock();
    }
}
```

21.10 Testing

· Embedded Redis: embedded-redis library (unit tests).
· Testcontainers:

```java
@Container
static GenericContainer<?> redis = new GenericContainer<>(DockerImageName.parse("redis:7.2"))
    .withExposedPorts(6379);
```

21.11 Health Checks

Actuator automatically exposes /actuator/health with Redis status.

21.12 Connection Pooling

Lettuce uses built‑in connection pooling. Tune via LettucePoolingClientConfiguration:

```java
LettucePoolingClientConfiguration poolConfig = LettucePoolingClientConfiguration.builder()
    .poolConfig(new GenericObjectPoolConfig()).build();
```

---

22. Common Patterns & Use Cases

· Caching: cache‑aside, write‑through.
· Session Store: Spring Session Redis.
· Rate Limiting: INCR + EXPIRE or Lua token bucket.
· Leaderboards: Sorted Sets.
· Distributed Locks: Redlock algorithm (Redisson).
· Task Queues: Lists for simple, Streams for reliable.
· Full‑Page Cache: store HTML/JSON with TTL.
· Analytics: HyperLogLog for unique counts, bitmaps for daily active users.
· Geospatial: store GPS coordinates, find nearby points.
· Event Sourcing: Streams as event store.

---

23. Redis in Microservices & Cloud‑Native

· Run Redis as a sidecar container in Kubernetes.
· Use StatefulSets for Redis Sentinel/Cluster.
· Helm charts for easy deployment.
· Spring Cloud integrates with Redis via config, bus, and data.

---

24. Performance Tuning & Benchmarking

Benchmark: redis-benchmark -t set,get -n 100000 -q.
Tuning: adjust maxmemory, tcp-backlog, timeout, disable THP, set vm.overcommit_memory=1. Use pipelining and connection pooling.

---

25. Common Pitfalls & Anti‑patterns

· Using KEYS * in production → SCAN.
· Storing huge values → split or compress.
· No eviction policy → OOM kill.
· Blocking Lua scripts → timeouts.
· Not monitoring replication lag.

---

26. Redis vs Other Technologies

· Memcached: simple string cache, no persistence or data structures.
· Hazelcast/Infinispan: embedded Java data grid, not language‑agnostic.

---

27. Interview Questions & Answers

1. What is Redis? – In‑memory data store with rich types, used for caching, messaging, analytics.
2. Explain data types and use cases – Strings, Hashes, Lists, Sets, Sorted Sets, Streams, etc.
3. Persistence options? – RDB snapshots, AOF logs, hybrid.
4. How does Sentinel work? – Monitors master, auto‑failover with quorum.
5. Redis Cluster sharding? – 16384 hash slots, CRC16 partition.
6. Eviction policies? – LRU, LFU, TTL, random.
7. Distributed lock implementation? – SET NX PX or Redlock via Redisson.
8. What is pipelining? – Batching commands without waiting for replies.
9. Transactions in Redis? – MULTI/EXEC, optimistic locking with WATCH.
10. How to achieve exactly‑once with Redis Streams? – Consumer groups and XACK.
11. Lua scripting benefits? – Atomic complex operations.
12. Difference between Pub/Sub and Streams? – Pub/Sub fire‑and‑forget; Streams persist and support consumer groups.
13. Monitoring Redis? – INFO, SLOWLOG, LATENCY, Prometheus exporter.
14. Spring Boot integration? – RedisTemplate, @Cacheable, Spring Session, etc.

---

This exhaustive guide covers every Redis topic from beginner to advanced, with complete Spring Boot code examples and in‑depth explanations. It is your definitive resource for mastering Redis in production and acing any interview.
