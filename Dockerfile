FROM openjdk:11
EXPOSE 8082
ADD target/publisher-0.0.1-SNAPSHOT.jar publisher-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/publisher-0.0.1-SNAPSHOT.jar"]
