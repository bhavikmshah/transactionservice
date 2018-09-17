#using openjdk 10 as base image
FROM openjdk:10
COPY target/transaction-service.jar /transaction-service.jar
CMD ["java", "-jar","/transaction-service.jar"]
EXPOSE 8006