FROM openjdk:17-alpine

COPY build/libs/kotlin-api-0.0.1-SNAPSHOT.jar /app/kotlin-api-app.jar

CMD ["java", "-jar", "/app/kotlin-api-app.jar"]