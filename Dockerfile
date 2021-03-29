FROM openjdk:8
EXPOSE 8080
ADD target/simple-project.jar simle-project.jar 
ENTRYPOINT ["java","-jar","/simple-springboot-docker.jar"]