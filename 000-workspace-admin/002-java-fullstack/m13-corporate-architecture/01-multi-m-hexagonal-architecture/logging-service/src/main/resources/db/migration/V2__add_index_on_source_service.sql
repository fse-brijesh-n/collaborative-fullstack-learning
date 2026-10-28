-- logging-service schema, version 2 (example follow-up migration)
-- Speeds up the /api/logs?sourceService= filter (LogController.getLogs) without
-- touching LogEntryJpaEntity. See docs/11-database-migrations.md.

CREATE INDEX idx_log_entries_source_service ON log_entries (source_service);
