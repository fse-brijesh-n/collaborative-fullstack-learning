-- auth-service schema, version 2 (example follow-up migration)
-- Demonstrates the "team adds a migration" workflow described in
-- docs/11-database-migrations.md: never edit V1, always add a new Vn file.
-- Speeds up role-based lookups without touching UserJpaEntity.

CREATE INDEX idx_users_role ON users (role);
