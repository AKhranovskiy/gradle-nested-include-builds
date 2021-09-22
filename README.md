Minimal working example of broken Android Studio sync of double included builds

There two projects `platform` and `product`.
Both are included in the root level as included build.
The product also includes the platform.

Android Studio fails to sync the project on Gradle 7.2 but works well on Gradle 7.1.

```
No model of type 'TurnOffDefaultTasks' is available in this build.
> No builders are available to build a model of type 'org.jetbrains.plugins.gradle.model.internal.TurnOffDefaultTasks'.
```

IntelliJ Gradle plugin 203.7717.56.2031.7678000
