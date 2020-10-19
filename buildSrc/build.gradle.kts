plugins {
    `kotlin-dsl`
}

gradlePlugin {
    plugins {
        register("common-module-plugin") {
            id = "common-module-plugin"
            implementationClass = "CommonModulePlugin"
        }
    }
}

repositories {
    mavenCentral()
    google()
    jcenter()
}

dependencies {
    compileOnly(gradleApi())

    implementation("com.android.tools.build:gradle:4.1.0")
    implementation(kotlin("gradle-plugin", "1.4.0"))
    implementation("androidx.navigation:navigation-safe-args-gradle-plugin:2.3.1")
}






























































// kotlin("jvm") version "1.4.0"

/*sourceSets {
    getByName("main").java.srcDirs("src/main/kotlin")
}*/

// implementation(localGroovy())

/*val compileKotlin: KotlinCompile by tasks
compileKotlin.kotlinOptions {
    jvmTarget = "1.8"
}
val compileTestKotlin: KotlinCompile by tasks
compileTestKotlin.kotlinOptions {
    jvmTarget = "1.8"
}*/


//     implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:1.4.10")

//     implementation(kotlin("stdlib-jdk8"))
