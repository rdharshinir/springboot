# Use an official OpenJDK 17 image as the base image
FROM eclipse-temurin:17-jdk-alpine

# Set the working directory inside the container
WORKDIR /app

# Copy the compiled JAR file from the target directory to the container
COPY target/demo-0.0.1-SNAPSHOT.jar app.jar

# Expose the port that your Spring Boot application is running on (from application.properties)
EXPOSE 8081

# Command to run the application
ENTRYPOINT ["java", "-jar", "app.jar"]
