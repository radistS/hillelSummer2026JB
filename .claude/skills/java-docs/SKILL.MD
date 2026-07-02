cat > .claude/skills/pr-message/SKILL.md << 'EOF'
---
description: Generates a GitHub pull request title and description from staged/committed changes. Use when the user asks to create a PR, write a PR description, or prepare a pull request message.
---

## Gather context

!`git log origin/main..HEAD --oneline`
!`git diff origin/main...HEAD`

## Instructions

1. Read the commits and diff above.
2. Write a PR title (imperative mood, under 70 chars).
3. Write a description with these sections:
    - **What changed** (2-4 bullet points)
    - **Why** (the motivation/ticket if mentioned in commits)
    - **How to test**
4. If the diff touches multiple unrelated concerns, flag that the PR might be worth splitting.
5. Output the result as markdown ready to paste into GitHub, or offer to run:
   `gh pr create --title "..." --body "..."`
   (only run `gh pr create` if the user confirms — this creates something remotely).
   EOF