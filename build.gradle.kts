import io.spring.gradle.dependencymanagement.dsl.DependencyManagementExtension

plugins {
    kotlin("jvm") version "1.3.72"
    id("io.spring.dependency-management") version "1.0.9.RELEASE"
    id("org.jetbrains.kotlin.kapt") version "1.3.72"
    id("org.jetbrains.kotlin.plugin.allopen") version "1.3.72"
    application
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

configure<DependencyManagementExtension> {
    imports {
        //mavenBom("io.micronaut:micronaut-bom:2.0.0.RC1")
    }
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))
    api("io.micronaut", "micronaut-inject-java", "2.0.0.RC1")
    api("io.micronaut", "micronaut-management", "2.0.0.RC1") // Health endpoint
    implementation("org.jetbrains.kotlin:kotlin-reflect:1.3.72")
    implementation("io.micronaut:micronaut-runtime:2.0.0.RC1")
    implementation("io.micronaut:micronaut-http-client:2.0.0.RC1")
    implementation("io.micronaut:micronaut-http-server-netty:2.0.0.RC1")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.3.7")
    implementation("org.apache.logging.log4j", "log4j-core", "2.13.3")
    implementation("org.apache.logging.log4j:log4j-slf4j-impl:2.13.3")

    annotationProcessor("io.micronaut", "micronaut-inject-java", "2.0.0.RC1")
    kapt("io.micronaut:micronaut-inject-java:2.0.0.RC1")
    kaptTest("io.micronaut", "micronaut-inject-java", "2.0.0.RC1")

    testImplementation("io.micronaut.test", "micronaut-test-junit5", "1.1.5")
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.6.2")
    testImplementation("org.junit.jupiter:junit-jupiter-engine:5.6.2")
    testImplementation("io.mockk:mockk:1.10.0")

    testCompileOnly("org.junit.jupiter:junit-jupiter-api:5.6.2")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.6.2")
}

tasks {
    compileKotlin {
        kotlinOptions.jvmTarget = "1.8"
    }
    compileTestKotlin {
        kotlinOptions.jvmTarget = "1.8"
    }
}

tasks.withType<Test> {
    useJUnitPlatform()
}

application {
    mainClass.set("guild.kotlin.micronaut.application.App")
}