FROM maven:3.6.3-jdk-11-slim AS mavenBuild
WORKDIR mavenBuild
COPY . .
RUN mvn package -DskipTests

FROM adoptopenjdk/openjdk11:jdk-11.0.9_11.1-alpine-slim
EXPOSE 8081
ENTRYPOINT ["java","-jar","/app.jar"]
COPY --from=mavenBuild /mavenBuild/target/*.jar app.jar

