plugins {
    id("com.android.application")
}

android {
    compileSdk = 28
    defaultConfig {
        applicationId = "com.opscape.openosrs"
        minSdk = 26
        //We target 28 for easier access to External Storage
        targetSdk = 28
        versionCode = 1
        versionName = "1.0"
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    lint {
        disable.add("ExpiredTargetSdkVersion")
    }
    buildToolsVersion = "29.0.2"
}

repositories {
    maven {
        url = uri("https://maven.andob.info/repository/open_source")
    }
}

dependencies {
    implementation("com.github.librepdf:openpdf:1.3.24")
    implementation("ro.andob.androidawt:androidawt:1.0.4")
    implementation("org.bouncycastle:bcprov-jdk15on:1.52")
    implementation("androidx.appcompat:appcompat:1.0.2")
    implementation("androidx.constraintlayout:constraintlayout:1.1.3")
    implementation("com.google.android.material:material:1.0.0")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.3")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.4.0")
}
