plugins {
    kotlin("android") version "2.0.0"
    kotlin("plugin.serialization") version "2.0.0"
    id("com.google.devtools.ksp") version "2.0.0-1.0.21"
    id("com.android.application")
}

dependencies {

    // 🖥️ UI — Jetpack Compose
    implementation("androidx.compose.ui:ui:1.6.4")
    implementation("androidx.compose.material3:material3:1.2.1")
    implementation("androidx.activity:activity-compose:1.9.0")
    implementation("androidx.navigation:navigation-compose:2.7.7") // screen navigation

    // 🗄️ Database — Room (store notes locally)
    implementation("androidx.room:room-runtime:2.6.1")
    implementation("androidx.room:room-ktx:2.6.1")
    ksp("androidx.room:room-compiler:2.6.1")

    // ⚡ Coroutines — async database operations
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.8.0")

    // 🔄 ViewModel — manage UI state
    implementation("androidx.lifecycle:lifecycle-viewmodel-compose:2.7.0")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.7.0")

    // 💉 Dependency Injection — Koin
    implementation("io.insert-koin:koin-androidx-compose:3.5.3")

    // 🕒 Date & Time
    implementation("org.jetbrains.kotlinx:kotlinx-datetime:0.5.0")

    // 🔍 Testing
    testImplementation("org.jetbrains.kotlin:kotlin-test:2.0.0")
    testImplementation("androidx.room:room-testing:2.6.1")
}