FROM openjdk
MAINTAINER Ariv <arivbits@gmail.com>
ADD target/docker-ci-example.jar docker-ci-example.jar
ENTRYPOINT ["java", "-jar", "/docker-ci-example.jar"]
EXPOSE 2222