# Use OpenJDK 17 as the base image
FROM openjdk:17-jdk-slim

# Copy the Spring Boot JAR file to the Docker image
COPY target/myproject.jar /myproject.jar

# Specify the command to run the JAR file
ENTRYPOINT ["java", "-jar", "/myproject.jar"]
