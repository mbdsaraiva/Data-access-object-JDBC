# 💾 Data Access with JDBC Project

This project focuses on exploring and implementing fundamental concepts of database access in Java using JDBC (Java Database Connectivity). The primary goal is to understand the core features of JDBC, establish a basic project structure for data access, and manually implement the Data Access Object (DAO) pattern.

## 🚀 About the Project

This project serves as a practical demonstration of how Java applications can interact with relational databases. It covers the essential steps for connecting to a database, executing SQL queries, and managing data through programmatic interfaces. The implementation emphasizes a structured approach to data access, laying the groundwork for more complex database operations and application architectures.




## 💻 Technologies and Concepts Used

This project utilizes the following technologies and concepts for database interaction:

### Core Technologies

*   **Java**: The programming language used for developing the data access layer.
*   **JDBC (Java Database Connectivity)**: The standard Java API for database access, providing a set of interfaces and classes for connecting to databases, executing SQL statements, and processing results.
*   **MySQL**: A popular open-source relational database management system used as the backend database for this project.
*   **MySQL Workbench**: A visual tool for database design, development, and administration, used for creating and managing the `coursejdbc` database.
*   **MySQL Java Connector**: The JDBC driver for MySQL, enabling Java applications to connect to MySQL databases.

### Database Operations and Concepts

*   **Database Connection Management**: Establishing and closing connections to the database efficiently.
*   **SQL Statements**: Executing various SQL commands, including:
    *   `SELECT`: Retrieving data from the database.
    *   `INSERT`: Adding new records to tables.
    *   `UPDATE`: Modifying existing records.
    *   `DELETE`: Removing records from tables.
*   **`Statement` and `PreparedStatement`**: Using `Statement` for simple SQL queries and `PreparedStatement` for parameterized queries to prevent SQL injection and improve performance.
*   **`ResultSet`**: Processing the results returned by `SELECT` queries, iterating through rows and retrieving column values.
*   **Transaction Management**: Implementing database transactions to ensure data integrity and consistency, using `setAutoCommit(false)`, `commit()`, and `rollback()`.
*   **Exception Handling**: Implementing custom exceptions like `DbException` and `DbIntegrityException` to handle database-related errors and maintain data integrity.

### Design Patterns

*   **DAO (Data Access Object) Pattern**: A structural design pattern that abstracts and encapsulates all access to the data source. In this project, the DAO pattern is implemented manually for each entity (e.g., `ClientDao`, `ProductDao`, `OrderDao`), with interfaces defining the data access operations.



