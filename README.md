#TourGuide App
RewardCentral is a app to find reward.

## purpose
You can get reward for an attraction and a user

## Prerequisite to run

- Java 1.8 JDK
- Gradle 6.6.1
- Docker

## Run app (localhost:8081)

Spring Boot
~~~
mvn spring-boot:run (run app)
mvn spring-boot:stop (stop app)
~~~~

Gradle
```
gradle bootRun
```

## Containerize
to build the image
~~~
docker build - t rewardcentral .
~~~

To run the app : 
~~~
docker run -d -p 8081:8281 -- name rewardcentral rewardcentral
~~~

 ## Documentation
 DoDocumentation Postman [here](https://documenter.getpostman.com/view/10925968/TVYDdedS)
   
    