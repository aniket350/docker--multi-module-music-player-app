FROM openjdk:11
ADD ./target/ConfigurationServer-0.0.1-SNAPSHOT.jar /usr/src/ConfigurationServer-0.0.1-SNAPSHOT.jar
WORKDIR usr/src
ENTRYPOINT ["java","-jar","ConfigurationServer-0.0.1-SNAPSHOT.jar"]