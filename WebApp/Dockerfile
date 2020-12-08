FROM maven:3.6.3-jdk-11-slim AS mavenBuild
WORKDIR mavenBuild
COPY . .
RUN mvn package -DskipTests

FROM adoptopenjdk/openjdk11:jdk-11.0.9_11.1-alpine-slim
EXPOSE 8081
ENV DB_URL="jdbc:postgresql://localhost:5432/Cloud"
ENV DB_USERNAME="postgres"
ENV DB_PASSWORD="postgres"
COPY --from=mavenBuild /mavenBuild/target/*.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
