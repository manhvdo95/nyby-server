# For Java 11, try this
FROM adoptopenjdk/openjdk11:alpine-jre

# Refer to Maven build -> finalName
ARG JAR_FILE=target/nyby-server.jar

# cp target/spring-boot-web.jar /opt/app/app.jar
COPY ${JAR_FILE} nyby-server.jar

# java -jar /opt/app/app.jar
ENTRYPOINT ["java","-jar", "-Dspring.profiles.active=docker", "nyby-server.jar"]