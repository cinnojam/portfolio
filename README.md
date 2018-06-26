# portfolio
## Docker
### build
docker build . --build-arg JAR_FILE=./target/portfolio-0.0.1-SNAPSHOT.jar -t portfolio
### run
docker run -d -p 8080:8080 portfolio
### test
curl http://localhost:8080/issuers
### stop
docker ps
docker stop <container id>
### tag
docker tag exercise cinnojam/cinnojam:exercise
### share: docker push <user name>/<repo name>:<tag name>
docker login -u user -p pwd
docker push cinnojam/cinnojam:portfolio
