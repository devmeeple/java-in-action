plugins {
    id("java")
}

group = "io.github.devmeeple"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

val junitVersion = "5.10.0"
val assertjVersion = "3.27.6"

dependencies {
    testImplementation(platform("org.junit:junit-bom:$junitVersion"))

    // 테스트 라이브러리 AssertJ Core
    testImplementation("org.assertj:assertj-core:$assertjVersion")

    testImplementation("org.junit.jupiter:junit-jupiter")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

tasks.test {
    useJUnitPlatform()
}
