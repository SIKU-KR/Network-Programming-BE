FROM openjdk:17-jdk-slim

WORKDIR /app

COPY build/libs/*-all.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]

EXPOSE 10001