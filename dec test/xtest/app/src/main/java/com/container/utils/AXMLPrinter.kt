// File: app/src/main/java/com/container/utils/AXMLPrinter.kt
package com.container.utils

import java.io.File
import java.io.FileInputStream
import java.io.FileOutputStream
import java.io.IOException
import java.util.Properties

class AXMLPrinter private constructor() {

    companion object {
        private const val VERSION_PROPERTIES = "axmlprinter.properties"
        private var version: String = "(unknown version)"

        init {
            loadVersionInfo()
        }

        private fun loadVersionInfo() {
            AXMLPrinter::class.java.classLoader?.getResourceAsStream(VERSION_PROPERTIES)?.use { stream ->
                Properties().apply {
                    load(stream)
                    version = getProperty("application.version", version)
                }
            } ?: run {
                println("Unable to find version properties!")
            }
        }

        fun printVersion() {
            println("axmlprinter $version (http://github.com/rednaga/axmlprinter2)")
            println("Copyright (C) 2015-2025 Red Naga - Tim 'diff' Strazzere (diff@protonmail.com)")
        }

        fun parseManifest(axmlFile: File): PackageInfo {
            require(axmlFile.exists()) { "Binary XML file not found: ${axmlFile.absolutePath}" }

            return try {
                FileInputStream(axmlFile).use { input ->
                    AXMLResource().apply {
                        read(input)
                        print() // Optional: Print to console for debugging
                    }.toPackageInfo()
                }
            } catch (e: Exception) {
                throw IOException("Failed to parse AXML file", e)
            }
        }

        fun writeManifest(axmlFile: File, outputFile: File) {
            require(axmlFile.exists()) { "Binary XML file not found: ${axmlFile.absolutePath}" }

            try {
                FileInputStream(axmlFile).use { input ->
                    FileOutputStream(outputFile).use { output ->
                        AXMLResource().apply {
                            read(input)
                            write(output)
                        }
                    }
                }
            } catch (e: Exception) {
                throw IOException("Failed to write AXML file", e)
            }
        }
    }
}