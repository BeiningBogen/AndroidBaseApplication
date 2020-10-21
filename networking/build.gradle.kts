plugins {
    id("com.android.library")
    id("core-module-plugin")
    kotlin("plugin.serialization") version "1.4.10"
    // id("kotlin-kapt")
}

dependencies {
    // kotlinDependecies()

    // dagger2Dependecies()
    kTorDependecies()
    kotlinxSerializationDependecies()

    testDependecies()
}
