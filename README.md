java-learn
===

Welcome! This small project is a petproject with the intention to create a Java Spring based Todo application (Backend). 
You are welcome to check out the source code, change it, try it, also please check the "Used tutorials / trainings" section where I'll list all the resources which I use(d) throughout the process. 

## Requirements
> I promise that I'll only push working code to the repository!

**Please be aware:** While the project requires explicitly Java11, in development time I'm using Java15. 

You'll need a Java IDE (I'm using [intelliJ IDEA](https://www.jetbrains.com/idea/)).  

## Planned features: 
 - REST API for the todos
 - Have a Postgres DB (Docker)
 - Have a basic authentication to avoid unwanted access

## Used tutorials / trainings
- [Learning Spring with Spring Boot](https://www.linkedin.com/learning/learning-spring-with-spring-boot-2) by [Frank Moley](https://www.frankmoley.com)
- [Spring Boot With H2 Database](https://www.baeldung.com/spring-boot-h2-database) by [baeldung](https://www.baeldung.com/author/baeldung/)

## Changelog
### 2021-01-14 
- Created the initial project
- Created an initial schema and added dummy data (SQL)
- Added [H2](https://h2database.com/html/main.html) to the project to have an in-memory database
- Created Entity and Repository classes for the Todos
- Created the first todo listing and todo adding endpoints
