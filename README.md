# Android Basic App

## Overview

The Android Basic App is a simple application that allows users to log in and fetch food-related data from a remote API. The app utilises modern Android architecture components, including ViewModel, LiveData, and RecyclerView, along with dependency injection using Hilt.

## Features

- User authentication via API
- Display a list of food items
- Navigation to a details page for each food item (not currently working)

## Requirements

- Android Studio (latest version recommended)
- Kotlin (version compatible with your Android Studio)
- Android SDK (API level 21 or higher)

## Dependencies

Make sure to include the following dependencies in your `build.gradle` file (app level):

```groovy
dependencies {
    implementation "com.squareup.retrofit2:retrofit:2.9.0"
    implementation "com.squareup.retrofit2:converter-moshi:2.9.0"
    implementation "com.squareup.moshi:moshi:1.12.0"
    implementation "com.squareup.moshi:moshi-kotlin:1.12.0"
    implementation "com.squareup.hilt:hilt-android:2.42"
    kapt "com.squareup.hilt:hilt-compiler:2.42"
    implementation "androidx.activity:activity-ktx:1.4.0"
    implementation "androidx.fragment:fragment-ktx:1.4.0"
    implementation "androidx.recyclerview:recyclerview:1.2.1"
    implementation "androidx.lifecycle:lifecycle-viewmodel-ktx:2.4.0"
    implementation "androidx.lifecycle:lifecycle-runtime-ktx:2.4.0"
    implementation "com.squareup.okhttp3:logging-interceptor:4.9.3"
}
