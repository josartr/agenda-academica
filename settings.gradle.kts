pluginManagement {
    repositories {
        maven {
            url = uri("http://192.168.111.44:8081/repository/nora-mobile/")
            isAllowInsecureProtocol = true
        }
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        maven {
            url = uri("http://192.168.111.44:8081/repository/nora-mobile/")
            isAllowInsecureProtocol = true
        }
    }
}

rootProject.name = "NORAComposeLab"
include(":app")
