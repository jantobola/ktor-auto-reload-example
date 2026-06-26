plugins {
    kotlin("jvm") version "2.3.0"
    application
}

group = "one.bitby.example"
version = "1.0.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("io.ktor:ktor-server-core:3.5.0")
    implementation("io.ktor:ktor-server-netty:3.5.0")
    implementation("io.ktor:ktor-server-html-builder:3.5.0")
    implementation("ch.qos.logback:logback-classic:1.5.18")
}

application {
    mainClass.set("io.ktor.server.netty.EngineMain")
}
