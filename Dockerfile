FROM openjdk:17-jdk

WORKDIR /app

COPY target/test-alb-*.jar /app/test-alb.jar

EXPOSE 8092

CMD ["java", "-jar", "test-alb.jar"]