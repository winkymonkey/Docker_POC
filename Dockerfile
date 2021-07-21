FROM java:8
WORKDIR /app
ADD target/Docker_POC-0.0.1-SNAPSHOT.jar MyTestDocker.jar
CMD java -jar MyTestDocker.jar
