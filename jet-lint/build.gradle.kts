plugins {
    id("java-library")
    id("kotlin")
    id("kotlin-kapt")
    id("com.android.lint")
}

java {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
}
kotlin {
    jvmToolchain(jdkVersion = 8)
}


dependencies {
    compileOnly("org.jetbrains.kotlin:kotlin-stdlib:1.9.0")

    val lintVersion = "30.0.0"
    compileOnly("com.android.tools.lint:lint-api:$lintVersion")
    compileOnly("com.android.tools.lint:lint-checks:$lintVersion")


    val autoServiceVersion = "1.0-rc7"
    kapt("com.google.auto.service:auto-service:$autoServiceVersion")
    compileOnly("com.google.auto.service:auto-service-annotations:$autoServiceVersion")

    testImplementation("com.android.tools.lint:lint-tests:$lintVersion")
    testImplementation("junit:junit:4.13.2")

}
