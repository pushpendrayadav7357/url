# Visitor Count App

This is a simple web application built using **Spring Boot** to track and display URL hit counts for both the total visitors and individual users.

## Frameworks and Language Used

- **Framework**: Spring Boot
- **Language**: Java

## Data Flow

### Controller

- The controller layer is responsible for handling incoming HTTP requests and managing the data flow.
- In this project, the controller class `UrlHitController` defines the following endpoints:
    - `/count` (GET): Retrieves the total hit count.
    - `/username/{username}/count` (GET): Retrieves the hit count for a specific user.

### Services

- The service layer contains the business logic of the application.
- In this project, the `UrlHitService` class provides methods for incrementing and retrieving hit counts.
- Service methods:
    - `incrementHitCount()`: Increments the total hit count.
    - `getUserHitCount(String username)`: Retrieves the hit count for a specific user.

### Repository

- The repository layer is not used in this simple project. In more complex projects, it can be used for data storage and retrieval from a database.

### Database Design

- No database is used in this project as it's designed to be a simple URL hit counter.

## Data Structure Used

- The project uses a simple data structure to store hit counts.
- The total hit count is stored as an integer variable.
- User-specific hit counts are stored in a `Map<String, Integer>`, where the key is the username, and the value is the hit count.

## Project

- This project provides a basic example of how to create a URL hit counter in a Spring Boot application.
- It includes controller and service layers to handle hit count tracking.
