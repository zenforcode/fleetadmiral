plugins {
    id("com.github.johnrengelman.shadow") version "8.1.1"
    id("io.micronaut.application") version "4.4.4"
    id("io.micronaut.aot") version "4.4.4"
    id("org.jetbrains.kotlin.jvm") version "1.8.10"
    id("io.micronaut.data") version "4.4.4"
    id("io.micronaut.test-resources") version "4.4.4"
    id("io.micronaut.gradle-plugin") version "4.4.4"
    id("java")
}

version = "0.1"
group = "org.zencode"

repositories {
    mavenCentral()
}

dependencies {
    // Micronaut JPA Hibernate
    implementation("io.micronaut.data:micronaut-data-hibernate-jpa")

    // Jakarta Persistence API
    implementation("jakarta.persistence:jakarta.persistence-api:3.1.0")

    // Micronaut JDBC & PostgreSQL Driver
    implementation("io.micronaut.sql:micronaut-jdbc-hikari")
    runtimeOnly("org.postgresql:postgresql:42.6.0")

    // Micronaut Validation
    implementation("io.micronaut:micronaut-validation")

    // Micronaut Test Framework
    testImplementation("io.micronaut.test:micronaut-test-junit5")

    // Kotlin Support
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    implementation("org.jetbrains.kotlin:kotlin-reflect")

    // Micronaut Runtime & Configuration
    implementation("io.micronaut:micronaut-runtime")
    implementation("io.micronaut.data:micronaut-data-jpa")
}

micronaut {
    runtime("netty")
    testRuntime("junit5")
    processing {
        incremental(true)
        annotations("org.zencode.*")
    }
}

tasks.test {
    useJUnitPlatform()
}


application {
    mainClass = "org.zencode.Application"
}
java {
    sourceCompatibility = JavaVersion.toVersion("21")
    targetCompatibility = JavaVersion.toVersion("21")
}


graalvmNative.toolchainDetection = false

micronaut {
    runtime("netty")
    testRuntime("junit5")
    processing {
        incremental(true)
        annotations("org.zencode.*")
    }
    aot {
        // Please review carefully the optimizations enabled below
        // Check https://micronaut-projects.github.io/micronaut-aot/latest/guide/ for more details
        optimizeServiceLoading = false
        convertYamlToJava = false
        precomputeOperations = true
        cacheEnvironment = true
        optimizeClassLoading = true
        deduceEnvironment = true
        optimizeNetty = true
        replaceLogbackXml = true
    }
}


tasks.named<io.micronaut.gradle.docker.NativeImageDockerfile>("dockerfileNative") {
    jdkVersion = "21"
}


