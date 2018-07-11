# portfolio
## Maven
mvn clean install
## Docker
### build
docker build . --build-arg JAR_FILE=./target/portfolio-0.0.1-SNAPSHOT.jar -t cinnojam/portfolio:latest
### run
docker run -d -p 8080:8080 cinnojam/portfolio:latest
### test
curl http://localhost:8080/portfolio/issuers
### stop
docker ps
docker stop <container id>
### tag
docker tag portfolio cinnojam/portfolio:latest
### share: docker push <user name>/<repo name>:<tag name>
docker login -u user -p pwd
docker push cinnojam/portfolio:latest
## Docker Compose
### build
docker-compose build
### run
docker-compose up
### test
curl http://localhost:8080/portfolio/issuers
### stop
docker-compose down
### share
docker-compose push
