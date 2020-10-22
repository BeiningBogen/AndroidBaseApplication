plugins {
    id("com.android.application")
    id("kotlin-android")
    id("core-module-plugin")
    id("kotlin-kapt")
}

dependencies {
    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))

    kotlinDependecies()
    androidXDependecies()
    navigationComponent()
    dagger2Dependecies()
    testDependecies()
    implementation(Libraries.Google.material) // GOOGLE
    api(Libraries.Other.timber) // OTHER

    // Custom modules
    implementation(project(":core"))
    implementation(project(":feature_home"))
    implementation(project(":feature_0"))
    implementation(project(":networking"))
}
