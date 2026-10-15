# 12 — Resilience

Phase 2 — Distributed systems. Most of the code for this topic goes into the integrator project, [debt-collection-platform](https://github.com/victorbicego/debt-collection-platform). Keep notes and small isolated experiments here.

## Goal
Your services degrade gracefully instead of failing in cascade.

## Lessons
| Lesson | Subject | Code | Status |
|--------|---------|------|--------|
| 12.1 | | | ⬜ |

## Notes
Explanations in my own words. If I cannot write it down, I have not understood it yet.

## Exercises
- [ ] Build a service that calls a slow dependency and show how, without timeouts, it exhausts all threads.
- [ ] Add Resilience4j (timeout, retry, circuit breaker, bulkhead) and repeat the test.
- [ ] Show how retries without jitter cause a retry storm.
- [ ] Run a chaos experiment: kill a random service and document what happened.

## Interview questions
Questions I can already answer on this topic, with a short answer.

## References
-
