plugins {
    kotlin("plugin.serialization") version "1.4.10"
    id("com.android.library")
    id("common-module-plugin")
    id("kotlin-kapt")
}

dependencies {
    kotlinDependecies()

    dagger2Dependecies()
    kTorDependecies()
    kotlinxSerializationDependecies()

    testDependecies()
}
