# Spring-Cloud-Eureka-Naming-Server

This is Spring Cloud Netflix Eureka-Naming-Server configuration. There are 2 profile has been configure in this Sping-Boot project. To Build and Deploy this project in the production we need to follow hte following command.

1) Download the project from the git or clone this project in our local git repository.
2) Export the project in the Eclipse or the spring-tool-suite IDE.
3) Install the spring-tool-suite with your IDE (Eclipse).
4) Then Right-Click on the project. Go to "Run-As" and click "Maven-clean".
5) Then Right-Click on the project. Go to "Run-As" and click "Maven-Install".
6) Go to the "Target" path of your project and copy the the jar "rsmortgage-service-discovery-high-availability-1.0.jar"
7) Make another version of that jar rsmortgage-service-discovery-high-availability-2.0.jar
8) Copy those 2 jar in a new folder. 
9) Open 2 differnt terminals (Unix/Linux BOX). Go inside the directory where jar are located. 
10) In the 1st terminal run the follwoing command- "java -jar -Dspring.profiles.active=eureka-host1 rsmortgage-service-discovery-high-availability-1.0.jar". (This will active the 1st profile in the eureka server.)
11) And in the 2nd terminal run the following command- "java -jar -Dspring.profiles.active=eureka-host2 rsmortgage-service-discovery-high-availability-2.0.jar". (This will active the 2nd profile in the eureka server.)
12) Now open any browser and hit the following url- "http://localhost:8761/". 
13) And in the new tab of the browser hit the follwoing url- "http://localhost:8762/".
14) Add the eureka-host1 and eureka-host2 to the /etc/hosts file. Then http://eureka-host1:8761/ and http://eureka-host2:8762/
will work.

Now we can see two profile of Eureka-Naming-Server is up and running. 

Following tools we are using to build and deploy this Eureka-Naming-Server
1) Spring-Boot.
2) Spring-Cloud.
3) Spring-Cloud-Netflix-Eureka.
4) Spring-Boot-Starter-Web.
5) Spring-Boot-Actuator.
