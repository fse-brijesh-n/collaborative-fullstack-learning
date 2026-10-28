# Build context is the repository root (needed so the parent POM + common-service
# are available to resolve the multi-module reactor build).
FROM maven:3.9-eclipse-temurin-17 AS builder
WORKDIR /build

COPY pom.xml .
COPY common-service common-service
COPY api-gateway api-gateway

RUN mvn -q -pl api-gateway -am clean package -DskipTests

FROM eclipse-temurin:17-jre-jammy
WORKDIR /app
COPY --from=builder /build/api-gateway/target/api-gateway.jar app.jar

EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
