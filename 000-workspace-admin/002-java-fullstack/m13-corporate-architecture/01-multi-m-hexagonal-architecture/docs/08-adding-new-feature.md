# 8. Adding a New Feature to an Existing Service

Walkthrough for adding a new use case to an existing hexagonal service, using a concrete
example: **adding a "delete document" feature to `document-service`**. The same pattern
applies to any new endpoint/behavior in any of the four business services.

## 1. Start from the domain outward-in, or the port inward-out — pick one and be consistent

There are two equally valid starting points; this example works **outside-in** (port
first, then implementation, then adapters), which tends to keep you honest about the
use-case boundary before you get distracted by persistence/HTTP details.

## 2. Define (or extend) the inbound port

`domain/port/in/DeleteDocumentUseCase.java`:

```java
package com.example.documentservice.domain.port.in;

public interface DeleteDocumentUseCase {
    void deleteDocument(Long documentId);
}
```

If the operation naturally belongs on an existing port (e.g. adding a method to
`DocumentQueryUseCase`), extend that interface instead of creating a new one — use
judgement based on whether it's a genuinely distinct use case.

## 3. Extend the outbound port if you need a new persistence operation

`domain/port/out/DocumentRepositoryPort.java` — add:

```java
void deleteById(Long documentId);
```

## 4. Implement the use case in `application/service`

`application/service/DeleteDocumentService.java`:

```java
package com.example.documentservice.application.service;

import com.example.documentservice.domain.port.in.DeleteDocumentUseCase;
import com.example.documentservice.domain.port.out.DocumentRepositoryPort;
import org.springframework.stereotype.Service;

@Service
public class DeleteDocumentService implements DeleteDocumentUseCase {

    private final DocumentRepositoryPort documentRepositoryPort;

    public DeleteDocumentService(DocumentRepositoryPort documentRepositoryPort) {
        this.documentRepositoryPort = documentRepositoryPort;
    }

    @Override
    public void deleteDocument(Long documentId) {
        // Business rule lives here, e.g.: verify existence first, throw a
        // ResourceNotFoundException (from common-service) if not found, then delete.
        documentRepositoryPort.deleteById(documentId);
    }
}
```

No Spring Web, no JPA imports here — this class is pure orchestration and business rules,
testable without a Spring context.

## 5. Implement the outbound port's new method in the adapter

`adapter/out/persistence/DocumentRepositoryAdapter.java` — add:

```java
@Override
public void deleteById(Long documentId) {
    documentJpaRepository.deleteById(documentId);
}
```

## 6. Expose it via the inbound (web) adapter

`adapter/in/web/DocumentController.java` — add:

```java
@DeleteMapping("/{id}")
public ResponseEntity<ApiResponse<Void>> delete(@PathVariable Long id) {
    deleteDocumentUseCase.deleteDocument(id);
    return ResponseEntity.ok(ApiResponse.success("Document deleted", null));
}
```

The controller depends on the **`DeleteDocumentUseCase`** interface (constructor-injected),
never on `DeleteDocumentService` directly.

## 7. Schema changes? Add a new Flyway migration — never edit an old one

If this feature needs a new column/table (not needed for a simple delete, but for example
adding a "deleted_at" soft-delete column instead of a hard delete):

```
document-service/src/main/resources/db/migration/V3__add_deleted_at_to_documents.sql
```

```sql
ALTER TABLE documents ADD COLUMN deleted_at TIMESTAMP NULL;
```

Then update `DocumentJpaEntity` with the matching field, and remember `ddl-auto: validate`
means Hibernate will fail fast at startup if the entity and the migrated schema disagree —
that's the point (see [docs/11](11-database-migrations.md)).

## 8. Write tests

- **Unit test** (`application/service/DeleteDocumentServiceTest.java`) — Mockito mock of
  `DocumentRepositoryPort`, assert `deleteById` is called with the right ID, and assert any
  business-rule exceptions (e.g. not-found) are thrown correctly. No Spring context, fast.
- **Integration test** — add a test method to the existing
  `DocumentServiceApplicationTests.java` using MockMvc: upload a document, then call
  `DELETE /api/documents/{id}`, then assert a subsequent `GET` returns 404.

## 9. Update the frontend (if user-facing)

Add a "Delete" button next to each document row in the Documents tab of
`frontend/index.html`, and a `deleteDocument(id)` function in `frontend/app.js` that calls
`DELETE /documents/api/documents/{id}` through the gateway with the stored JWT — see
[docs/12](12-frontend.md) for the existing fetch-wrapper pattern to reuse.

## 10. Run the full build and open a PR

```powershell
mvn clean install
```

Then follow [docs/06](06-git-workflow.md): feature branch → PR → CI (`mvn -B clean install`
runs automatically) → review → merge → pipeline deploys.

## Checklist recap

- [ ] Port(s) defined/extended in `domain/port/{in,out}`
- [ ] Business logic implemented in `application/service`, no framework imports
- [ ] Adapter(s) updated in `adapter/{in/web, out/persistence}`
- [ ] New Flyway migration added if schema changed (never edited an old one)
- [ ] Unit test for the new service class
- [ ] Integration test exercising the new endpoint end-to-end
- [ ] Frontend updated if the feature is user-facing
- [ ] `mvn clean install` green locally before pushing

## Next

If something doesn't build or a test fails unexpectedly, check
[9. Troubleshooting](09-troubleshooting.md) — it documents the real bugs hit while
building this project and how they were fixed.
