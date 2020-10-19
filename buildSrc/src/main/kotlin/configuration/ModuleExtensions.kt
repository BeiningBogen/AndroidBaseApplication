package configuration

import Constants
import com.android.build.gradle.BaseExtension
import com.android.build.gradle.internal.dsl.BaseAppModuleExtension
import org.gradle.api.JavaVersion

fun BaseAppModuleExtension.setAppConfig() {
    compileSdkVersion(Config.compileSdkVersion)
    buildToolsVersion(Config.buildTools)

    defaultConfig {
        dataBinding { isEnabled = true }

        minSdkVersion(Config.minSdk)
        targetSdkVersion(Config.targetSdkVersion)
        compileOptions {
            sourceCompatibility = JavaVersion.VERSION_1_8
            targetCompatibility = JavaVersion.VERSION_1_8
        }
        javaCompileOptions {
            annotationProcessorOptions.includeCompileClasspath = true
        }

        applicationId = Config.applicationId
        versionCode = Config.versionCode
        versionName = Config.versionName
        testInstrumentationRunner = Config.testInstrumentationRunner
    }
}

fun BaseExtension.setBuildTypeConfig() = buildTypes {
    named("debug") {
        isDebuggable = true

        applicationIdSuffix = ".debug"

        manifestPlaceholders["iconPath"] = "@mipmap/ic_launcher_dev"
        manifestPlaceholders["roundIconPath"] = "@mipmap/ic_launcher_dev_round"
    }

    create("staging") {
        signingConfig = signingConfigs.getByName("config_release")

        isDebuggable = true

        applicationIdSuffix = ".staging"

        manifestPlaceholders["iconPath"] = "@mipmap/ic_launcher_staging"
        manifestPlaceholders["roundIconPath"] = "@mipmap/ic_launcher_staging_round"
    }

    named("release") {
        signingConfig = signingConfigs.getByName("config_release")

        isDebuggable = false

        manifestPlaceholders["iconPath"] = "@mipmap/ic_launcher_default"
        manifestPlaceholders["roundIconPath"] = "@mipmap/ic_launcher_default_round"

        isMinifyEnabled = true
        isShrinkResources = true
        proguardFiles(getDefaultProguardFile("proguard-android.txt"), "proguard-rules.pro")
    }
}
