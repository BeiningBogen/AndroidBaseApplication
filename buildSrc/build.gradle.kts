plugins {
    `kotlin-dsl`
}

gradlePlugin {
    plugins {
        register("core-module-plugin") {
            id = "core-module-plugin"
            implementationClass = "moduleplugins.CorePlugin"
        }
        register("feature-home-module-plugin") {
            id = "feature-home-module-plugin"
            implementationClass = "moduleplugins.FeatureHomeModulePlugin"
        }

        register("feature-0-module-plugin") {
            id = "feature-0-module-plugin"
            implementationClass = "moduleplugins.Feature0ModulePlugin"
        }
    }
}

repositories {
    mavenCentral()
    google()
    jcenter()
}

// TODO Clean up
dependencies {
    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))
    compileOnly(gradleApi())

    implementation(kotlin("gradle-plugin", "1.4.0"))
    implementation("com.android.tools.build:gradle:4.1.0")
    implementation("androidx.navigation:navigation-safe-args-gradle-plugin:2.3.1") }
