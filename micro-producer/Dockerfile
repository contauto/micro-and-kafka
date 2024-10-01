FROM openjdk:21

WORKDIR /app

COPY target/micro-producer-0.0.1-SNAPSHOT.jar micro-producer.jar

EXPOSE 3535

CMD ["java", "-jar", "micro-producer.jar"]
