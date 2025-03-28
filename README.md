
Overview

This is a Spring Boot application that manages employee details using a REST API. The project uses Spring Boot, Spring Data JPA, and AOP-based logging to monitor service layer method executions.

Prerequisites

Before running the application, ensure you have the following installed:

Java 17 or later

Eclipse IDE with Spring Boot support

Maven

An in-memory database like H2

Git

How to Run the Application in Eclipse

Clone the repository

git clone https://github.com/vishmemy/vishnu_p.git
cd vishnu_p

Open Eclipse and Import the Project

Go to File > Import.

Select Existing Maven Projects.

Browse to the cloned project directory and click Finish.

Update Maven Dependencies

Right-click on the project in the Package Explorer.

Select Maven > Update Project.

Run the Application

Open Application.java.

Right-click and select Run As > Spring Boot App.

The application will start on http://localhost:9000.

API Endpoints

1. Get Employee by ID

Request:

GET /employees/{id}

Response:

{
    "id": 1,
    "name": "John Doe",
    "department": "HR",
    "salary": 50000
}

2. Add a New Employee

Request:

POST /employees/add

Request Body:

{
    "id": 2,
    "name": "Jane Smith",
    "department": "IT",
    "salary": 60000
}

Response:

{
    "id": 2,
    "name": "Jane Smith",
    "department": "IT",
    "salary": 60000
}

3. Update an Employee

Request:

PUT /employees/update

Request Body:

{
    "id": 1,
    "name": "John Doe",
    "department": "Finance",
    "salary": 55000
}

Response:

{
    "id": 1,
    "name": "John Doe",
    "department": "Finance",
    "salary": 55000
}

4. Delete an Employee

Request:

DELETE /employees/delete

Request Body:

{
    "id": 1,
    "name": "John Doe",
    "department": "Finance",
    "salary": 55000
}