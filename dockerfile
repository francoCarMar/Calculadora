FROM openjdk:17
VOLUME /tmp
EXPOSE $PORT
ADD ./target/calculadora-0.0.1-SNAPSHOT.jar app.jar
ENV PORT 8080
EXPOSE 8080
ENTRYPOINT [ "java","-jar", "/app.jar" ]