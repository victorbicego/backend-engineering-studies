# 03 — Concurrency

Phase 1 — Senior engineering fundamentals. Code for this topic lives in this folder as a Maven module.

## Goal
You can explain happens-before and choose the right concurrency tool.

## Lessons
| Lesson | Subject | Code | Status |
|--------|---------|------|--------|
| 3.1 | | | ⬜ |

## Notes
Explanations in my own words. If I cannot write it down, I have not understood it yet.

## Exercises
- [ ] Implement a thread-safe rate limiter and test it with hundreds of threads.
- [ ] Reproduce a race condition, then fix it in three ways: `synchronized`, `AtomicLong` and `Lock`.
- [ ] Call 3 APIs in parallel with `CompletableFuture`, then with virtual threads + structured concurrency; compare readability and error handling.
- [ ] Cause a deadlock and diagnose it with a thread dump (`jstack`).

## Interview questions
Questions I can already answer on this topic, with a short answer.

## References
-
