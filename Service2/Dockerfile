FROM alpine

RUN apk add openjdk8-jre

COPY ./target/Service2-1.0-SNAPSHOT.jar .

EXPOSE 48080/tcp

#CMD ["/usr/bin/java", "-version"]

ENTRYPOINT ["java", "-jar", "Service2-1.0-SNAPSHOT.jar"]

#docker run -p 48080:48080 --rm -t service2