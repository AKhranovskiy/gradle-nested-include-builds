plugins {
    `java-gradle-plugin`
    `kotlin-dsl`
    id("org.jetbrains.kotlin.jvm") version "1.4.20"

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

gradlePlugin {
    plugins {
        create("Intermediate plugin") {
            id = "intermediate-gradle-plugin"
            implementationClass = "org.example.intermediate.IntermediatePlugin"
        }
    }
}

