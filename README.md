# spring-cloud-function-issues-623
Reference project for SCF Issue 623

See https://github.com/spring-cloud/spring-cloud-function/issues/623 for the actual issue.

To run the application, run `mvn package` at the root of the application.
Within the `example` directory, run `mvn spring-boot:run` to start the server, which will listen on port 8080.

To trigger the issue in question, you can (un)comment one of the `@Component` annotations found within the `function` package in the `example` module.

With only one Function available, SCF will continuously throw an exception, preventing the application from running properly.
With two Functions available (by the usage of the `@Component` annotation), the application works normally.

