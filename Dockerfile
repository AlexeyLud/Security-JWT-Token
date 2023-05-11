FROM openjdk:11
ADD target/security-app.jar jwt-app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "jwt-app.jar"]

