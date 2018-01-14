package com.brotherd.plugin

import org.gradle.api.Plugin
import org.gradle.api.Project

class ApkDistPlugin implements Plugin<Project> {

    @Override
    void apply(Project project) {
        project.extensions.create("apkdistconf", ApkDistExtension)
        project.task("apkdist") << {
            println 'hello world!'
            def closure = project["apkdistconf"].nameMap
            closure("wow!")
            println project["apkdistconf"].destDir
        }
    }
}