FROM maven:3.8.5-openjdk-17-slim AS builder

WORKDIR /app

# Copy the Maven wrapper and the pom.xml
COPY mvnw .
COPY .mvn .mvn
COPY pom.xml .

RUN ./mvnw dependency:go-offline

COPY src ./src

RUN ./mvnw clean package -DskipTests

FROM openjdk:17-jdk-slim

WORKDIR /app

COPY --from=builder /app/target/project-template-0.0.1-SNAPSHOT.jar app.jar
COPY --chown=1001:80 /database /app/database

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]
