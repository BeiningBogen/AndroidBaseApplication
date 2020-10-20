import org.gradle.kotlin.dsl.kotlin
import org.gradle.plugin.use.PluginDependenciesSpec
import org.gradle.plugin.use.PluginDependencySpec

fun PluginDependenciesSpec.androidApp(): PluginDependencySpec = id("com.android.application")

fun PluginDependenciesSpec.androidLibrary(): PluginDependencySpec = id("com.android.library")

fun PluginDependenciesSpec.android(): PluginDependencySpec = kotlin("android")

fun PluginDependenciesSpec.kapt(): PluginDependencySpec = kotlin("kapt")

fun PluginDependenciesSpec.kotlinKapt(): PluginDependencySpec = id("kotlin-kapt")

fun PluginDependenciesSpec.kotlinxSerializationDependecies(): PluginDependencySpec = kotlin("org.jetbrains.kotlin:kotlin-serialization:${Versions.kotlin}")

const val versions = "com.github.ben-manes.versions"

fun PluginDependenciesSpec.safeargs(): PluginDependencySpec = id("androidx.navigation.safeargs")

object Classpath {}
