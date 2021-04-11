// Top-level build file where you can add configuration options common to all sub-projects/modules.

buildscript {
    val kotlin_version by extra("1.4.32")
    repositories.applyDefault()
    dependencies {
        classpath(GradlePlugins.Android)
        classpath(GradlePlugins.Kotlin)
        classpath(GradlePlugins.Hilt)
        classpath(GradlePlugins.NavigationComponent)
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlin_version")
    }
}

plugins {
    id("de.fayard.buildSrcVersions") version "0.7.0"
}


allprojects {
    repositories.applyDefault()
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}