plugins {
    id("com.android.application")
    id("common-module-plugin")
    id("ui-module-plugin")
    id("kotlin-kapt")
}

android {}

dependencies {
    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))

    kotlinDependecies()
    androidXDependecies()
    dagger2Dependecies()
    testDependecies()
    implementation(Libraries.Google.material) // GOOGLE
    api(Libraries.Other.timber) // OTHER

    // Custom modules
    implementation(project(":ui"))
    implementation(project(":networking"))
}
