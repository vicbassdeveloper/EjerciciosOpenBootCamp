FROM openjdk:17
COPY "./target/spring-deploy-1.0.jar" "app.jar"
EXPOSE 8086
ENTRYPOINT ["java","-jar","app.jar"]