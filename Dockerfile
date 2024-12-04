FROM openjdk:11

EXPOSE 8080

ADD target/simple-docker-postgresql.jar simple-docker-postgresql.jar

ENTRYPOINT ["java","-jar","simple-docker-postgresql.jar"]