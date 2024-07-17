FROM openjdk:17-jdk-alpine
VOLUME /tmp
COPY target/*.jar Portfolio.jar
ENTRYPOINT ["java","-jar","/Portfolio.jar"]
