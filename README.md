# travis-CI-demo


Automated testing with travis-CI

1. create .travis.yml file:


        language: java
        jdk:
          - openjdk8

        script: ./mvnw clean install


        jobs:
          include:
            - stage: Test
              script: ./mvnw clean test
