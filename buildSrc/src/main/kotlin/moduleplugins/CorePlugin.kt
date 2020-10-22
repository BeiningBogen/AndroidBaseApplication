package moduleplugins

import com.android.build.gradle.BaseExtension
import org.gradle.api.JavaVersion
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile
import com.android.build.gradle.AppExtension
import com.android.build.gradle.LibraryExtension

class CorePlugin  : Plugin<Project> {
    override fun apply(project: Project) {
        // Apply plugin common to all projects
        project.plugins.apply("kotlin-android")
        project.plugins.apply("kotlin-android-extensions")
        project.plugins.apply("androidx.navigation.safeargs.kotlin")

        val androidExtensions = project.extensions.getByName("android")
        if (androidExtensions is BaseExtension) {
            androidExtensions.apply {
                compileSdkVersion(29)
                buildToolsVersion("29.0.3")

                compileOptions {
                    sourceCompatibility = JavaVersion.VERSION_1_8
                    targetCompatibility = JavaVersion.VERSION_1_8
                }

                project.tasks.withType(KotlinCompile::class.java).configureEach {
                    kotlinOptions {
                        jvmTarget = JavaVersion.VERSION_1_8.toString()
                    }
                }

                testOptions {
                    unitTests.isReturnDefaultValues = true
                }

                defaultConfig {
                    minSdkVersion(21)
                    targetSdkVersion(29)
                    versionCode = 1
                    versionName = "1.0"

                    testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
                }

                viewBinding.isEnabled = true

                when(this) {
                    is LibraryExtension -> {
                        defaultConfig {
                            // Apply the pro guard rules for library
                            consumerProguardFiles("consumer-rules.pro")
                        }
                    }

                    is AppExtension -> {
                        buildTypes {
                            getByName("release") {
                                isMinifyEnabled = false
                                proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
                            }
                        }
                    }
                }
            }
        }
    }



}
