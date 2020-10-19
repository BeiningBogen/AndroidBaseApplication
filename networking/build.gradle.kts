plugins {

    kotlin("plugin.serialization") version "1.4.10"
    id("com.android.library")
    id("common-module-plugin") // Not working
    id("kotlin-kapt")
}

addDaggerDI()
kTor()

dependencies {

    implementation ("org.jetbrains.kotlin:kotlin-stdlib:1.4.10")
    implementation ("androidx.core:core-ktx:1.3.2")
    implementation ("androidx.appcompat:appcompat:1.2.0")
    implementation ("com.google.android.material:material:1.2.1")

    // Kotlinx-serializable
    implementation (Libraries.KotlinxSerialization.kotlinxSerialization)
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.0.0")

    testImplementation ("junit:junit:4.+")
    androidTestImplementation ("androidx.test.ext:junit:1.1.2")
    androidTestImplementation ("androidx.test.espresso:espresso-core:3.3.0")
}
