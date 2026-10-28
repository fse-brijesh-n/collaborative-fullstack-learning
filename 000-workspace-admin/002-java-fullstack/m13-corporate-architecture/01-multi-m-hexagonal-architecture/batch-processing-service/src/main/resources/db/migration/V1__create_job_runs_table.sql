-- batch-processing-service schema, version 1
-- Baseline table backing JobRunJpaEntity (adapter/out/persistence/JobRunJpaEntity.java).
-- See docs/11-database-migrations.md for the workflow to add a new migration.

CREATE TABLE job_runs (
    id           BIGINT AUTO_INCREMENT PRIMARY KEY,
    job_name     VARCHAR(255) NOT NULL,
    status       VARCHAR(20)  NOT NULL,
    started_at   TIMESTAMP    NOT NULL,
    finished_at  TIMESTAMP,
    message      VARCHAR(1000)
);
