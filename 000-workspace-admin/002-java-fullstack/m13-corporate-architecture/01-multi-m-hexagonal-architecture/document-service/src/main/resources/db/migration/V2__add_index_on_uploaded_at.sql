-- document-service schema, version 2 (example follow-up migration)
-- Speeds up listing documents by most-recently-uploaded first without touching
-- DocumentJpaEntity. See docs/11-database-migrations.md.

CREATE INDEX idx_documents_uploaded_at ON documents (uploaded_at);
