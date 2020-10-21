plugins {
    id("com.android.library")
    id("feature-home-module-plugin")
    id("kotlin-kapt")
    id("androidx.navigation.safeargs.kotlin")
}

android {
    buildFeatures {
        dataBinding = true
        viewBinding = true
    }
}

dependencies {
    implementation(project(":core"))

    kotlinDependecies()
    androidXDependecies()
    navigationComponent()
    dagger2Dependecies()
    implementation(Libraries.Google.material) // GOOGLE
    testDependecies()
}
