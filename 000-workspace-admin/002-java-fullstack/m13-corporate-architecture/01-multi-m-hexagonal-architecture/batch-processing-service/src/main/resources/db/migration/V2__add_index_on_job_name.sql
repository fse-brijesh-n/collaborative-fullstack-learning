-- batch-processing-service schema, version 2 (example follow-up migration)
-- Speeds up "list runs for job X" queries (BatchJobController's ?jobName= filter)
-- without touching JobRunJpaEntity. See docs/11-database-migrations.md.

CREATE INDEX idx_job_runs_job_name ON job_runs (job_name);
