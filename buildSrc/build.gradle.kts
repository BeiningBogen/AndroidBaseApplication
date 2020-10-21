plugins {
    `kotlin-dsl`
}

gradlePlugin {
    plugins {
        register("core-module-plugin") {
            id = "core-module-plugin"
            implementationClass = "ModulePlugins.CorePlugin"
        }
        register("feature-home-module-plugin") {
            id = "feature-home-module-plugin"
            implementationClass = "ModulePlugins.FeatureHomeModulePlugin"
        }

        register("feature-0-module-plugin") {
            id = "feature-0-module-plugin"
            implementationClass = "ModulePlugins.Feature0ModulePlugin"
        }
    }
}

repositories {
    mavenCentral()
    google()
    jcenter()
}

// TODO Clean up
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
