pluginManagement {
    repositories {
        google()
        maven ("https://jitpack.io" )
        maven("https://repo1.maven.org/maven2/" )
        jcenter()
        gradlePluginPortal()

        maven ("https://maven.aliyun.com/repository/google")
        maven ("https://maven.aliyun.com/repository/jcenter")
        maven ("https://maven.aliyun.com/nexus/content/groups/public")
    }
}
dependencyResolutionManagement {
    repositories {
        google()
        maven ("https://jitpack.io" )
        maven("https://repo1.maven.org/maven2/" )
        jcenter()
        gradlePluginPortal()

        maven ("https://maven.aliyun.com/repository/google")
        maven ("https://maven.aliyun.com/repository/jcenter")
        maven ("https://maven.aliyun.com/nexus/content/groups/public")
    }
}

rootProject.name = "blurSample"
include(":app")
include(":blur")
