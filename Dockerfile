FROM openjdk:11
ARG JAR_FILE=build/libs/*.jar
COPY ${JAR_FILE} test-app.jar

EXPOSE 8080/tcp
ENTRYPOINT ["java","-jar","/test-app.jar"]