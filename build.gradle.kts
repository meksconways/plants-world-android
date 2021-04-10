// Top-level build file where you can add configuration options common to all sub-projects/modules.

buildscript {
    repositories.applyDefault()
    dependencies {
        classpath(GradlePlugins.Android)
        classpath(GradlePlugins.Kotlin)
        classpath(GradlePlugins.Hilt)
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