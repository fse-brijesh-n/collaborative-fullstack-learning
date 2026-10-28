-- logging-service schema, version 1
-- Baseline table backing LogEntryJpaEntity (adapter/out/persistence/LogEntryJpaEntity.java).
-- See docs/11-database-migrations.md for the workflow to add a new migration.

CREATE TABLE log_entries (
    id             BIGINT AUTO_INCREMENT PRIMARY KEY,
    source_service VARCHAR(255) NOT NULL,
    level          VARCHAR(20)  NOT NULL,
    message        VARCHAR(2000) NOT NULL,
    timestamp      TIMESTAMP NOT NULL
);
