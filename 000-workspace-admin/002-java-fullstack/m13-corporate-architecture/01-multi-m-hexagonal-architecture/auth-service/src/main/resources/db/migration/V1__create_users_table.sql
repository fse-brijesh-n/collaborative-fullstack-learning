-- auth-service schema, version 1
-- Baseline table backing UserJpaEntity (adapter/out/persistence/UserJpaEntity.java).
-- Managed by Flyway: Hibernate's ddl-auto is set to "validate" (see application.yml) so
-- this migration is the single source of truth for the schema, not Hibernate auto-DDL.
-- See docs/11-database-migrations.md for the workflow to add a new migration.

CREATE TABLE users (
    id            BIGINT AUTO_INCREMENT PRIMARY KEY,
    username      VARCHAR(255) NOT NULL,
    password_hash VARCHAR(255) NOT NULL,
    role          VARCHAR(255) NOT NULL,
    CONSTRAINT uk_users_username UNIQUE (username)
);
