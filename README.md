# Android Basic App

## Overview

The Android Basic App is a simple application that allows users to log in and fetch food-related data from a remote API. The app utilizes modern Android architecture components, including ViewModel, LiveData, and RecyclerView, along with dependency injection using Hilt.

## Features

- User authentication via API
- Display a list of food items
- Navigation to a details page for each food item

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
```

Make sure to apply the Kotlin KAPT plugin in your `build.gradle` file:

```groovy
apply plugin: 'kotlin-kapt'
```

## Setup Instructions

1. **Clone the repository:**

   ```bash
   git clone https://github.com/ladi35man217/DG-Final-Assessment.git
   cd android-basic-app
   ```

2. **Open the project in Android Studio.**

3. **Sync the Gradle files:**

   Click on "Sync Now" in the notification bar to download the dependencies.

4. **Enable Hilt:**

   Add the Hilt plugin in your `build.gradle` (project level):

   ```groovy
   buildscript {
       dependencies {
           classpath "com.google.dagger:hilt-android-gradle-plugin:2.42"
       }
   }
   ```

5. **Configure the AndroidManifest.xml:**

   Ensure you have the required permissions in your `AndroidManifest.xml` file. The following is an example of what you might need:

   ```xml
   <uses-permission android:name="android.permission.INTERNET"/>
   ```

## Running the Application

1. **Connect an Android device or start an emulator.**

2. **Build and run the application:**

   In Android Studio, click on the **Run** button (green triangle) or use the keyboard shortcut `Shift + F10`.

3. **Log in:**

   Enter the username and password in the login screen. The app will navigate to the main screen displaying a list of food items.

   The correct Username and Password are 'Daniel' & 's4673382' respectively.

## Structure

Here is a brief overview of the project's structure:

- `data/`: Contains data models for API requests and responses.
- `network/`: Contains classes for Retrofit setup and API service interface.
- `ui/`: Contains fragments and adapters for the user interface.
- `viewmodel/`: Contains ViewModel classes for managing UI-related data.

## Contributing

If you'd like to contribute to this project, please follow these steps:

1. Fork the repository.
2. Create a new feature branch (`git checkout -b feature/new-feature`).
3. Commit your changes (`git commit -m 'Add new feature'`).
4. Push to the branch (`git push origin feature/new-feature`).
5. Create a new Pull Request.


## Acknowledgments

- Thanks to the Android community for their resources and libraries.
