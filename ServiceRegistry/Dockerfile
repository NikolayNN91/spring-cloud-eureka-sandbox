FROM alpine

RUN apk add openjdk8-jre

COPY ./target/ServiceRegistry-1.0-SNAPSHOT.jar .

EXPOSE 8761/tcp

ENTRYPOINT ["java", "-jar", "ServiceRegistry-1.0-SNAPSHOT.jar"]

#docker run -p 8761:8761 --rm -t discovery