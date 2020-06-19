# Start with a base image
FROM openjdk:8

# Add Maintainer Info
LABEL maintainer="Justin Bende"

#Copy all target files
COPY target/mediscreen-patient-0.0.1-SNAPSHOT.jar /home/patientMS/

EXPOSE 8081

# Run the jar file
ENTRYPOINT ["java","-jar","/home/patientMS/mediscreen-patient-0.0.1-SNAPSHOT"]