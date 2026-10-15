# 01 — Modern Java

Phase 1 — Senior engineering fundamentals. Code for this topic lives in this folder as a Maven module.

## Goal
You can explain why sealed classes make code safer than an open hierarchy.

## Lessons
| Lesson | Subject | Code | Status |
|--------|---------|------|--------|
| 1.x | Records as value objects | [`Money.java`](src/main/java/dev/backendstudies/modernjava/Money.java) | 🟨 |
| 1.x | Sealed types and pattern matching | [`DebtEvent.java`](src/main/java/dev/backendstudies/modernjava/DebtEvent.java) | 🟨 |

## Notes
Explanations in my own words. If I cannot write it down, I have not understood it yet.

## Exercises
- [ ] Model the states of a collection case (open, in negotiation, paid, cancelled) with sealed interfaces and records, handling every state with an exhaustive switch.
- [ ] Rewrite an old class from your own code using records and pattern matching and compare both versions.
- [ ] Write a custom collector that groups and sums values in a single pass.

## Interview questions
Questions I can already answer on this topic, with a short answer.

## References
-
