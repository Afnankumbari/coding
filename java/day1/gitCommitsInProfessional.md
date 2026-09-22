# Git Commit Convention

I follow the **Conventional Commits** format for maintaining a clean and meaningful Git history.

## Commit Types

| Type | Use When | Example |
|---|---|---|
| `feat` | Add a new feature/functionality | `feat: add largest element solution` |
| `fix` | Fix a bug/error | `fix: correct largest element logic` |
| `refactor` | Improve code without changing behavior | `refactor: simplify array traversal` |
| `docs` | Documentation changes | `docs: add arrays revision notes` |
| `test` | Add/change tests | `test: add test cases for largest element` |
| `chore` | Maintenance/configuration | `chore: configure Java build task` |
| `style` | Formatting only | `style: format array solutions` |
| `perf` | Performance improvement | `perf: optimize largest element search` |
| `build` | Build/dependency changes | `build: update Java configuration` |
| `ci` | CI/CD changes | `ci: add GitHub Actions workflow` |

## Examples Used in This Repository

### Initial Repository Setup

```bash
git commit -m "chore: initialize Striver A2Z repository"
```

Used when the repository was initially configured with Git.

### Adding Array Solutions

```bash
git commit -m "feat: add basic array solutions"
```

Used when adding new Java solutions for basic array problems.

### Fixing a Solution

```bash
git commit -m "fix: correct largest element logic"
```

Used when correcting an error in an existing solution.

### Configuring Java Build Task

```bash
git commit -m "chore: configure Java build task"
```

Used for VS Code / Java task configuration changes.

### Adding Documentation

```bash
git commit -m "docs: add arrays revision notes"
```

Used when adding notes or documentation without changing the actual code.

### Refactoring Code

```bash
git commit -m "refactor: simplify array traversal"
```

Used when improving the code structure without changing its behavior.

## Commit Format

```text
<type>: <short description>
```

Example:

```text
feat: add largest element solution
```

## Quick Reference

- `feat` → New functionality
- `fix` → Bug fix
- `refactor` → Code improvement
- `docs` → Documentation
- `test` → Tests
- `chore` → Maintenance/configuration
- `style` → Formatting
- `perf` → Performance
- `build` → Build/dependencies
- `ci` → CI/CD

## Commonly Used in This Repository

For the **Striver A2Z Java repository**, the commonly used commit types are:

- `feat` — Adding new DSA solutions
- `fix` — Correcting solutions
- `refactor` — Improving existing code
- `docs` — Adding notes/documentation
- `chore` — Repository or configuration changes