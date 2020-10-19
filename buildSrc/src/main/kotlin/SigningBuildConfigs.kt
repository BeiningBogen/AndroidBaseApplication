import com.android.build.gradle.internal.dsl.BaseAppModuleExtension
import org.gradle.api.Project

fun BaseAppModuleExtension.setDefaultSigningConfigs(project: Project) = signingConfigs {
    val gPStoreFile = project.findProperty("RELEASE_STORE_FILE")
    val gPStorePassword = project.findProperty("RELEASE_STORE_PASSWORD")
    val gPKeyAlias = project.findProperty("RELEASE_KEY_ALIAS")
    val gPKeyPassword = project.findProperty("RELEASE_KEY_PASSWORD")

    create("config_debug") {
        storeFile = project.file("/Users/eier/.android/debug.keystore")
        storePassword = "android"
        keyAlias = "androiddebugkey"
        keyPassword = "android"
    }

    create("config_staging") {
        storeFile = project.file("/Users/eier/.android/debug.keystore")
        storePassword = "android"
        keyAlias = "androiddebugkey"
        keyPassword = "android"
    }

    create("config_release") {
        storeFile = project.file(gPStoreFile.toString())
        storePassword = gPStorePassword.toString()
        keyAlias = gPKeyAlias.toString()
        keyPassword = gPKeyPassword.toString()
    }
}
