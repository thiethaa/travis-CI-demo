FROM openjdk:latest
ADD target/demo-travis-ci.jar demo-travis-ci.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","demo-travis-ci.jar"]