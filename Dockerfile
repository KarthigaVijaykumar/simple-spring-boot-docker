FROM openjdk:8
EXPOSE 8080
ADD target/simple-springboot-docker.jar simple-springboot-docker.jar
ENTRYPOINT ["java","-jar","/simple-springboot-docker.jar"]
