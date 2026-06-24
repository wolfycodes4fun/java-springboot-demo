**JAVA Spring Boot**

A quick go through on the workings/architecture on setting up a Springboot project and how they work.

Initially 3 layers are presented:  
    1) API Layer/ Controller Layer: Defines routes and request types (ex- GET, POST...) & more  
    2) Service Layer: Where the business logic sits  
    3) Data Access Layer  

The project structure reflects on the above layers as follows:
    1) api/ directly interacts with the client and is responsible for validating the request  
    2) service/ holds all the business logic  
    3) dao/ known as the repository is responsible for the communication with the database by handling the raw SQL or NoSQL queries   
    4) model/ defines how the data looks like  