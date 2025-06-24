// Top-level build file where you can add configuration options common to all sub-projects/modules.

buildscript {
    dependencies {
        classpath("com.android.tools.build:gradle:8.1.0") // ajuste para sua versão do Gradle Android plugin
        classpath("com.google.gms:google-services:4.4.2") // versão do plugin google-services
    }
}

plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.kotlin.android) apply false
}
