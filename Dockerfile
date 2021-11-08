# DOCKER FILE PARA API DE HR- Se neesita un artefacto jar, se especifica el nombre en el argumento ARTIFACT
# docker build -t docker-hr-api .
# docker run --rm -p 8080:8080 -d docker-hr-api

FROM maven:3.6.3-openjdk-11-slim as BUILDER
ARG ARTIFACT=human_resources_jar/human_resources.jar
WORKDIR /build/
COPY pom.xml /build/
COPY src /build/src/

RUN mvn clean package
COPY out/artifacts/${ARTIFACT} target/application.jar

FROM openjdk:11.0.11-jre-slim
WORKDIR /app/

COPY --from=BUILDER /build/target/application.jar /app/
CMD java -jar /app/application.jar
