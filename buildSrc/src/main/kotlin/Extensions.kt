import org.gradle.api.artifacts.dsl.DependencyHandler
import org.gradle.api.artifacts.Dependency
import org.gradle.api.artifacts.dsl.RepositoryHandler
import org.gradle.kotlin.dsl.maven


fun DependencyHandler.kapt(dependencyNotation: String): Dependency? =
    add("kapt", dependencyNotation)

fun DependencyHandler.add(dependencyNotation: String): Dependency? =
    add("implementation", dependencyNotation)

fun DependencyHandler.api(dependencyNotation: String): Dependency? =
    add("api", dependencyNotation)

fun DependencyHandler.testImplementation(dependencyNotation: String): Dependency? =
    add("testImplementation", dependencyNotation)

fun DependencyHandler.androidTestImplementation(dependencyNotation: String): Dependency? =
    add("androidTestImplementation", dependencyNotation)

fun DependencyHandler.debugImplementation(dependencyNotation: String): Dependency? =
    add("debugImplementation", dependencyNotation)


fun DependencyHandler.addDIDependencies() {
    add(Dependencies.DI.hiltAndroid)
    add(Dependencies.DI.hiltViewModel)
    kapt(Dependencies.DI.hiltCompiler)
    kapt(Dependencies.DI.hiltAndroidCompiler)
}


fun DependencyHandler.addAndroidXDependencies() {
    add(Dependencies.AndroidX.activityKtx)
    add(Dependencies.AndroidX.appCompat)
    add(Dependencies.AndroidX.cardView)
    add(Dependencies.AndroidX.collectionKtx)
    add(Dependencies.AndroidX.constraintLayout)
    add(Dependencies.AndroidX.coreKtx)
    add(Dependencies.AndroidX.fragmentKtx)
    add(Dependencies.AndroidX.lifecycleCommon)
    add(Dependencies.AndroidX.lifecycleExtensions)
    add(Dependencies.AndroidX.lifecycleRuntime)
    add(Dependencies.AndroidX.lifecycleViewModel)
    add(Dependencies.AndroidX.material)
    add(Dependencies.AndroidX.navigationFragment)
    add(Dependencies.AndroidX.navigationUi)
    add(Dependencies.AndroidX.rv)
}

fun DependencyHandler.addNetworkingDependencies() {
    add(Dependencies.Networking.gsonConverter)
    add(Dependencies.Networking.retrofit)
    add(Dependencies.Networking.loggingInterceptor)
}

fun DependencyHandler.addTestDependencies() {

}

fun RepositoryHandler.applyDefault() {
    google()
    jcenter()
    mavenCentral()
}