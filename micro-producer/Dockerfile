FROM ubuntu:latest
LABEL authors="k.maktav"

ENTRYPOINT ["top", "-b"]

# Use a base image with Java 21
FROM openjdk:21

# Set the working directory
WORKDIR /app

# Copy the jar file into the container
COPY target/micro-producer-0.0.1-SNAPSHOT.jar micro-producer.jar

# Expose the port your application runs on
EXPOSE 3535

# Command to run the application
CMD ["java", "-jar", "micro-producer.jar"]
