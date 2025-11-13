# Planora — Event Management System 

**Author:** Faith Chigomezgo Ngwata
* **Course:** Java Programming — [sem 3/ Year 2]
* **Contact:** [---www.linkedin.com/in/faith-ngwata-97b1a331a]
* **Project Type:** Java (OOP + JDBC) — **GUI (JavaFX/Swing)**

---

##  Project Overview
Planora is a comprehensive Java-based event management system that enables users and administrators to create, manage, and book events. The system demonstrates core **Object-Oriented Programming (OOP) concepts** (encapsulation, inheritance, polymorphism, abstraction) and uses **JDBC** to persist data in a relational database.


##  Features (Planned / Implemented)
* **Role-Based Access:** User registration and access control for **Admin** and **Standard User** roles.
* **Event Management:** Functionality to create, update, and delete events.
* **Booking System:** Users can book available events and view their past and upcoming bookings.
* **Data Persistence:** Uses **JDBC** with a **MySQL** database for reliable data storage.
* **Code Quality:** Modular design with well-commented Java code demonstrating best practices.

---

##  Project Structure
The project follows a standard MVC-like architecture for Java applications:
Planora/
├── src/
│ └── com/planora/
│ ├── model/ # DTOs: Event, User, Booking
│ ├── dao/ # DAO classes: EventDAO, UserDAO, BookingDAO
│ ├── util/ # DBConnection.java, helpers
│ └── main/ # App launcher / GUI
├── db/
│ └── planora_schema.sql
├── docs/
│ └── planora_presentation.pdf
├── .gitignore
└── README.md

##  How to Run Locally

### Prerequisites
1.  **Java JDK 17+** installed.
2.  **MySQL Server** (or equivalent local database).
3.  The **MySQL Connector/J JAR** file (needed for JDBC connection).

### Setup Steps
1.  **Database Setup:**
    * Log into your MySQL server.
    * Create the database (e.g., `CREATE DATABASE planora;`).
    * Run the schema script located at `db/planora_schema.sql` to create the necessary tables (`users`, `events`, `bookings`).
2.  **Configuration:**
    * Place the **MySQL Connector/J JAR** file in your project's build path/library folder.
    * Update the database connection details (URL, username, password) in `src/com/planora/util/DBConnection.java`.

### Execution
* **Using VS Code:** Simply select the main class (`src/com/planora/main/Main.java`) and click the **▶ Run** button provided by the Java extension.
* **Using Terminal (Advanced):**
    ```bash
    # 1. Compile the Java files, including the required JDBC driver in the classpath
    javac -d out -cp "path/to/mysql-connector-java.jar" src/com/planora/main/Main.java src/**/*.java
    # 2. Execute the compiled application
    java -cp "out:path/to/mysql-connector-java.jar" com.planora.main.Main
    ```
    *(Note: Adjust the classpath separator (e.g., ':' for Unix/Mac, ';' for Windows) and replace the JAR path.)*

---

##  Documentation and Presentation
Please refer to `docs/planora_presentation.pdf` for detailed architecture diagrams (UML), the Entity-Relationship (ER) diagram, and application screenshots.

---

##  Future Work
* Integrate a robust **GUI** (JavaFX or Swing) for a better user experience.
* Implement comprehensive **unit tests** for DAO and utility layers.
* Add logging capabilities using a framework like Log4j.
* Create detailed deployment instructions.

---

##  License
This project is for academic purposes.