plugins {
    id("com.android.application")
    id("kotlin-android")
    id("core-module-plugin") // Are these needed?
    // id("feature-home-module-plugin") // Are these needed?
    // id("feature-0-module-plugin") // Are these needed?
    id("kotlin-kapt")
}

android {}

dependencies {
    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))
    implementation("androidx.navigation:navigation-fragment-ktx:2.3.1")
    implementation("androidx.navigation:navigation-ui-ktx:2.3.1")

    kotlinDependecies()
    androidXDependecies()
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
