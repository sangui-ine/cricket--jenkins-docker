FROM adoptopenjdk/openjdk11:alpine-jre
EXPOSE 8085
ADD target/cricket.jar cricket.jar

ENTRYPOINT ["java","-jar","cricket.jar"]