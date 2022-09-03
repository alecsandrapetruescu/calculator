## Simple Calculator
Command line application with Spring Boot

### Requirements
- [Maven 3.8.5](https://maven.apache.org/index.html)
- [Java 11](https://openjdk.org/projects/jdk/11/)
### Application uses
- [Spring Boot 2.7.3](https://docs.spring.io/spring-boot/docs/current/reference/html/getting-started.html#getting-started.introducing-spring-boot)
### How to use?
```
# Build the jar.
> mvn clean compile package

# Execute the jar with arguments:
# java -jar calculator-0.0.1-SNAPSHOT.jar firstNumber operation secondNumber
# Supported operation: +, -, *, /.

> java -jar calculator-0.0.1-SNAPSHOT.jar 1 + 1

> java -jar calculator-0.0.1-SNAPSHOT.jar 1 - 1

> java -jar calculator-0.0.1-SNAPSHOT.jar 1 * 2

> java -jar calculator-0.0.1-SNAPSHOT.jar 1 / 2
```
### How to update?
```
# Update Maven wrapper
> mvn wrapper:wrapper -Dmaven=3.8.5
```
### [Code of conduct](https://raw.githubusercontent.com/eclipse/.github/master/CODE_OF_CONDUCT.md)
