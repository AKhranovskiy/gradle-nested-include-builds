Minimal working example of broken Gradle configuration with nested included builds.

`:intermediate` and `:nested` are Gradle plugins.

Project `:top` includes `:intermediate`.
`:intermediate` includes `:nested`.

`:top` applies both plugins fine.
`:intermediate` fails to apply `:nested`.
