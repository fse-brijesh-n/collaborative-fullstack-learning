Apache Kafka In‑Depth Guide (Beginner to Advanced)

with Spring Boot – Every Possible Topic Covered

This document exhaustively covers Apache Kafka from fundamental concepts to the deepest internals and advanced integrations.
It includes Spring Boot code examples for every practical aspect, and explains every possible topic – configuration, APIs, patterns, operations, security, testing, performance, and more.
The material is designed to be your single source of truth for mastering Kafka in production and acing any interview.

---

Table of Contents

1. Kafka Fundamentals & Architecture
2. Topics, Partitions, and Storage Internals
3. Producers – Complete Guide
4. Consumers – Complete Guide
5. Consumer Groups, Rebalancing, and Offsets
6. Serialization & Deserialization (Serdes)
7. Schema Registry & Avro / Protobuf / JSON Schema
8. Exactly‑Once Semantics & Transactions
9. Kafka Streams
10. Kafka Connect
11. Admin Client & Topic Management
12. Security – SSL, SASL, ACLs
13. Monitoring & Operations
14. Performance Tuning
15. Testing Kafka Applications
16. Kafka in Microservices – Patterns and Practices
17. Multi‑Cluster, Geo‑Replication, MirrorMaker 2
18. Kafka KRaft – Migrating from ZooKeeper
19. Operational Commands & Tools
20. Spring Boot with Kafka – All Recipes
21. Interview Questions & Answers

---

1. Kafka Fundamentals & Architecture

1.1 What is Kafka?

Apache Kafka is a distributed event streaming platform that lets you publish, subscribe to, store, and process streams of events in real time.
It is used for high‑throughput, low‑latency, durable, fault‑tolerant messaging.

Core capabilities:

· Publish / Subscribe – decouple producers and consumers.
· Store – events are durably persisted on disk and replicated.
· Process – real‑time stream processing via Kafka Streams / ksqlDB.

1.2 Basic Terminology

· Event (Message) – unit of data: key, value, timestamp, headers.
· Producer – application that publishes events.
· Consumer – application that subscribes to events.
· Broker – a Kafka server that stores data and serves clients.
· Cluster – group of brokers working together.
· Topic – category/feed name to which records are published.
· Partition – ordered, immutable sequence of records within a topic.
· Offset – unique sequential ID of a record within a partition.
· Consumer Group – set of consumers that share the work of consuming a topic.

1.3 Cluster Architecture

Kafka runs as a cluster of one or more brokers.
Each broker can host multiple partitions.
The cluster has a controller (one broker) responsible for managing partition leadership.

1.4 ZooKeeper vs KRaft

· ZooKeeper – historically used for cluster metadata, leader election, and configuration. Deprecated.
· KRaft (Kafka Raft) – a built‑in consensus mechanism that removes the ZooKeeper dependency.
    KRaft is the recommended mode from Kafka 3.3+, and ZooKeeper will be removed in Kafka 4.0.

1.5 How Kafka Achieves High Throughput and Low Latency

· Zero‑copy transfer of data from disk to network.
· Sequential disk I/O (append‑only log).
· Batching of messages.
· Partitioning for parallel consumption.
· Page‑cache utilization (OS level).

---

2. Topics, Partitions, and Storage Internals

2.1 Partition Structure on Disk

Each partition is a log – a collection of segment files.
Active segment is written to; older segments are closed and eventually deleted/compacted.

Segment files:

· .log – the messages.
· .index – maps offsets to file positions.
· .timeindex – maps timestamps to offsets.

2.2 Log Compaction

Ensures that at least the latest value for each key is kept, older records with the same key are removed.
Useful for change‑data‑capture and caching scenarios.

Topic configuration: cleanup.policy=compact.

2.3 Retention Policies

· Time‑based: retention.ms (default 7 days).
· Size‑based: retention.bytes (per partition).
· Both can be combined.

Segments are deleted when they are older than retention.ms and the total log size exceeds retention.bytes.

2.4 Partitioning Strategies

Messages are assigned to partitions by the producer using a partitioner.

· Default: DefaultPartitioner – hash of key (or sticky partitioning if no key).
· Custom: implement org.apache.kafka.clients.producer.Partitioner.

Key ordering guarantee: all messages with the same key go to the same partition, thus their order is preserved.

2.5 Partition Reassignment

You can move partitions between brokers using kafka-reassign-partitions.
This is typically done for cluster expansion or rebalancing.

2.6 Increasing Partitions

You can increase the number of partitions of an existing topic (kafka-topics --alter).
Warning: messages with keys will be redistributed, breaking ordering guarantees for existing keys. Never decrease partitions.

---

3. Producers – Complete Guide

3.1 Producer Workflow

1. A ProducerRecord is created (topic, key, value).
2. Serialized using the configured key/value serializers.
3. Partitioner chooses the partition.
4. Record added to a batch of records for that partition.
5. A background Sender thread sends the batches to the broker.
6. Broker appends to the log and returns a RecordMetadata (or error).

3.2 Spring Boot Producer Configuration

```java
@Configuration
public class KafkaProducerConfig {
    @Bean
    public ProducerFactory<String, Object> producerFactory() {
        Map<String, Object> config = new HashMap<>();
        config.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
        config.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
        config.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, JsonSerializer.class);
        // Additional settings...
        return new DefaultKafkaProducerFactory<>(config);
    }

    @Bean
    public KafkaTemplate<String, Object> kafkaTemplate() {
        return new KafkaTemplate<>(producerFactory());
    }
}
```

application.yml equivalent:

```yaml
spring:
  kafka:
    producer:
      bootstrap-servers: localhost:9092
      key-serializer: org.apache.kafka.common.serialization.StringSerializer
      value-serializer: org.springframework.kafka.support.serializer.JsonSerializer
```

3.3 Sending Messages

3.3.1 Fire‑and‑Forget

```java
kafkaTemplate.send("orders", order);
```

3.3.2 Synchronous Send (block for result)

```java
SendResult<String, Order> result = kafkaTemplate.send("orders", key, order).get();
RecordMetadata meta = result.getRecordMetadata();
```

3.3.3 Asynchronous with Callback

```java
kafkaTemplate.send("orders", key, order)
    .thenAccept(result -> {
        System.out.println("Offset: " + result.getRecordMetadata().offset());
    })
    .exceptionally(ex -> {
        System.err.println("Failed: " + ex.getMessage());
        return null;
    });
```

3.4 Key Producer Configurations

Config Description
bootstrap.servers Kafka broker list
key.serializer / value.serializer Serializer classes
acks 0, 1, all (–1)
retries Number of retries (default Integer.MAX_VALUE with idempotence)
enable.idempotence Prevents duplicate writes due to retries
max.in.flight.requests.per.connection Max unacknowledged sends; must be ≤5 for idempotent, 1 for strict ordering
compression.type none, gzip, snappy, lz4, zstd
linger.ms Artificial delay to accumulate batch (default 0)
batch.size Max batch size in bytes (default 16KB)
buffer.memory Total memory for buffering unsent records
client.id Logical name for the client
transactional.id Required for transactions

3.5 Producer Batching & Compression

· Batching: linger.ms=5 and batch.size=16384 (default).
    Larger batches → better throughput, but higher latency.
· Compression: compression.type=snappy (good balance).
    Compresses the batch, reducing network and disk usage.

3.6 Idempotent Producer

Enabled by enable.idempotence=true.
Automatically sets acks=all, retries=MAX_INT, max.in.flight.requests=5.
Uses a producer ID (PID) and sequence numbers to deduplicate.

3.7 Custom Partitioners

Implement org.apache.kafka.clients.producer.Partitioner:

```java
public class MyPartitioner implements Partitioner {
    @Override
    public int partition(String topic, Object key, byte[] keyBytes, Object value, byte[] valueBytes, Cluster cluster) {
        // custom logic
        return 0;
    }
    @Override public void close() {}
    @Override public void configure(Map<String, ?> configs) {}
}
```

Register in config:

```properties
partitioner.class=com.example.MyPartitioner
```

3.8 Custom Serializers

Implement Serializer<T>:

```java
public class OrderSerializer implements Serializer<Order> {
    private final ObjectMapper mapper = new ObjectMapper();
    @Override
    public byte[] serialize(String topic, Order data) {
        return mapper.writeValueAsBytes(data);
    }
}
```

Set value.serializer=com.example.OrderSerializer.

---

4. Consumers – Complete Guide

4.1 Consumer Poll Loop

Consumers poll in a loop. The poll() method returns a batch of records and also handles heartbeats and rebalance.

```java
while (true) {
    ConsumerRecords<String, Order> records = consumer.poll(Duration.ofMillis(100));
    records.forEach(record -> { /* process */ });
}
```

4.2 Spring Boot Consumer Configuration

```java
@Configuration
public class KafkaConsumerConfig {
    @Bean
    public ConsumerFactory<String, Order> consumerFactory() {
        Map<String, Object> props = new HashMap<>();
        props.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
        props.put(ConsumerConfig.GROUP_ID_CONFIG, "order-group");
        props.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
        props.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, JsonDeserializer.class);
        props.put(JsonDeserializer.TRUSTED_PACKAGES, "com.example.*");
        return new DefaultKafkaConsumerFactory<>(props);
    }

    @Bean
    public ConcurrentKafkaListenerContainerFactory<String, Order> kafkaListenerContainerFactory() {
        ConcurrentKafkaListenerContainerFactory<String, Order> factory =
            new ConcurrentKafkaListenerContainerFactory<>();
        factory.setConsumerFactory(consumerFactory());
        return factory;
    }
}
```

application.yml:

```yaml
spring:
  kafka:
    consumer:
      bootstrap-servers: localhost:9092
      group-id: order-group
      key-deserializer: org.apache.kafka.common.serialization.StringDeserializer
      value-deserializer: org.springframework.kafka.support.serializer.JsonDeserializer
      properties:
        spring.json.trusted.packages: com.example.*
```

4.3 Using @KafkaListener

```java
@Service
public class OrderConsumer {
    @KafkaListener(topics = "orders", groupId = "order-group")
    public void listen(Order order) {
        // process
    }
}
```

4.4 Manual Offset Commits

Disable auto‑commit and manually acknowledge:

```yaml
spring.kafka.consumer.enable-auto-commit: false
spring.kafka.listener.ack-mode: manual
```

```java
@KafkaListener(topics = "orders", groupId = "order-group")
public void listen(Order order, Acknowledgment ack) {
    // process
    ack.acknowledge();
}
```

4.5 Offset Management Strategies

· Auto commit: offsets committed periodically, at‑least‑once.
· Manual commit (synchronous / asynchronous): explicit commitSync() or commitAsync().
· Transactional exactly‑once: offsets committed in the same transaction as the output (via Kafka Streams or transactional producers).

4.6 Rebalance Listeners

Implement ConsumerAwareRebalanceListener to perform actions when partitions are assigned/revoked.

```java
factory.getContainerProperties().setConsumerRebalanceListener(
    new ConsumerAwareRebalanceListener() {
        @Override
        public void onPartitionsAssigned(Consumer<?, ?> consumer, Collection<TopicPartition> partitions) {
            // e.g., seek to a specific offset
        }
    });
```

4.7 Error Handling & Dead Letter Topics

Spring Kafka provides a comprehensive error handling framework.

Non‑blocking retries (default after Spring Kafka 2.7):

```java
@Bean
public DefaultErrorHandler errorHandler(KafkaTemplate<Object, Object> template) {
    DeadLetterPublishingRecoverer recoverer = new DeadLetterPublishingRecoverer(template);
    DefaultErrorHandler handler = new DefaultErrorHandler(recoverer, new FixedBackOff(1000L, 3));
    handler.addNotRetryableExceptions(IllegalArgumentException.class);
    return handler;
}
```

Set on the container factory:

```java
factory.setCommonErrorHandler(errorHandler);
```

4.8 Concurrent Consumers

Set concurrency to increase the number of threads per listener container.

```java
factory.setConcurrency(3);
```

4.9 Batch Consumption

Set spring.kafka.listener.type: batch. The listener method receives List<T>.

```java
@KafkaListener(topics = "orders")
public void listen(List<Order> orders) { ... }
```

4.10 Static Group Membership

Reduce rebalances by assigning a unique group.instance.id to each consumer.

```yaml
spring.kafka.consumer.properties.group.instance.id: my-instance-1
```

4.11 Cooperative Rebalancing

Use CooperativeStickyAssignor to minimize pause during rebalancing.

```yaml
spring.kafka.consumer.properties.partition.assignment.strategy: org.apache.kafka.clients.consumer.CooperativeStickyAssignor
```

4.12 Consumer Lag

kafka-consumer-groups --describe shows LAG. In Spring Boot, you can monitor lag via metrics.

---

5. Consumer Groups, Rebalancing, and Offsets

5.1 Consumer Group Protocol

· Group coordinator (a broker) manages group membership.
· Heartbeats: heartbeat.interval.ms and session.timeout.ms.
· Poll loop must call poll() frequently enough (max.poll.interval.ms), otherwise consumer is considered dead → rebalance.

5.2 Partition Assignment Strategies

· Range – partitions divided by topic ranges.
· RoundRobin – evenly distributed.
· Sticky – minimizes partition movement.
· Cooperative Sticky – sticky assignment but allows incremental rebalancing.

5.3 Offset Storage

Offsets are stored in the internal topic __consumer_offsets.
Log compaction keeps the latest committed offset per consumer group per partition.

5.4 Seeking to Specific Offsets

Use consumer.seek(partition, offset) or consumer.seekToBeginning(partitions).

---

6. Serialization & Deserialization (Serdes)

6.1 Built‑in Serdes

· StringSerializer/StringDeserializer
· LongSerializer, IntegerSerializer, DoubleSerializer
· ByteArraySerializer
· Spring provides JsonSerializer/JsonDeserializer (JSON via Jackson)
· Confluent provides Avro, Protobuf, JSON Schema serializers

6.2 Custom Serdes

Implement org.apache.kafka.common.serialization.Serde<T> or simply Serializer<T> / Deserializer<T>.

```java
public class OrderSerde implements Serde<Order> {
    // provide serializer and deserializer
}
```

---

7. Schema Registry & Avro / Protobuf / JSON Schema

7.1 Why Schema Registry?

· Enforces data contracts.
· Enables schema evolution without breaking consumers.
· Stores versioned schemas; each record includes a schema ID.

7.2 Avro Configuration (Confluent)

pom.xml dependencies:

```xml
<dependency>
    <groupId>io.confluent</groupId>
    <artifactId>kafka-avro-serializer</artifactId>
    <version>7.5.0</version>
</dependency>
```

Spring Boot config:

```yaml
spring:
  kafka:
    properties:
      schema.registry.url: http://localhost:8081
    producer:
      value-serializer: io.confluent.kafka.serializers.KafkaAvroSerializer
    consumer:
      value-deserializer: io.confluent.kafka.serializers.KafkaAvroDeserializer
```

7.3 Subject Naming Strategies

· TopicNameStrategy (default) – schema subject = <topic>-value / <topic>-key
· RecordNameStrategy – subject = fully qualified record name
· TopicRecordNameStrategy – combination of topic and record name

7.4 Schema Compatibility

· BACKWARD – new schema can read old data (default).
· FORWARD – old schema can read new data.
· FULL – both backward and forward.
· NONE – no compatibility checks.

7.5 Schema References and Avro Evolution

Avro supports schema evolution via adding fields with defaults, removing fields with backward‑compatible defaults, etc.

---

8. Exactly‑Once Semantics & Transactions

8.1 Message Delivery Guarantees

· At‑most‑once: messages may be lost (acks=0).
· At‑least‑once: messages never lost but may duplicate (acks=all, manual commit).
· Exactly‑once: each message is processed once and only once.

8.2 Idempotent Producer

· enable.idempotence=true ensures the producer deduplicates retries.
· Must set acks=all, retries are automatically high.

8.3 Transactions

· Assign a transactional.id to the producer.
· producer.initTransactions(), beginTransaction(), send(), commitTransaction(), abortTransaction().

Spring Boot transactional producer:

```java
@Bean
KafkaTransactionManager<Object, Object> transactionManager(ProducerFactory<Object, Object> pf) {
    return new KafkaTransactionManager<>(pf);
}
```

Then use @Transactional on methods that call kafkaTemplate.send(...). Spring will automatically manage begin/commit/abort.

8.4 Exactly‑Once Consumer Pattern

· Use manual offset commit and store offsets in the same transaction as the output (write to Kafka).
· Kafka Streams provides exactly_once_v2 guarantee out of the box.

8.5 Consumer Isolation Level

isolation.level=read_committed ensures consumers only see committed transactional messages (filter out aborted transactions).

---

9. Kafka Streams

9.1 Overview

Kafka Streams is a client library for building stream‑processing applications, where the input and output are Kafka topics.

Spring Boot auto‑configuration:

· Add spring-kafka (Streams is included).
· Configure spring.kafka.streams.application-id, bootstrap-servers.
· Use StreamsBuilder bean.

```java
@Configuration
@EnableKafkaStreams
public class StreamsConfig {
    @Bean
    public KStream<String, Order> process(StreamsBuilder builder) {
        KStream<String, Order> stream = builder.stream("orders");
        stream.filter((k,v) -> v.getAmount() > 100)
              .to("large-orders");
        return stream;
    }
}
```

9.2 Streams DSL

· KStream – record stream (inserts).
· KTable – changelog stream (latest value per key).
· GlobalKTable – fully replicated, used for joins.
· KGroupedStream – after groupBy/groupByKey.

9.2.1 Stateless Transformations

map, mapValues, filter, flatMap, branch, merge, selectKey.

9.2.2 Stateful Transformations

· Aggregation: count(), reduce(), aggregate().
· Joins: KStream‑KStream, KStream‑KTable, KTable‑KTable.
· Windowing: Tumbling, Hopping, Session, Sliding.

```java
KTable<Windowed<String>, Long> windowedCounts = orders
    .groupByKey()
    .windowedBy(TimeWindows.ofSizeWithNoGrace(Duration.ofMinutes(5)))
    .count();
```

9.3 State Stores

Stateful operations need state stores (RocksDB by default). They can be:

· In‑memory (testing).
· Persistent (default, backed by RocksDB).

Fault tolerance: changelog topics are created to back up the state store.

9.4 Interactive Queries

Expose the state store to the outside world via REST APIs using QueryableStoreTypes.

```java
ReadOnlyKeyValueStore<String, Long> store = streams.store(
    StoreQueryParameters.fromNameAndType("store-name", QueryableStoreTypes.keyValueStore()));
```

9.5 Punctuators

Schedule periodic actions with ProcessorContext.schedule().

9.6 Testing Streams

Use TopologyTestDriver to test topologies without a running Kafka cluster.

9.7 Exactly‑Once in Streams

Set processing.guarantee=exactly_once_v2. Streams will use transactional producers and atomic commit.

---

10. Kafka Connect

10.1 Architecture

· Worker – JVM process executing connectors and tasks.
· Connector – manages data integration (source/sink).
· Task – unit of work; multiple tasks for parallelism.
· Distributed mode – workers share configuration and work (using Kafka topics).

10.2 Common Connectors

· JDBC Source/Sink
· Debezium (CDC)
· Elasticsearch, S3, etc.

10.3 Managing Connectors via REST API

· POST /connectors – create.
· GET /connectors – list.
· DELETE /connectors/{name} – remove.

10.4 Converters and Transforms

· Converters: JSON, Avro, Protobuf, String.
· Transformations (SMTs): manipulate records (e.g., ExtractField).

Spring Boot applications typically interact with Connect via REST; not embedded.

---

11. Admin Client & Topic Management

11.1 Spring Boot Admin Client Bean

```java
@Bean
public KafkaAdmin kafkaAdmin() {
    Map<String, Object> configs = new HashMap<>();
    configs.put(AdminClientConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
    return new KafkaAdmin(configs);
}
```

11.2 Programmatic Topic Creation

```java
@Bean
public NewTopic ordersTopic() {
    return TopicBuilder.name("orders")
            .partitions(3)
            .replicas(1)
            .config(TopicConfig.COMPRESSION_TYPE_CONFIG, "snappy")
            .build();
}
```

11.3 AdminClient Operations

· describeTopics, listTopics, createTopics, deleteTopics.
· describeConsumerGroups, listConsumerGroupOffsets.

---

12. Security – SSL, SASL, ACLs

12.1 Encryption (SSL/TLS)

Configure listeners to SSL, provide keystore/truststore.

Spring Boot:

```yaml
spring:
  kafka:
    ssl:
      trust-store-location: file:/path/to/truststore.jks
      trust-store-password: secret
      key-store-location: file:/path/to/keystore.jks
      key-store-password: secret
```

12.2 Authentication (SASL)

· SASL/PLAIN (simple user/password)
· SASL/SCRAM (salted challenge response)
· SASL/GSSAPI (Kerberos)
· SASL/OAUTHBEARER (OAuth2 tokens)

Example SASL/SCRAM config:

```yaml
spring:
  kafka:
    properties:
      security.protocol: SASL_SSL
      sasl.mechanism: SCRAM-SHA-256
      sasl.jaas.config: 'org.apache.kafka.common.security.scram.ScramLoginModule required username="user" password="secret";'
```

12.3 Authorization (ACLs)

Kafka ACLs control which principals can perform operations on resources (topics, groups, etc.).
Managed with kafka-acls CLI.

---

13. Monitoring & Operations

13.1 Key Metrics

· Under‑replicated partitions (alert if >0 for long).
· Active controller count (must be 1).
· Consumer lag – critical for consumer health.
· Produce/fetch request latency.
· Disk utilization.

13.2 Consumer Lag Monitoring

· kafka-consumer-groups --describe
· Burrow (LinkedIn’s lag checker).
· Prometheus + Grafana (via JMX Exporter or direct Prometheus endpoint).

13.3 Prometheus Integration

Use micrometer-registry-prometheus in Spring Boot, and optionally kafka-jmx-exporter on broker side.

13.4 Useful Operational Commands

· kafka-topics --describe
· kafka-consumer-groups --describe --members --verbose
· kafka-configs --describe
· kafka-reassign-partitions
· kafka-preferred-replica-election

---

14. Performance Tuning

14.1 Producer Tuning

· batch.size = 32KB – 64KB
· linger.ms = 5 – 100ms
· compression.type = lz4 or snappy
· buffer.memory = 32MB+
· acks = all (or -1) with min.insync.replicas=2

14.2 Consumer Tuning

· fetch.min.bytes = 1 (default) or higher to increase fetch size
· fetch.max.wait.ms = 500
· max.poll.records = 500
· Use multiple partitions and consumers

14.3 Broker Tuning

· num.network.threads = number of CPU cores
· num.io.threads = 2 * number of disks
· log.flush.interval.messages = 10000 (trade‑off between durability and performance)
· Use multiple data directories on different physical disks
· Increase socket send/receive buffers

14.4 OS Tuning

· Page cache – allocate sufficient RAM.
· Disable swap.
· Increase file descriptors (ulimit -n).
· Use SSD for log directories.

---

15. Testing Kafka Applications

15.1 Embedded Kafka (Spring Boot Test)

```java
@SpringBootTest
@EmbeddedKafka(partitions = 1, topics = {"orders"})
public class KafkaIntegrationTest {
    @Autowired
    private KafkaTemplate<String, Order> template;
    @Autowired
    private EmbeddedKafkaBroker broker;

    // test logic
}
```

15.2 Testcontainers

Use org.testcontainers:kafka module to start a real Kafka container in tests.

15.3 TopologyTestDriver (Kafka Streams)

Test stream topologies without a broker:

```java
TopologyTestDriver testDriver = new TopologyTestDriver(topology, config);
TestInputTopic<String, Order> input = testDriver.createInputTopic(...);
TestOutputTopic<String, Order> output = testDriver.createOutputTopic(...);
```

15.4 Mocking KafkaTemplate

Use @MockBean to mock KafkaTemplate in unit tests when you only want to verify that a send was triggered.

---

16. Kafka in Microservices – Patterns and Practices

16.1 Event‑Driven Architecture

Services communicate by publishing domain events.
Producer: OrderPlaced event. Consumer: InventoryService reacts.

16.2 Transactional Outbox Pattern

Reliably publish events: write the event into an outbox table in the same DB transaction as the business data. A separate process (Debezium / Kafka Connect) tails the outbox and publishes to Kafka.

16.3 CQRS (Command Query Responsibility Segregation)

Separate read and write models. Events from the write side populate the read database.

16.4 Saga Pattern

Orchestrated or choreographed distributed transactions across services using events.

16.5 Spring Cloud Stream with Kafka

spring-cloud-stream-binder-kafka provides an opinionated binding abstraction on top of Spring Kafka.

---

17. Multi‑Cluster, Geo‑Replication, MirrorMaker 2

17.1 MirrorMaker 2

Kafka’s built‑in tool for replicating data between clusters (active‑active or active‑passive).
It preserves partitioning, offsets, and metadata.

17.2 Confluent Replicator

Confluent’s commercial alternative with more features.

17.3 Use Cases

· Disaster recovery.
· Aggregating data from multiple regions to a central cluster.
· Migrating between data centers.

---

18. Kafka KRaft – Migrating from ZooKeeper

18.1 KRaft Mode Overview

· Metadata is stored in a metadata topic partition, replicated across controller nodes.
· Broker and controller roles can be combined or separate.
· Simplified deployment, better scalability.

18.2 Configuration

Set process.roles=broker,controller, node.id, controller.quorum.voters.

18.3 Migration Path

Kafka provides tools to migrate a ZooKeeper cluster to KRaft without downtime.

---

19. Operational Commands & Tools

Tool Purpose
kafka-topics Create, delete, describe, alter topics
kafka-consumer-groups Manage consumer groups, check lag
kafka-configs View/alter topic, broker, user configs
kafka-acls Manage access control lists
kafka-reassign-partitions Move partitions between brokers
kafka-preferred-replica-election Trigger leader election for balanced leadership
kafka-log-dirs Inspect disk usage of log directories
kafka-dump-log Dump segment log contents (debugging)

---

20. Spring Boot with Kafka – All Recipes

· Configuring multiple Kafka clusters: define separate KafkaAdmin, KafkaTemplate, and ConsumerFactory beans.
· Filtering records before processing: implement RecordFilterStrategy on the listener container.
· Listening to multiple topics with different configurations: use multiple ConcurrentKafkaListenerContainerFactory beans and specify in @KafkaListener(containerFactory=...).
· Pausing and resuming consumers: KafkaListenerEndpointRegistry to manage lifecycle.
· Interceptors: ProducerInterceptor and ConsumerInterceptor for adding headers, logging, etc.
· Metrics: expose Kafka client metrics via Micrometer.
· Error serialization: ErrorHandlingDeserializer to handle poison pills.

---

21. Interview Questions & Answers

1. Explain partitions and offsets.
      – Partitions are ordered, immutable logs; offsets uniquely identify messages within a partition.
2. How to guarantee message ordering?
      – Use a message key to ensure all related messages go to the same partition; also set max.in.flight.requests=1 if strict ordering needed.
3. What is the ISR?
      – In‑Sync Replicas are replicas fully caught up with the leader; used for leader election and durability.
4. How does a consumer group rebalance work?
      – When members join or leave, the group coordinator triggers a rebalance, reassigning partitions among active members.
5. How to achieve exactly‑once?
      – Idempotent producer + transactions + read committed consumers; Kafka Streams provides exactly_once_v2.
6. What is a dead letter topic?
      – A topic where messages that cannot be processed after retries are sent for later inspection.
7. How to handle large messages?
      – Use external storage (S3) and send only a reference in Kafka; or configure max.message.bytes on broker and topic.
8. Explain Kafka Streams state store and fault tolerance.
      – State stores (RocksDB) are backed up by changelog topics; on instance failure, state is restored from changelog.
9. What is MirrorMaker 2?
      – A tool for replicating data between Kafka clusters, preserving offsets and metadata.
10. How to monitor consumer lag?
        – kafka-consumer-groups --describe, Burrow, Prometheus metrics.

---

This exhaustive guide covers every aspect of Apache Kafka with Spring Boot, from basic concepts to deep internals and operations. It should serve as your definitive reference for building and managing Kafka‑based systems.
