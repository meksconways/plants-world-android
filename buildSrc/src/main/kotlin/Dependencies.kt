import org.gradle.api.artifacts.dsl.DependencyHandler

object Dependencies {
    object Kotlin {
        const val stdlib = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Versions.kotlin}"
    }

    object AndroidX {
        const val appCompat = "androidx.appcompat:appcompat:${Versions.appcompat}"
        const val coreKtx = "androidx.core:core-ktx:${Versions.coreKtx}"
        const val constraintLayout = "androidx.constraintlayout:constraintlayout:${Versions.constraintLayout}"
        const val material = "com.google.android.material:material:${Versions.material}"
        const val rv = "androidx.recyclerview:recyclerview:${Versions.rv}"
        const val cardView = "androidx.cardview:cardview:${Versions.cardView}"

        const val navigationUi = "androidx.navigation:navigation-ui-ktx:${Versions.navigation}"
        const val navigationFragment = "androidx.navigation:navigation-fragment-ktx:${Versions.navigation}"

        const val lifecycleRuntime = "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.lifecycle}"
        const val lifecycleExtensions = "androidx.lifecycle:lifecycle-extensions:${Versions.lifecycle}"
        const val lifecycleViewModel = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.lifecycle}"
        const val lifecycleCommon = "androidx.lifecycle:lifecycle-common-java8:${Versions.lifecycle}"
        const val fragmentKtx = "androidx.fragment:fragment-ktx:${Versions.fragment}"
        const val activityKtx = "androidx.fragment:fragment-ktx:${Versions.activity}"
        const val collectionKtx = "androidx.collection:collection-ktx:${Versions.collection}"
    }

    object Common {
        const val bindable = "com.github.skydoves:bindables:${Versions.bindable}"
    }

    object DI {
        const val hiltAndroid = "com.google.dagger:hilt-android:${Versions.hilt}"
        const val hiltAndroidCompiler = "com.google.dagger:hilt-android-compiler:${Versions.hilt}" //kapt
        const val hiltViewModel = "androidx.hilt:hilt-lifecycle-viewmodel:${Versions.hilt_viewmodel}"
        const val hiltCompiler = "androidx.hilt:hilt-compiler:${Versions.hilt_viewmodel}" //kapt
    }

    object Networking {
        const val loggingInterceptor = "com.squareup.okhttp3:logging-interceptor:${Versions.loggingInterceptor}"
        const val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
        const val gsonConverter = "com.squareup.retrofit2:converter-gson:${Versions.retrofit}"
    }


}