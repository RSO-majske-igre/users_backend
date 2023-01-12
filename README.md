# Users Backend

Payments backend microservice stores data about all payments and creates payment requests in external source (Stripe).

## Production version

BaseUrl: http://34.168.57.248:8110/

Swagger: http://34.168.57.248:8110/swagger-ui/index.html

## DockerHub

[https://hub.docker.com/r/bizjak3/users_backend](https://hub.docker.com/r/bizjak3/users_backend)

## Running DEV server
1. Compile `mvn package`
2. Run fatjar `java -jar ./api/target/api-0.0.1-SNAPSHOT.jar`
