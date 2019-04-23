FROM maven:3-jdk-8
COPY . /app
ADD ./target/TechPublishing-0.0.1-SNAPSHOT.war tech.war
ENTRYPOINT ["java","-jar","tech.war"]
