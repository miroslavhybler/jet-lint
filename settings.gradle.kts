@file:Suppress("UnstableApiUsage", "DEPRECATION")

include(":jet-lint")


pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "jet-lint"
include(":example-app")
include(":jet-annotations")
