FROM alpine

RUN apk add openjdk8-jre

COPY ./target/Service1-1.0-SNAPSHOT.jar .

EXPOSE 40000/tcp

ENTRYPOINT ["java", "-jar", "Service1-1.0-SNAPSHOT.jar"]

#docker run -p 40000:40000 --rm -t service1