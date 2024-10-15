FROM openjdk:17
COPY "./target/ClubLuz-1.jar" "app.jar"
EXPOSE 8080
ENTRYPOINT [ "java","-jar","app.jar" ]