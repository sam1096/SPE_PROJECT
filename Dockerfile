FROM java:8
ADD ./target/TechPublishing-0.0.1-SNAPSHOT.jar tech.jar
ENTRYPOINT ["java","-jar","tech.jar"