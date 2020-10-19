plugins {
    `kotlin-dsl`
}

repositories {
    google()
    jcenter()
}

sourceSets {
    getByName("main").java.srcDirs("src/main/kotlin")
}

dependencies {
    implementation("com.android.tools.build:gradle:4.1.0")
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:1.4.10") // Cant reference Versions.Kotlin for whatever reason...
}
