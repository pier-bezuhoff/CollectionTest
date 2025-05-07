# Sample Compose Multiplatform project, aiming to test *androidx.collection on Wasm*
It compiles and launches normally on Android, fails on Wasm.
Commenting out `implementation(libs.androidx.collection)` in build.gradle.kts removes Wasm compile errors.

Filed bug: https://issuetracker.google.com/issues/415370682

Project created using https://kmp.jetbrains.com/

You can open the web application by running the `:composeApp:wasmJsBrowserDevelopmentRun` Gradle task (it fails)