# Embedded Configuration Server with Custom Environment Repository

The Spring Cloud Configuration Server is embedded in the application, so the configuration properties are loaded directly using the EnvironmentRepository and not by REST. Moreover, the EnvironmentRepository is a custom one.

## Usage

* Start the application
* Call the sample endpoint: *curl http://localhost:8888/hello*
* Trigger a refresh: *curl -X POST http://localhost:8888/actuator/refresh*
* Call the sample endpoint again: *curl http://localhost:8888/hello*

Thanks to Ryan who helped me creating this sample project, [this is the issue](https://github.com/spring-cloud/spring-cloud-config/issues/2129).
