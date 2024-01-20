# Student CRUD Application

This is a simple CRUD (Create, Read, Update, Delete) application for managing student records using Java, Spring Boot, Spring Data JPA, and Oracle JDBC.

## Prerequisites

Before running the application, ensure you have the following installed:

- Java Development Kit (JDK) - [Download and Install JDK](https://www.oracle.com/java/technologies/javase-downloads.html)
- Maven - [Download and Install Maven](https://maven.apache.org/download.cgi)
- Oracle Database - Make sure you have access to an Oracle database, and configure the connection details in `application.properties`.

## Getting Started

1. Clone the repository:

    ```cmd
    git clone https://github.com/yourusername/student-crud.git
    ```

2. Navigate to the project directory:

    ```cmd
    cd student-crud
    ```

3. Build and run the application:

    ```cmd
    mvn spring-boot:run
    ```

4. Access the application in your browser:

    ```
    http://localhost:8080
    ```

## Configuration

Configure the database connection in the `src/main/resources/application.properties` file:

```properties
# Database Configuration
spring.datasource.url=jdbc:oracle:thin:@localhost:1521:xe
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.datasource.driver-class-name=oracle.jdbc.OracleDriver

# Hibernate Configuration
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
