## Command line application in a Docker container
with Spring Boot

### Requirements
- [Maven 3.9.9](https://maven.apache.org/index.html)
- [Java 21](https://docs.aws.amazon.com/corretto/latest/corretto-21-ug/downloads-list.html)
- [Docker](https://www.docker.com)
### How to use?
```
# Build the jar.
> mvn clean compile package

# Build the image.
> docker build -f src/main/docker/Dockerfile.jvm -t spring/calculator-jvm .

# View your created image.
> docker images | grep spring/calculator-jvm

# Run the container using.
> docker run -i --rm -p 8080:8080 -e FIRST=1 -e OPERATION=+ -e SECOND=2 spring/calculator-jvm

# Remove your image.
> docker rmi spring/calculator-jvm

# Clean up any resources — images, containers, volumes, and networks — that are dangling (not tagged or associated with a container).
> docker system prune
