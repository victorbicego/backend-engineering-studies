# Backend Engineering Studies

[![CI](https://github.com/victorbicego/backend-engineering-studies/actions/workflows/ci.yml/badge.svg)](https://github.com/victorbicego/backend-engineering-studies/actions/workflows/ci.yml)

My study notes and exercises for growing as a backend engineer (Java, Spring, distributed systems and architecture) towards senior, tech lead and architect roles.

One folder per topic, 32 topics in 6 phases. Topics with code are Maven modules with tests; the others hold notes and documents.
The complete system that puts everything together lives in a separate repository: **[debt-collection-platform](https://github.com/victorbicego/debt-collection-platform)**.

## Running
Requires Java 25. Maven is not needed: the wrapper downloads it.

```bash
./mvnw verify                       # build and test everything
./mvnw -pl 01-modern-java test      # a single module
```

## Adding code to a topic
1. Copy `01-modern-java/pom.xml` into the topic folder and change `artifactId` and `name`.
2. Add `<module>NN-topic-name</module>` to the root `pom.xml`.
3. Put code in `src/main/java/dev/backendstudies/<topic>/` and tests in `src/test/java/...`.
4. Update the status in the topic README and in the index below.

Commit messages follow [docs/commit-conventions.md](docs/commit-conventions.md).

## Index

Status: ⬜ not started · 🟨 in progress · ✅ done

### Phase 1 — Senior engineering fundamentals
| # | Topic | Type | Status |
|---|-------|------|--------|
| 01 | [Modern Java](01-modern-java) | code | 🟨 |
| 02 | [JVM internals and performance](02-jvm-internals-performance) | code | ⬜ |
| 03 | [Concurrency](03-concurrency) | code | ⬜ |
| 04 | [Code design and patterns](04-code-design-patterns) | code | ⬜ |
| 05 | [Testing and quality](05-testing-quality) | code | ⬜ |
| 06 | [Spring deep dive](06-spring-deep-dive) | code | ⬜ |
| 07 | [Relational databases in depth](07-relational-databases) | code in platform | ⬜ |

### Phase 2 — Distributed systems
| # | Topic | Type | Status |
|---|-------|------|--------|
| 08 | [API design and integration](08-api-design-integration) | code in platform | ⬜ |
| 09 | [Messaging and event-driven architecture](09-messaging-event-driven) | code in platform | ⬜ |
| 10 | [Distributed systems fundamentals](10-distributed-systems) | code | ⬜ |
| 11 | [Caching](11-caching) | code in platform | ⬜ |
| 12 | [Resilience](12-resilience) | code in platform | ⬜ |
| 13 | [Data at scale](13-data-at-scale) | code in platform | ⬜ |

### Phase 3 — Infrastructure and operations
| # | Topic | Type | Status |
|---|-------|------|--------|
| 14 | [Containers and Kubernetes](14-containers-kubernetes) | code in platform | ⬜ |
| 15 | [Cloud (AWS)](15-cloud-aws) | code in platform | ⬜ |
| 16 | [Infrastructure as code](16-infrastructure-as-code) | code in platform | ⬜ |
| 17 | [Observability](17-observability) | code in platform | ⬜ |
| 18 | [CI/CD and delivery strategies](18-ci-cd-delivery) | code in platform | ⬜ |
| 19 | [Security](19-security) | code in platform | ⬜ |

### Phase 4 — Architecture
| # | Topic | Type | Status |
|---|-------|------|--------|
| 20 | [Architecture styles and trade-offs](20-architecture-styles) | code | ⬜ |
| 21 | [Domain-Driven Design](21-domain-driven-design) | code | ⬜ |
| 22 | [Legacy modernisation](22-legacy-modernization) | code in platform | ⬜ |
| 23 | [System design](23-system-design) | notes | ⬜ |
| 24 | [Architecture decisions and documentation](24-architecture-decisions-docs) | code in platform | ⬜ |

### Phase 5 — Staff skills and the promotion (in parallel)
| # | Topic | Type | Status |
|---|-------|------|--------|
| 25 | [Technical leadership and influence](25-technical-leadership) | notes | ⬜ |
| 26 | [Technical writing](26-technical-writing) | notes | ⬜ |
| 27 | [Business and product thinking](27-business-product) | notes | ⬜ |
| 28 | [Getting the promotion (or the new role)](28-career-growth) | notes | ⬜ |

### Phase 6 — Deep dives and the job market
| # | Topic | Type | Status |
|---|-------|------|--------|
| 29 | [Algorithms and data structures](29-algorithms) | code | 🟨 |
| 30 | [AI for backend engineers](30-ai-for-backend) | code in platform | ⬜ |
| 31 | [Multi-tenancy](31-multi-tenancy) | code in platform | ⬜ |
| 32 | [Financial systems and payments](32-financial-systems) | code in platform | ⬜ |

## Rule
No code, data or internal names from any employer in this repository. Generic domain and fictitious data only.
