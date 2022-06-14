FROM alpine

RUN apk add openjdk8-jre

COPY ./target/not-registered-client-1.0-SNAPSHOT.jar .

EXPOSE 8081/tcp

ENTRYPOINT ["java", "-jar", "not-registered-client-1.0-SNAPSHOT.jar"]

#docker run -p 8081:8081 --rm -t nrservice