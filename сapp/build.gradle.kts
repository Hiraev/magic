plugins {
    kotlin("jvm")
}
dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib")

    implementation(project(":bc"))
    implementation(project(":bb"))
}
