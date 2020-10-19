object Libraries {
    object Kotlin {
        const val stdLib = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Versions.kotlin}"
        const val anko = "org.jetbrains.anko:anko-common:${Versions.anko}"
        val coroutines = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coroutines}"
        val coroutines_test = "org.jetbrains.kotlinx:kotlinx-coroutines-test:${Versions.coroutines_test}"
    }

    object Google {
        const val material = "com.google.android.material:material:${Versions.material}"
    }

    object AndroidX {
        const val appCompat = "androidx.appcompat:appcompat:${Versions.appCompat}"
        const val fragmentAndroidX = "androidx.fragment:fragment:${Versions.fragmentAndroidX}"
        const val recyclerView = "androidx.recyclerview:recyclerview:${Versions.recyclerView}"
        const val legacySupport = "androidx.legacy:legacy-support-v4:${Versions.legacy}"
        const val constraintLayout = "androidx.constraintlayout:constraintlayout:${Versions.constraintLayout}"
        const val multidex = "androidx.multidex:multidex:${Versions.multidex}"
        const val ktxCore = "androidx.core:core-ktx:${Versions.ktx}"
        const val lifeCycleExtensions = "androidx.lifecycle:lifecycle-extensions:${Versions.lifeCycleExtensions}"
        const val viewmodel = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.viewmodel}"
        const val preferences = "androidx.preference:preference-ktx:${Versions.preferences}"
        const val navigationFragmentKtx = "androidx.navigation:navigation-fragment-ktx:${Versions.navigationFragmentKtx}"
        const val navigationUiKtx = "androidx.navigation:navigation-ui-ktx:${Versions.navigationUiKtx}"
        const val dataBindingCompiler = "com.android.databinding:compiler:${Versions.dataBindingCompiler}"

        object Test {
            const val archCoreTesting = "androidx.arch.core:core-testing:${Versions.archCoreTesting}"
            const val coreTesting = "androidx.test:core:${Versions.coreTesting}"
            const val runner = "androidx.test:runner:${Versions.runner}"
            const val espresso = "androidx.test.espresso:espresso-core:${Versions.espresso}"
            const val junit = "androidx.test.ext:junit:${Versions.androidXJunit}"
        }
    }

    object Other {
        const val timber = "com.jakewharton.timber:timber:${Versions.timber}"
    }

    object Test {
        const val junit = "junit:junit:${Versions.junit}"
        const val mockitoCore = "org.mockito:mockito-core:${Versions.mockitoCore}"
        const val mockitoInline = "org.mockito:mockito-inline:${Versions.mockiToInline}"
        const val mockitokotlin = "com.nhaarman.mockitokotlin2:mockito-kotlin:${Versions.mockiToKotlin}"
        const val hamcrest = "org.hamcrest:hamcrest-library:${Versions.hamcrest}"
    }

    object Dagger2 {
        const val dagger2 = "com.google.dagger:dagger:${Versions.dagger2}"
        const val dagger2Android = "com.google.dagger:dagger-android:${Versions.dagger2}"
        const val dagger2AndroidSupport = "com.google.dagger:dagger-android-support:${Versions.dagger2}"
        const val dagger2AnnotationProcessor = "com.google.dagger:dagger-compiler:${Versions.dagger2}"
        const val dagger2AndroidAnnotationProcessor = "com.google.dagger:dagger-android-processor:${Versions.dagger2}"
    }

    object LifeCycle {
        val lifeCyclecompiler = "androidx.lifecycle:lifecycle-compiler:${Versions.lifeCyclecompiler}"
        val java8 = "androidx.lifecycle:lifecycle-common-java8:${Versions.java8}"
        val livedataKtx = "androidx.lifecycle:lifecycle-livedata-ktx:${Versions.livedataKtx}"
        val runtime = "androidx.lifecycle:lifecycle-runtime:${Versions.runtime}"
        val viewmodelKtx = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.viewmodelKtx}"
    }
}

object Versions {
    // Kotlin
    const val kotlin = "1.3.72"
    const val versions = "0.28.0"
    const val anko = "0.10.0"
    const val coroutines = "1.3.9"
    const val coroutines_test = "1.3.9"

    // google
    const val material = "1.1.0"

    // androidX
    const val appCompat = "1.1.0"
    const val fragmentAndroidX = "1.2.5"
    const val recyclerView = "1.1.0"
    const val legacy = "1.0.0"
    const val constraintLayout = "1.1.3"
    const val ktx = "1.2.0"
    const val lifeCycleExtensions = "2.1.0"
    const val viewmodel = "2.2.0"
    const val preferences = "1.1.1"
    const val multidex = "2.0.1"
    const val navigationFragmentKtx = "2.3.0-alpha06"
    const val navigationUiKtx = "2.3.0-alpha06"
    const val archCoreTesting = "2.1.0"
    const val coreTesting = "1.3.0"
    const val runner = "1.2.0"
    const val espresso = "3.2.0"
    const val dataBindingCompiler = "3.1.4"

    // other
    const val timber = "4.7.1"

    // Lifecycle
    const val lifeCyclecompiler = "2.2.0"
    const val java8 = "2.2.0"
    const val livedataKtx = "2.2.0"
    const val runtime = "2.2.0"
    const val viewmodelKtx = "2.2.0"

    // testing
    const val junit = "4.13"
    const val androidXJunit = "1.1.1"
    const val mockitoCore = "2.23.0"
    const val mockiToInline = "3.3.0"
    const val mockiToKotlin = "2.2.0"
    const val hamcrest = "1.3"

    // dagger2
    const val dagger2 = "2.28.3"

}
