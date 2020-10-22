import org.gradle.api.Project
import org.gradle.kotlin.dsl.dependencies
import org.gradle.kotlin.dsl.kotlin

// Does the name "ProjectExtensions.kt" make sense?
fun Project.kotlinDependecies() {
    dependencies {
        add("implementation", Libraries.Kotlin.stdLib)
        add("implementation", Libraries.Kotlin.kotlinCore)
        add("implementation", Libraries.Kotlin.anko)
        add("implementation", Libraries.Kotlin.coroutines)
    }
}

fun Project.gradleTools() {
    dependencies {
        add("implementation", Libraries.Gradle.buildTools)
    }
}

fun Project.androidXDependecies() {
    dependencies {
        add("implementation", Libraries.AndroidX.appCompat)
        add("implementation", Libraries.AndroidX.fragmentAndroidX)
        add("implementation", Libraries.AndroidX.recyclerView)
        add("implementation", Libraries.AndroidX.legacySupport)
        add("implementation", Libraries.AndroidX.constraintLayout)
        add("implementation", Libraries.AndroidX.ktxCore)
        add("implementation", Libraries.AndroidX.lifeCycleExtensions)
        add("implementation", Libraries.AndroidX.viewmodel)
        add("implementation", Libraries.AndroidX.preferences)
        add("implementation", Libraries.AndroidX.multidex)

        add("androidTestImplementation", Libraries.AndroidX.Test.runner)
        add("androidTestImplementation", Libraries.AndroidX.Test.espresso)
    }
}

fun Project.navigationComponent() {
    dependencies {
        add("implementation", Libraries.AndroidX.navigationFragment)
        add("implementation", Libraries.AndroidX.navigationUi)
        add("implementation", Libraries.AndroidX.navigationFragmentKtx)
        add("implementation", Libraries.AndroidX.navigationUiKtx)
        // add("implementation", Libraries.AndroidX.navigationSafeArgs)
    }
}

fun Project.testDependecies() {
    dependencies {
        add("testImplementation", Libraries.AndroidX.Test.archCoreTesting)
        add("testImplementation", Libraries.AndroidX.Test.coreTesting)
        add("testImplementation", Libraries.AndroidX.Test.junit)
        add("testImplementation", Libraries.Kotlin.coroutines_test)
        add("testImplementation", Libraries.Test.junit)
        add("testImplementation", Libraries.Test.mockitoCore)
        add("testImplementation", Libraries.Test.mockitoInline)
        add("testImplementation", Libraries.Test.mockitokotlin)
        add("testImplementation", kotlin("test"))
        add("testImplementation", kotlin("test-annotations-common"))

    }
}

fun Project.dagger2Dependecies() {
    dependencies {
        add("implementation", Libraries.Dagger2.dagger2)
        add("implementation", Libraries.Dagger2.dagger2Android)
        add("implementation", Libraries.Dagger2.dagger2AndroidSupport)
        add("kapt", Libraries.Dagger2.dagger2Compiler)
        add("kapt", Libraries.Dagger2.dagger2AndroidAnnotationProcessor)
    }
}

fun Project.kotlinxSerializationDependecies() {
    dependencies {
        add("implementation", Libraries.KotlinxSerialization.kotlinxSerializationCore)
        add("implementation", Libraries.KotlinxSerialization.kotlinxSerializationJson)
    }
}

fun Project.kTorDependecies() {
    dependencies {
        add("implementation", Libraries.Ktor.ktor)
        add("implementation", Libraries.Ktor.ktorAndroid)
        add("implementation", Libraries.Ktor.ktorSerialization)
    }
}

fun Project.lifecycleDependecies() {
    dependencies {
        add("implementation", Libraries.LifeCycle.lifeCyclecompiler)
        add("implementation", Libraries.LifeCycle.java8)
        add("implementation", Libraries.LifeCycle.livedataKtx)
        add("implementation", Libraries.LifeCycle.runtime)
        add("implementation", Libraries.LifeCycle.viewmodelKtx)
    }
}
