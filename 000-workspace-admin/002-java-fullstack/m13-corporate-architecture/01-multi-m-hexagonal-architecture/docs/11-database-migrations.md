# 11. Database Migrations (Flyway)

## Why Flyway instead of Hibernate auto-DDL

Early in this project, every service used
`spring.jpa.hibernate.ddl-auto: update`, letting Hibernate inspect your `@Entity` classes
and generate/alter tables automatically. That's fine for a solo prototype, but breaks down
the moment a **team** works on the same schema:

- No history of *what* changed and *when* — you can't tell from the database alone how it
  got to its current shape.
- No repeatable/reviewable artifact — schema changes aren't visible in a PR diff the way
  code changes are.
- Risky in place: `update` can silently do the wrong thing on column type changes, and
  `create`/`create-drop` destroy data outright.

Flyway fixes this: **every schema change is a plain, version-numbered `.sql` file, checked
into Git, applied automatically and in order at service startup, and tracked in a
`flyway_schema_history` table** so Flyway always knows exactly what's been applied.

## The two-part pattern used in every service

1. **`spring.jpa.hibernate.ddl-auto: validate`** (not `update`) — Hibernate now only
   **checks** that your `@Entity` mappings match the actual database schema at startup. If
   they disagree, the service **fails fast** with a clear error instead of silently
   papering over a mismatch. Hibernate never creates or alters tables anymore.
2. **`spring.flyway.enabled: true` + `spring.flyway.locations: classpath:db/migration`** —
   Flyway owns all schema creation/evolution, reading `.sql` files from
   `src/main/resources/db/migration/`.

Example (`auth-service/src/main/resources/application.yml`):

```yaml
spring:
  jpa:
    hibernate:
      ddl-auto: validate
  flyway:
    enabled: true
    locations: classpath:db/migration
```

## File naming convention

```
db/migration/
├── V1__create_users_table.sql
├── V2__add_index_on_users_role.sql
└── V3__<next change>.sql
```

- `V<version>__<description>.sql` — **two underscores** after the version number (Flyway's
  required syntax).
- Version numbers must be strictly increasing; Flyway applies them **in order**, tracking
  each one's checksum in `flyway_schema_history` so it can detect if an already-applied file
  was edited after the fact (and refuses to start if so — see
  [docs/09](09-troubleshooting.md)).
- Descriptions are free text but should be short and specific
  (`add_index_on_job_name`, not `update`).

## The golden rule: never edit an applied migration

Once a `Vn__*.sql` file has been merged to `main` (and especially once it's been applied to
any shared environment), **treat it as immutable**. If you need to change what it did:

- **Adding a column/table/index** → new file, e.g. `V3__add_tag_to_documents.sql`.
- **Fixing a mistake in an already-applied migration** → new file that corrects it (e.g.
  `V4__fix_job_name_column_length.sql` with an `ALTER TABLE ... MODIFY COLUMN ...`), never
  go back and edit `V1`/`V2`.
- **Local-only, not-yet-shared change during active development** → if you're the only one
  who has ever run that specific migration (e.g. you just wrote `V3` in your own branch and
  haven't pushed/merged yet), it's fine to edit it directly — the immutability rule is about
  protecting anyone else who might already have that version applied to their own database.

This is exactly the same discipline as "don't force-push a shared branch" — once something
is shared, only add on top of it.

## Existing baseline migrations (per service)

| Service | V1 | V2 |
|---|---|---|
| `auth-service` | `create_users_table` | `add_index_on_users_role` |
| `batch-processing-service` | `create_job_runs_table` | `add_index_on_job_name` |
| `document-service` | `create_documents_table` | `add_index_on_uploaded_at` |
| `logging-service` | `create_log_entries_table` | `add_index_on_source_service` |

Each `V1` file is deliberately written to **exactly match** its corresponding
`*JpaEntity.java` column mapping (types, nullability, unique constraints) — this is what
lets `ddl-auto: validate` pass cleanly. Each `V2` file demonstrates a safe, backward
compatible follow-up change (adding an index) that requires no entity changes at all —
the simplest possible example of "add a new Vn file" without touching application code.

## Adding your own migration (step-by-step)

Say you're adding a `tag` column to `document-service`'s `documents` table (see
[docs/08](08-adding-new-feature.md) for the full feature-add example this is drawn from):

1. Create `document-service/src/main/resources/db/migration/V3__add_tag_to_documents.sql`:
   ```sql
   ALTER TABLE documents ADD COLUMN tag VARCHAR(100) NULL;
   ```
2. Update `DocumentJpaEntity.java` to add the matching `private String tag;` field
   (+ getter/setter, or whatever your entity style uses).
3. Run `mvn -pl document-service -am clean install` (or the full `mvn clean install`).
   On startup, Flyway applies `V3` automatically, then Hibernate's `validate` mode confirms
   the entity now matches — if you forgot a field or got a type wrong, you'll see a clear
   `SchemaManagementException` at startup instead of a confusing runtime bug later.
4. Commit both files together in the same PR — a schema migration and the entity change it
   supports should never be split across separate commits/PRs.

## Rolling back

Flyway (the open-source/community edition used here, via `flyway-core`) does **not**
support automated "undo" migrations out of the box. The recommended approach for rollback
is the same "always add forward" philosophy: write a new migration that reverses the
change (e.g. `V4__drop_tag_from_documents.sql` with `ALTER TABLE documents DROP COLUMN tag;`)
rather than trying to "undo" `V3` in place. This keeps the history linear and matches how
most real teams operate Flyway in production.

## Inspecting the migration history at runtime

Since these are H2 in-memory databases, you can hit the H2 console (if enabled) or just
check the startup logs — Flyway logs every migration it applies:

```
Flyway Community Edition ... by Redgate
Successfully validated 2 migrations ...
Current version of schema "PUBLIC": 1
Migrating schema "PUBLIC" to version "2 - add index on users role"
Successfully applied 1 migration to schema "PUBLIC" ...
```

## Next

Continue to [12. Frontend](12-frontend.md) to see how the browser UI exercises the
endpoints backed by these migrated tables.
