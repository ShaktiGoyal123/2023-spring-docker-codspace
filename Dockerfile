FROM openjdk:20-ea-11-oraclelinux8
EXPOSE 8095
ADD target/demo-0.0.1-SNAPSHOT.jar demo-service-docker
ENTRYPOINT ["java","-jar","demo-service-docker"]
