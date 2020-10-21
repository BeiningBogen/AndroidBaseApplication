plugins {
    id("com.android.library")
    id("core-module-plugin")
    id("kotlin-android")
    id("kotlin-kapt")
}

dependencies {
    kotlinDependecies()
    androidXDependecies()
    navigationComponent()
    dagger2Dependecies()
    testDependecies()
}
