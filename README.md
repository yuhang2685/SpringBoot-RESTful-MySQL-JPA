## SpringBoot-RESTful-JPA

In this project we show how to construct a `RESTful` web service using `SpringBoot` and `JPA` for `MySQL`.

#### Author: Dr. YUHANG ZHAO

### Introduction

#### What is JPA?
The "Java Persistence API" (`JPA`) is a Java application programming interface (API) specification for accessing, persisting, and managing data between Java objects / classes and a relational database.

#### History (by Wiki)
Prior to the introduction of `EJB 3.0` specification, many enterprise Java developers used lightweight persistent objects, provided by either persistence frameworks (for example `Hibernate`) or data access objects instead of entity beans. 
This is because entity beans, in previous `EJB` specifications, called for too much complicated code and heavy resource footprint, and they could be used only in `Java EE` application servers because of interconnections and dependencies in the source code between `beans` and `DAO` objects or persistence framework. 
Thus, many of the features originally presented in third-party persistence frameworks were incorporated into the `Java Persistence API`, and, as of 2006, projects like `Hibernate` (version 3.2) and `TopLink Essentials` have become themselves implementations of the `Java Persistence API` specification. 

#### What does JPA do? (by Spring.io)
`Spring Data JPA` aims to significantly improve the implementation of data access layers by reducing the effort to the amount that’s actually needed. 
As a developer you write your repository interfaces, including custom finder methods, and `Spring` will provide the implementation automatically.

### Overview:
In this project we covered the following concepts: 
- Dependency `spring-boot-starter-data-jpa`
- `DB` configuration using `application.properties`
- `JPA` interfaces `CrudRepository` and `JpaRepository`
- `@Entity`
- `@Id`
- `CRUD` using default `JPA` methods
- Customized `JPA` methods
- User defined `JPA` methods by `DB Query`
- Dependency `jackson` for `XML` format
- Content negotiation
- `Optional<>` type

### System Configuration:
- Windows 7
- Spring Boot v2.1.7.RELEASE
- MySQL Connector 8.0.17

### Related Projects
[SpringBoot-RESTful-MySQL](https://github.com/yuhang2685/SpringBoot-RESTful-MySQL),
which is a `RESTful` web-service for `HTTP CRUD` requests for data in `MySQL`.


### Reference: 
- "Rest API | Web Service Tutorial" by Telusko @ https://www.youtube.com/watch?v=BZi44GOD8kY
- "Spring Boot Tutorials | Full Course" by Telusko @ https://www.youtube.com/watch?v=35EQXmHKZYs
