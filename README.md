# Hello Service

It is designed in Contact First approach. The division of concerns will be in the modules.

Modules:

     * hello-data-repo  --> Data layer, for all database interactions, JPA used for persistence
     * service-api --> API definitions , created with OpenAPI(RAML is an alternative).
     * service-impl --> API implementation for APIs generated by service-api.

**Build:**

In root project directory (hello-hellowah)

`On Mac --> ./gradlew clean build`

`On Windows --> gradlew clean build`

**Run:**

In root project directory (hello-hellowah)

`On Mac --> ./gradlew :service-impl:bootrun`

`On Windows --> gradlew :service-impl:bootrun`