#
#
#
FROM eclipse-temurin:17-jdk-jammy
VOLUME /tmp
COPY ${JAR_FILE} /bookclub.jar
EXPOSE 8080
ENTRYPOINT ["java",\
            "-jar",\
            "/bookclub.jar"]