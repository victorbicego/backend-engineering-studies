# 09 — Messaging and event-driven architecture

Phase 2 — Distributed systems. Most of the code for this topic goes into the integrator project, [debt-collection-platform](https://github.com/victorbicego/debt-collection-platform). Keep notes and small isolated experiments here.

## Goal
You can explain delivery guarantees and how to live with at-least-once.

## Lessons
| Lesson | Subject | Code | Status |
|--------|---------|------|--------|
| 9.1 | | | ⬜ |

## Notes
Explanations in my own words. If I cannot write it down, I have not understood it yet.

## Exercises
- [ ] Run Kafka with Docker and build a producer and consumer with Spring Kafka; kill the consumer mid-processing and observe.
- [ ] Implement the Outbox pattern: save to the database and publish the event reliably.
- [ ] Build an idempotent consumer using a processed-events table.
- [ ] Implement a three-step Saga (create order, reserve, charge) with compensation when a step fails.
- [ ] Configure retry with backoff and a dead letter topic.

## Interview questions
Questions I can already answer on this topic, with a short answer.

## References
-
