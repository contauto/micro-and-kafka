FROM openjdk:21

WORKDIR /app

COPY target/micro-consumer-0.0.1-SNAPSHOT.jar micro-consumer.jar

EXPOSE 3434

CMD ["java", "-jar", "micro-consumer.jar"]
