package org.example.intermediate

import org.gradle.api.Plugin
import org.gradle.api.Project

class IntermediatePlugin : Plugin<Project> {
    override fun apply(project: Project) {
        println("Hello ${project.name} from intermediate plugin!")
    }
}

