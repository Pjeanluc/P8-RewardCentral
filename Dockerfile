FROM openjdk:8-jdk-alpine
LABEL maintener="jl.protois.perso@gmail.com"
EXPOSE 8081
ARG JAR_FILE=build/libs/RewardCentral-1.0-SNAPSHOT.jar
ADD ${JAR_FILE} RewardCentral.jar
ENTRYPOINT ["java","-jar","/RewardCentral.jar"]