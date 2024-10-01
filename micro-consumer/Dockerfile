# Start with Ubuntu as the base image
FROM ubuntu:latest
LABEL authors="k.maktav"

# Java version 21
FROM openjdk:21

# Set working directory
WORKDIR /app

# Copy the jar file into the container
COPY target/micro-consumer-0.0.1-SNAPSHOT.jar micro-consumer.jar

# Expose the port used by the application
EXPOSE 3434

# Run the application
CMD ["java", "-jar", "micro-consumer.jar"]
