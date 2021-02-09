plugins {
    `kotlin-dsl`
    id("org.jetbrains.kotlin.jvm") version "1.4.20"

    id("intermediate-gradle-plugin") apply true
    id("nested-gradle-plugin") apply true
}

repositories {
    mavenLocal()
    mavenCentral()
    jcenter()
}

dependencies {
    implementation(platform("org.jetbrains.kotlin:kotlin-bom"))
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
}
