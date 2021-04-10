// Top-level build file where you can add configuration options common to all sub-projects/modules.

buildscript {
    repositories.applyDefault()
    dependencies {
        classpath(GradlePlugins.Android)
        classpath(GradlePlugins.Kotlin)
    }
}

allprojects {
    repositories.applyDefault()
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}