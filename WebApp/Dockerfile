FROM adoptopenjdk/openjdk11:jdk-11.0.9_11.1-alpine-slim
EXPOSE 8081
ENV DB_URL="jdbc:postgresql://localhost:5432/Cloud"
ENV DB_USERNAME="postgres"
ENV DB_PASSWORD="postgres"
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
