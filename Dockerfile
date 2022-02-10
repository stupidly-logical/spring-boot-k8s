FROM openjdk:11-jre-slim

WORKDIR /app

COPY target/spring-boot-k8s-0.0.1-SNAPSHOT.jar /app/app.jar
COPY run.sh /app/run.sh

EXPOSE 8080
ENTRYPOINT ["/app/run.sh"]