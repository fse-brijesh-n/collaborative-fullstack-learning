# Build context is the repository root (needed so the parent POM + common-service
# are available to resolve the multi-module reactor build).
FROM maven:3.9-eclipse-temurin-17 AS builder
WORKDIR /build

COPY pom.xml .
COPY common-service common-service
COPY auth-service auth-service

RUN mvn -q -pl auth-service -am clean package -DskipTests

FROM eclipse-temurin:17-jre-jammy
WORKDIR /app
COPY --from=builder /build/auth-service/target/auth-service.jar app.jar

EXPOSE 8081
ENTRYPOINT ["java", "-jar", "app.jar"]
