# 31 — Multi-tenancy

Phase 6 — Deep dives and the job market. Most of the code for this topic goes into the integrator project, [debt-collection-platform](https://github.com/victorbicego/debt-collection-platform). Keep notes and small isolated experiments here.

## Goal
You can compare isolation models and their cost and risk.

## Lessons
| Lesson | Subject | Code | Status |
|--------|---------|------|--------|
| 31.1 | | | ⬜ |

## Notes
Explanations in my own words. If I cannot write it down, I have not understood it yet.

## Exercises
- [ ] Implement tenant isolation with a shared schema and a `tenant_id` column, enforced by PostgreSQL row-level security.
- [ ] Propagate the tenant context through HTTP, async jobs and Kafka messages.
- [ ] Write a test proving one tenant can never read another tenant's data.
- [ ] Simulate a noisy neighbour and add per-tenant rate limits.

## Interview questions
Questions I can already answer on this topic, with a short answer.

## References
-
