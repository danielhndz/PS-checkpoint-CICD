FROM jdk:11
EXPOSE 8081
ADD target/checkpoint-cicd.jar checkpoint-cicd.jar
ENTRYPOINT [ "java", "-jar", "checkpoint-cicd.jar"]