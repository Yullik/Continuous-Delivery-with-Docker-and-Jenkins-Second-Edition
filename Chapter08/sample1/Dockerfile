FROM openjdk:11-jre-slim
WORKDIR /app
COPY build/libs/calculator.jar calculator.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "calculator.jar"]
