# Git & Version Control Interview Q&A

## Overview
Git and Version Control cover repository management, branching strategies, collaboration workflows, merge strategies, and best practices for team development.

---

## Interview Questions & Answers

1. **What is Version Control?**
   - System tracking code changes, enabling collaboration and history management.

2. **What is Git?**
   - Distributed version control system enabling fast, efficient collaboration.

3. **What is Repository?**
   - Storage containing all project files and version history.

4. **What is Commit?**
   - Snapshot of project at specific point in time.

5. **What is Hash?**
   - Unique identifier for commit (SHA-1).

6. **What is Branch?**
   - Separate line of development from main codebase.

7. **What is Master/Main Branch?**
   - Primary branch containing production-ready code.

8. **What is HEAD?**
   - Reference to current commit or branch.

9. **What is Working Directory?**
   - Local files on disk being edited.

10. **What is Staging Area?**
    - Temporary area preparing changes for commit.

11. **What is git add?**
    - Moving files from working directory to staging area.

12. **What is git commit?**
    - Saving staged changes as new commit.

13. **What is git push?**
    - Uploading commits to remote repository.

14. **What is git pull?**
    - Fetching and merging from remote repository.

15. **What is git fetch?**
    - Downloading changes without merging.

16. **What is git merge?**
    - Integrating changes from one branch to another.

17. **What is Merge Conflict?**
    - Conflicting changes in same lines of code.

18. **What is Fast-Forward Merge?**
    - Merge where target branch hasn't diverged.

19. **What is Three-Way Merge?**
    - Merge combining two commits and common ancestor.

20. **What is git rebase?**
    - Re-applying commits on different base branch.

21. **What is Interactive Rebase?**
    - Rebase allowing editing commits.

22. **What is Squashing?**
    - Combining multiple commits into one.

23. **What is Cherry-Pick?**
    - Applying specific commit to current branch.

24. **What is git revert?**
    - Creating new commit undoing specific commit.

25. **What is git reset?**
    - Moving HEAD to different commit.

26. **What is Soft Reset?**
    - Reset keeping changes in staging area.

27. **What is Hard Reset?**
    - Reset discarding all changes.

28. **What is git stash?**
    - Saving changes temporarily without committing.

29. **What is git tag?**
    - Marking specific commit as important (version).

30. **What is Annotated Tag?**
    - Tag with metadata like message and signing.

31. **What is Lightweight Tag?**
    - Simple reference to specific commit.

32. **What is git blame?**
    - Showing who made changes to each line.

33. **What is git log?**
    - Displaying commit history.

34. **What is git diff?**
    - Showing differences between commits/branches.

35. **What is git status?**
    - Showing current repository state.

36. **What is Remote Repository?**
    - Version control repository on server.

37. **What is Origin?**
    - Default name for remote repository.

38. **What is Upstream?**
    - Original repository in fork workflow.

39. **What is Fork?**
    - Creating personal copy of repository.

40. **What is Pull Request?**
    - Proposing changes for review and merging.

41. **What is Merge Request?**
    - GitLab term for pull request.

42. **What is Code Review?**
    - Examining code changes before merging.

43. **What is Git Flow?**
    - Branching model with develop, release, hotfix branches.

44. **What is GitHub Flow?**
    - Simpler flow with feature branches and pull requests.

45. **What is Trunk-Based Development?**
    - All developers commit to single main branch.

46. **What is Feature Branch?**
    - Branch for developing single feature.

47. **What is Hotfix Branch?**
    - Branch for emergency production fixes.

48. **What is Release Branch?**
    - Branch for preparing version release.

49. **What is Develop Branch?**
    - Integration branch for features.

50. **What is Commit Message?**
    - Description of changes made in commit.

51. **What is Conventional Commits?**
    - Standard format for commit messages.

52. **What is Squash and Merge?**
    - Merging combining all commits into single commit.

53. **What is Rebase and Merge?**
    - Merging rebasing branch then fast-forward merge.

54. **What is Merge Commit?**
    - Explicit commit recording merge.

55. **What is GitHub?**
    - Web platform for Git repositories and collaboration.

56. **What is GitLab?**
    - Open-source Git platform with CI/CD.

57. **What is Gitea?**
    - Lightweight self-hosted Git service.

58. **What is Bitbucket?**
    - Atlassian's Git repository hosting.

59. **What is .gitignore?**
    - File specifying files Git should ignore.

60. **What is git hooks?**
    - Scripts running automatically on Git events.

---

## Git Flow Example

```
main (production)
  ├─ release/1.0 (release preparation)
  └─ hotfix/urgent-fix (production fixes)

develop (integration)
  └─ feature/user-auth (feature development)
```

---

## Commit Message Convention

```
type(scope): subject

body (optional)

footer (optional)

Types: feat, fix, docs, style, refactor, perf, test, chore
```

---

## Best Practices

1. Commit frequently with clear messages
2. Pull before pushing
3. Create feature branches
4. Keep branches small and focused
5. Review before merging
6. Squash when appropriate
7. Use meaningful branch names
8. Tag releases
9. Document branching strategy
10. Clean up merged branches

---

## Common Mistakes

1. Committing to master directly
2. Large commits mixing features
3. Poor commit messages
4. Not pulling before pushing
5. Merge conflicts mishandled
6. Forgotten uncommitted changes
7. Rewriting public history
8. Large binaries in repository
9. Sensitive data committed
10. Not using .gitignore

---

## Branching Strategy Comparison

| Strategy | Best For | Complexity |
|----------|----------|-----------|
| **GitHub Flow** | Continuous deployment | Low |
| **Git Flow** | Scheduled releases | High |
| **Trunk-Based** | Rapid development | Medium |

---

## Summary

Master Git commands: add, commit, push, pull, merge, rebase. Understand branching strategies (Git Flow, GitHub Flow). Know merge conflict resolution, rebasing, and cherry-picking. Follow commit message conventions and code review practices for collaborative development.

---

## References

- [Git Official Documentation](https://git-scm.com/doc)
- [GitHub Guides](https://guides.github.com/)
- [Git Flow Cheatsheet](https://danielkummer.github.io/git-flow-cheatsheet/)
- [Conventional Commits](https://www.conventionalcommits.org/)
