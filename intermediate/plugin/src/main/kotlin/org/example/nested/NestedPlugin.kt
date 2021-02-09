package org.example.nested

import org.gradle.api.Plugin
import org.gradle.api.Project

class NestedPlugin: Plugin<Project> {
  override fun apply(project: Project) {
    println("Hello ${project.name} from nested plugin!")
  }
}

