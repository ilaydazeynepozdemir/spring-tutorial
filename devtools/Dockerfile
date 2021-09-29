FROM java:8
VOLUME /tmp
ADD target/*.jar app.jar
EXPOSE 8080
EXPOSE 5005
RUN sh -c 'touch /app.jar'
ENTRYPOINT ["java","-agentlib:jdwp=transport=dt_socket,address=5005,server=y,suspend=n","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
