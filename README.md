# Consultdadd_SpringBootAssignment

The Inventory Management System is a Spring Boot application designed to manage inventory items efficiently. It provides RESTful APIs for adding, updating, retrieving, and deleting items from the inventory.

Spring Boot (Spring Web, Spring Data JPA, Hibernate)
MySQL (MYSQL Connector and JDBC Driver) MYSQL server running on localhost at port 3306 
Maven (For Dependency Management)
Lombok (For reducing the boiler plate code)
Jakarta Validation (For Request Body field parameter validations for POST and PUT requests)
HikariCP (For Database Connection Pooling)

Setup Instructions
Clone the Git Repository using git clone git@github.com:NickReddy49/Consultdadd_SpringBootAssignment.git
cd to Inventory-Management-System directory to load the pom.xml file in IntelliJ IDEA

Configure the Database using application.properties

spring.application.name=Inventory-Management-System
spring.datasource.url=jdbc:mysql://localhost:3306/inventorymanagement
spring.datasource.username=root123
spring.datasource.password=root123
spring.jpa.hibernate.ddl-auto=create-drop
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

Build and Run the Application from command line
mvn clean install
mvn spring-boot:run

Controller Mappings 
POST - add an Item to Database - /items/addItem

Sample POST Request format - 

{
    "QUANTITY":10,
    "NAME":"Tomatoes",
    "DESCRIPTION":Fresh Delecious Tomatoes
}

PUT - update an Item Quantity only to Databse items/updateItemQuantity/
Parameters - @ResponseBody Item item - Request body mapped to item class object

GET /items/getItems - Get all items

GET /items/getItem/{id} - Get Item By Id

PUT /items/updateItemQuantity - Update Item Quantity for a particular id

PUT /items/udateItemById/{id} - Update the Item Based on Id

DELETE /items/deleteById/{id} - Delete based on the Specific Id

DELETE /items/deleteAllItems - Delete all the Items

Exception Handling
Added @Validation on RestController Class for Validating the POST and PUT requests , included @Valid Annotation on the RequestBody to Validate the Fields for the value Constraints , if any Values are not matching then the Exception is thrown which is handled in Exception Handler
