# RestTemplateExam

An Exam with JPA and RestTemplate
Class Team works with Repositories and showing field of their Players, Using MySQL and pom.xml for the repositories.
in this exam we needed to update the old project to new SDK and implement the new up to date Repositories versions
as well as the application.properties so it could get a clean connection to our MySQL.
We needed to build REST API so we could work with HTTP (we used Swagger in this exam)
So we can pass the test we needed to:
1. get the right SDK and clean connection to MySQL (DB)
2. check the pom.xml for the right version for the repositories
3. add dependecy for the spring-boot-starter-web
4. creating a new PlayerList with List of players getter and setters,
craete a RestController for the Player Class which does:
- Adding a player and return the player ID
- Getting a player by ID
- getting all players
- getting all player by Name
5. Building a test with RestTemplate for creating Players and showing them with the REST-API
6. Adding swagger-ui for our Exam - update the pom.xml with the right dependecy - and creating the right configuration for Swagger.
