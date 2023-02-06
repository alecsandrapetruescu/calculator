## Simple Calculator
Command line application with Spring Boot

[![Build](https://github.com/alecsandrapetruescu/calculator/actions/workflows/maven.yml/badge.svg)](https://github.com/alecsandrapetruescu/calculator/actions/workflows/maven.yml)
[![Docker Image Build](https://github.com/alecsandrapetruescu/calculator/actions/workflows/docker-image.yml/badge.svg)](https://github.com/alecsandrapetruescu/calculator/actions/workflows/docker-image.yml)
[![CodeQL](https://github.com/alecsandrapetruescu/calculator/actions/workflows/codeql.yml/badge.svg)](https://github.com/alecsandrapetruescu/calculator/actions/workflows/codeql.yml)
[![Dependency Review](https://github.com/alecsandrapetruescu/calculator/actions/workflows/dependency-review.yml/badge.svg)](https://github.com/alecsandrapetruescu/calculator/actions/workflows/dependency-review.yml)
### Requirements
- [Maven 3.8.5](https://maven.apache.org/index.html)
- [Java 17](https://access.redhat.com/documentation/en-us/openjdk/17)
### Application uses
- [Spring Boot 3.0.2](https://docs.spring.io/spring-boot/docs/current/reference/html/getting-started.html#getting-started.introducing-spring-boot)
### How to use?
```
# Build the jar.
> mvn clean compile package
> cd target

# Execute the jar with arguments:
# java -jar calculator-0.0.1-SNAPSHOT.jar firstNumber operation secondNumber
# Supported operation: +, -, *, /.

> java -jar calculator-0.0.1-SNAPSHOT.jar 1 + 1

> java -jar calculator-0.0.1-SNAPSHOT.jar 1 - 1

> java -jar calculator-0.0.1-SNAPSHOT.jar 1 * 2

> java -jar calculator-0.0.1-SNAPSHOT.jar 1 / 2
```
### [How to use with Docker?](./src/main/docker/README.md)
### How to update?
```
# Update Maven wrapper
> mvn wrapper:wrapper -Dmaven=3.8.5
```
### [Code of conduct](https://raw.githubusercontent.com/eclipse/.github/master/CODE_OF_CONDUCT.md)
