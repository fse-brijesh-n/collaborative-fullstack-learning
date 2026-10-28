-- document-service schema, version 1
-- Baseline table backing DocumentJpaEntity (adapter/out/persistence/DocumentJpaEntity.java).
-- content is stored as a BLOB (mapped from the entity's @Lob byte[] field).
-- See docs/11-database-migrations.md for the workflow to add a new migration.

CREATE TABLE documents (
    id           BIGINT AUTO_INCREMENT PRIMARY KEY,
    file_name    VARCHAR(255) NOT NULL,
    content_type VARCHAR(255),
    size         BIGINT NOT NULL,
    content      BLOB,
    uploaded_at  TIMESTAMP NOT NULL
);
