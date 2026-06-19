# User Management System

A full-stack **User Management System** built with **Spring Boot**, **React.js**, **MySQL**, and **Docker**. The application provides a secure and scalable platform for managing users, authentication, and role-based access through a modern web interface.

---

## 🚀 Features

* User registration and login
* Secure authentication and authorization
* Role-based access control (Admin/User)
* Create, view, update, and delete (CRUD) users
* Search and manage user records
* Responsive and user-friendly interface
* RESTful API architecture
* MySQL database integration
* Dockerized application for easy deployment

---

## 🛠️ Tech Stack

### Frontend

* React.js
* HTML5
* CSS3
* JavaScript
* Axios

### Backend

* Spring Boot
* Spring Web
* Spring Data JPA
* Spring Security
* Maven

### Database

* MySQL

### DevOps

* Docker
* Docker Compose

### Tools

* Git & GitHub
* Postman
* IntelliJ IDEA / VS Code

---

## 📂 Project Structure

```text
user-management-system/
│
├── backend/ UserManagementSystem             # Spring Boot application
│   ├── src/
│   ├── pom.xml
│   └── Dockerfile
│
├── frontend/   user-frontend               # React application
│   ├── src/
│   ├── package.json
│   └── Dockerfile
│
├── docker-compose.yml
└── README.md
```

---

## ⚙️ Prerequisites

Before running the project, make sure you have:

* Java 17 or later
* Node.js 18+
* MySQL 8+
* Maven
* Docker
* Docker Compose

---

## 🚀 Running the Application

### Option 1: Run with Docker (Recommended)

Clone the repository:

```bash
git clone https://github.com/Samruddhi-Warake/UserManagementSystem.git
cd user-management-system
```

Build and start the containers:

```bash
docker compose up --build
```

The application will be available at:

* Frontend: `http://localhost:3000`
* Backend API: `http://localhost:8080`

---

### Option 2: Run Without Docker

#### Backend

```bash
cd backend
mvn spring-boot:run
```

#### Frontend

```bash
cd frontend
npm install
npm start
```

Ensure MySQL is running and update your database configuration in the Spring Boot application properties.

---

## 🗄️ Database

The application uses **MySQL** as the primary database.

Configure your database connection in:

```properties
application.properties
```

Example:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/sitdemo
spring.datasource.username=root
spring.datasource.password=root

spring.jpa.hibernate.ddl-auto=update
```

---

## 📡 REST API

Example endpoints:

| Method | Endpoint             | Description         |
| ------ | -------------------- | ------------------- |
| POST   | `/api/auth/register` | Register a new user |
| POST   | `/api/auth/login`    | Authenticate user   |
| GET    | `/api/users`         | Get all users       |
| GET    | `/api/users/{id}`    | Get user by ID      |
| PUT    | `/api/users/{id}`    | Update user         |
| DELETE | `/api/users/{id}`    | Delete user         |

---

## 🔒 Security

* Spring Security
* Password encryption
* Role-based authorization
* Protected REST APIs

---

## 🐳 Docker

The project includes:

* Dockerfile for the Spring Boot backend
* Dockerfile for the React frontend
* Docker Compose configuration for running the complete application

Start all services with:

```bash
docker compose up --build
```

Stop all services:

```bash
docker compose down
```

---

## 📸 Screenshots

Add screenshots of your application here.

---





