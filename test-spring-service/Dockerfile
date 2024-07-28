# Stage 1: Build stage
FROM maven:3.8.5-openjdk-17-slim AS build
WORKDIR /app
COPY pom.xml .
RUN mvn dependency:go-offline
COPY . .
RUN mvn clean package

# Stage 2: Runtime stage
FROM openjdk:11-ea-17-jre-slim AS runtime
WORKDIR /app
COPY --from=build /app/target/docker-0.0.1-SNAPSHOT.jar .
CMD ["java","-jar","/app.jar", "/app/target/docker-0.0.1-SNAPSHOT.jar"]
