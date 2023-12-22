FROM openjdk:8
EXPOSE 8081
ADD target/crd.jar crd.jar
ENTRYPOINT [ "java","-jar","/crd.jar" ]