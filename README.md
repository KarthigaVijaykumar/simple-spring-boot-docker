# simple-spring-boot-docker
Containerized first simple spring boot application in docker (Without any business logic and DB)
-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
Add the following lines in the application.java file to run the api in the browser without any business logic and database.
---------------------------------------------------------------------------------------------------------------------------

@RestController

	@GetMapping("/message")
	public String getMessage() {
		return "Dockerizing first simple spring boot application";
	}

---------------------------------------------------------------------------------------------------------------------------------------------------------------------------
Create image for the spring boot app
-----------------------------------------

Create the Dockerfile as mentioned in the project.

Create the jar by giving mvn install.

Now build the image for your spring boot app

-> docker build -t simplespringbootapp .

[Here simplespringbootapp is the name of the image yu are creating]

Now the image will be created.

-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
 Create the Container of the spring boot app by running the image
 -----------------------------------------------------------------
 
 ->docker run -p 9090:8080 simplespringbootapp.
 
 Now the container will be created and running in the docker.
 
 Yu can access the port, in my case it is 9090 to see the message from the api[http://localhost:9090/message].
 
 The message will be visible in the port that yu have exposed.

-------------------------------------------------------------------------------------------------------------------------------------------------------------------------
Push the image to the dockerhub
--------------------------------

Login into dockerhub and create a repo by giving a name and description.

Login to dockerhub from git bash.

-> docker tag 7ea177a06178 karthigavijaykumar/simple-spring-boot-application:latest

[Here the number specified is the image id and the nextone is the repo name with tag]

->docker push karthigavijaykumar/simple-spring-boot-application







