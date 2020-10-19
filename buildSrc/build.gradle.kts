plugins {
    `kotlin-dsl`
}

val kotlinVersion = "1.4.10"

repositories {
    google()
    jcenter()
}

sourceSets {
    getByName("main").java.srcDirs("src/main/kotlin")
}

dependencies {
    implementation("com.android.tools.build:gradle:4.0.1")
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlinVersion")
}
