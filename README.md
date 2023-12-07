This is a simple SpringBoot project made with Spring initalizr

Did this to try learning how to create a project that uses a relational database for learnings sake.

Followed a youtube tutorial: https://youtu.be/foARzSz_1WU

Had an issue where the spring project would not start but I figured out it was beacuse my project did not load a database port automatically in the application.properties file so that has to be done. Good to know.

There are a total of 5 classes:
1. MysqlinitApplication 
2. StudentService
3. StudentRepository
4. StudentController
5. Student

###
**MysqlinitApplication**

Is used as a starting point of Springboot.

###
**StudentService**

This is a service so a indermediary between the repository and controller

###
**StudentRepository**

Repository used for communication between data so in this case communication with mySql.


###
**StudentController**

This is where all the REST controllers are located which are basically functions used for comunication and giving http request such as get,post, delete and so on.

###
**Student**

This is where we have the defenition of everything required for the server so the application knows what it needs.


**I HAVE NO IDEA WHAT I'M DOING**