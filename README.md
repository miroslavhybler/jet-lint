# Jet-lint
Jet-Lint contains annotations for Jet libraries with SourceCodeScanner for detecting and showing lints.

### Suppressing
If you are fully aware, you can supress all warnings by adding these lines into your app/library build.gradle.kts.

```kotlin
    kotlinOptions {
        jvmTarget = "1.8"
        freeCompilerArgs += listOf(
            "-Xopt-in=mir.oslav.jet.annotations.JetExperimental",
            "-Xopt-in=mir.oslav.jet.annotations.JetBenchmark",
            )
    }
```

### Add library to your project

**Project's settings.gradle.kts**
```kotlin
// Adds maven 
dependencyResolutionManagement {
    repositories {
        maven(url = "https://jitpack.io")
    }
}
```

**Application's module build.gradle.kts**
```kotlin
dependencies {
    implementation("com.github.miroslavhybler:jet-lint:1.0.2")
}
```