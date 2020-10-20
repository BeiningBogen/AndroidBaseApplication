
plugins {
    id("com.android.application")
    id("ui-module-plugin")
    id("kotlin-kapt")
}

android {
    buildFeatures {
        dataBinding = true
        viewBinding = true
    }
}

dependencies {
    kotlinDependecies()
    androidXDependecies()
    dagger2Dependecies()
    implementation(Libraries.Google.material) // GOOGLE
    testDependecies()
}
