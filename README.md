# spring-cloud-feign-client
This project demonstrates how to use Feign Client in a Spring Boot application for making HTTP requests to RESTful services. Feign simplifies the process of writing HTTP clients by providing a declarative way to define API clients.

## Features

- Declarative REST client with Feign.
- Easy integration with Spring Cloud.
- Service discovery integration with Eureka (optional).

## Prerequisites

- Java 11 or higher
- Maven (for dependency management)
- Spring Cloud Dependencies


### Configure the Application

1. **Add Dependencies**:
   In your `pom.xml`, include the following dependencies:

   ```xml
   <dependency>
       <groupId>org.springframework.cloud</groupId>
       <artifactId>spring-cloud-starter-openfeign</artifactId>
   </dependency>
   <dependency>
       <groupId>org.springframework.cloud</groupId>
       <artifactId>spring-cloud-starter-eureka</artifactId> <!-- Optional, if using Eureka -->
   </dependency>


