# Start with a base image
FROM openjdk:8

# Add Maintainer Info
LABEL maintainer="Justin Bende"

#Copy all target files
COPY target/mediscreen-history-0.0.1-SNAPSHOT.jar /home/historyMS/

EXPOSE 8082

# Run the jar file
ENTRYPOINT ["java","-jar","/home/historyMS/mediscreen-history-0.0.1-SNAPSHOT.jar"]