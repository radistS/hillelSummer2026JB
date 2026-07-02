cat > .claude/skills/java-docs/SKILL.md << 'EOF'
---
description: Adds or updates Javadoc comments on Java classes, methods, and fields. Use when the user asks to document Java code, generate Javadoc, or add JavaDoc comments.
---

## Instructions

1. For each public/protected class, method, or field missing Javadoc, add a comment block including:
    - A one-line summary
    - `@param` for each parameter (name + purpose)
    - `@return` if non-void
    - `@throws` for checked exceptions
2. Follow existing project conventions if a class already has Javadoc examples — match tone and format.
3. Don't invent behavior — base descriptions only on what the code actually does.
4. Skip private members unless explicitly asked.
5. After editing, run `javadoc` (or the project's existing doc-gen command, e.g. Maven `mvn javadoc:javadoc` / Gradle `./gradlew javadoc`) if available, to confirm it builds without errors.
   EOF