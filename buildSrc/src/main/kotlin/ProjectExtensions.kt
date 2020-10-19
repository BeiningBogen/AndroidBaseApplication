import org.gradle.api.Project
import org.gradle.kotlin.dsl.dependencies

fun Project.addDaggerDI() {
    dependencies {
        add("implementation", Libraries.Dagger2.dagger2)
        add("implementation", Libraries.Dagger2.dagger2Android)
        add("implementation", Libraries.Dagger2.dagger2AndroidSupport)
        add("kapt", Libraries.Dagger2.dagger2Compiler)
        add("kapt", Libraries.Dagger2.dagger2AndroidAnnotationProcessor)
    }
}
