import configuration.setAppConfig
import configuration.setBuildTypeConfig

plugins {
    androidApp()
    // id("com.ebb.androidbaseapplication")
    android()
    kotlinKapt()
    id("kotlin-android")
}

apply(plugin = "androidx.navigation.safeargs.kotlin")

android {
    setAppConfig()
    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_1_8.toString()
    }
    setDefaultSigningConfigs(project)

    setBuildTypeConfig()
    setProperty("archivesBaseName", "${configuration.Config.applicationId}-v${configuration.Config.versionName}(${configuration.Config.versionCode}).apk")

    sourceSets {
        getByName("androidTest").java.srcDirs("src/androidTest/kotlin")
        getByName("debug").java.srcDirs("src/debug/kotlin")
        getByName("staging").java.srcDirs("src/staging/kotlin")
        getByName("main").java.srcDirs("src/main/kotlin")
        getByName("test").java.srcDirs("src/test/kotlin")
    }
}

dependencies {
    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))
    implementation(project(":networking"))

    implementation("org.jetbrains.kotlin:kotlin-stdlib:1.4.10")
    implementation("androidx.core:core-ktx:1.3.2")

    // KOTLIN
    implementation(Libraries.Kotlin.stdLib)
    implementation(Libraries.Kotlin.anko)
    implementation(Libraries.Kotlin.coroutines)

    // GOOGLE
    implementation(Libraries.Google.material)

    // DAGGER2
    implementation(Libraries.Dagger2.dagger2)
    implementation(Libraries.Dagger2.dagger2Android)
    implementation(Libraries.Dagger2.dagger2AndroidSupport)
    kapt(Libraries.Dagger2.dagger2AnnotationProcessor)
    kapt(Libraries.Dagger2.dagger2AndroidAnnotationProcessor)

    // ANDROIDX
    implementation(Libraries.AndroidX.appCompat)
    implementation(Libraries.AndroidX.fragmentAndroidX)
    implementation(Libraries.AndroidX.recyclerView)
    implementation(Libraries.AndroidX.legacySupport)
    implementation(Libraries.AndroidX.constraintLayout)
    implementation(Libraries.AndroidX.ktxCore)
    implementation(Libraries.AndroidX.lifeCycleExtensions)
    implementation(Libraries.AndroidX.viewmodel)
    implementation(Libraries.AndroidX.preferences)
    implementation(Libraries.AndroidX.multidex)
    implementation(Libraries.AndroidX.navigationFragmentKtx)
    implementation(Libraries.AndroidX.navigationUiKtx)

    // TESTING
    testImplementation(Libraries.AndroidX.Test.archCoreTesting)
    testImplementation(Libraries.AndroidX.Test.coreTesting)
    testImplementation(Libraries.AndroidX.Test.junit)
    testImplementation(Libraries.Kotlin.coroutines_test)
    testImplementation(Libraries.Test.junit)
    testImplementation(Libraries.Test.mockitoCore)
    testImplementation(Libraries.Test.mockitoInline)
    testImplementation(Libraries.Test.mockitokotlin)
    testImplementation(kotlin("test"))
    testImplementation(kotlin("test-annotations-common"))

    androidTestImplementation(Libraries.AndroidX.Test.runner)
    androidTestImplementation(Libraries.AndroidX.Test.espresso)

    // Lifecycle
    implementation(Libraries.LifeCycle.lifeCyclecompiler)
    implementation(Libraries.LifeCycle.java8)
    implementation(Libraries.LifeCycle.livedataKtx)
    implementation(Libraries.LifeCycle.runtime)
    implementation(Libraries.LifeCycle.viewmodelKtx)

    // OTHER
    api(Libraries.Other.timber)

}
