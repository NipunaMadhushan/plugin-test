package com.example.plugins.filediff

import org.gradle.api.model.ObjectFactory
import org.gradle.api.provider.Property

import javax.inject.Inject

class FileDiffExtension {
    final Property<File> file1
    final Property<File> file2

    @Inject
    FileDiffExtension(ObjectFactory objectFactory) {
        file1 = objectFactory.property(File)
        file2 = objectFactory.property(File)
    }
}
