plugins {
    kotlin("multiplatform") version "1.9.21"
}

group = "com.example"
version = "0.0.0"

repositories {
    mavenCentral()
}

kotlin {
    js(IR) {
        nodejs()
        binaries.executable()
    }
}
