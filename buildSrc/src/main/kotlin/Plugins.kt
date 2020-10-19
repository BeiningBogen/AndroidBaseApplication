import org.gradle.kotlin.dsl.kotlin
import org.gradle.plugin.use.PluginDependenciesSpec
import org.gradle.plugin.use.PluginDependencySpec

fun PluginDependenciesSpec.androidApp(): PluginDependencySpec = id("com.android.application")

fun PluginDependenciesSpec.androidLibrary(): PluginDependencySpec = id("com.android.library")

fun PluginDependenciesSpec.android(): PluginDependencySpec = kotlin("android")

fun PluginDependenciesSpec.kapt(): PluginDependencySpec = kotlin("kapt")

fun PluginDependenciesSpec.kotlinKapt(): PluginDependencySpec = id("kotlin-kapt")

fun PluginDependenciesSpec.googleServices(): PluginDependencySpec = id("com.google.gms.google-services")

const val versions = "com.github.ben-manes.versions"

fun PluginDependenciesSpec.safeargs(): PluginDependencySpec = id("androidx.navigation.safeargs")

object Classpath {
    const val kotlinGradle = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"
    const val navigationSafeArgs = "android.arch.navigation:navigation-safe-args-gradle-plugin:1.0.0"
    const val gms = "com.google.gms:google-services:4.3.4"
}
