# Commit conventions

Short, imperative messages using [Conventional Commits](https://www.conventionalcommits.org):

```
<type>(<scope>): <what changed>
```

| Type | When |
|------|------|
| `feat` | New exercise, solution or example |
| `test` | Tests only |
| `refactor` | Better code, same behaviour |
| `docs` | Notes, READMEs |
| `build` | pom.xml, wrapper, CI |
| `chore` | Anything else |

The scope is the module number or name.

```
feat(01): model collection case states with sealed interfaces
test(29): add edge cases for two-sum
docs(03): notes on happens-before
```

Commit small and often. One exercise per commit is a good default.
