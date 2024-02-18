FROM openjdk:17
# Set the working directory inside the Docker container
WORKDIR /app
# and the target/mortgagecalculator-0.0.1-SNAPSHOT.jar file exists.
COPY target/mortgagecalculator-0.0.1-SNAPSHOT.jar mortgagecalculator.jar
# uses a different port.
EXPOSE 6060

# Command to run the application
ENTRYPOINT ["java","-jar","mortgagecalculator.jar"]
