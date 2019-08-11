FROM openjdk:11
ADD ./target/eurekaa-server-0.0.1-SNAPSHOT.jar /usr/src/eurekaa-server-0.0.1-SNAPSHOT.jar
WORKDIR usr/src
ENTRYPOINT ["java","-jar","eurekaa-server-0.0.1-SNAPSHOT.jar"]