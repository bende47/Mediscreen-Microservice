# Start with a base image
FROM openjdk:8

# Add Maintainer Info
LABEL maintainer="Justin Bende"

#Copy all target files
COPY target/mediscreen-rapport-0.0.1-SNAPSHOT.jar /home/rapportMS/

EXPOSE 8083

# Run the jar file
ENTRYPOINT ["java","-jar","/home/rapportMS/mediscreen-rapport-0.0.1-SNAPSHOT.jar"]