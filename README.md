# Library Management System
**JavaFX & Spring Boot – Technical Assessment**

This project is a **Library Management System** developed as part of a **Java Developer Role Suitability Test**.  
It consists of a **Spring Boot backend** that exposes REST APIs for managing books and is designed to integrate with a **JavaFX user interface**.

---

## ✨ Functionality

- Add new books
- View all books
- Update book details
- Delete books
- REST-based backend architecture

---

## 🛠 Technologies Used

- Java
- Spring Boot
- Spring Data JPA
- Hibernate
- Lombok
- Maven
- JavaFX (Frontend)

---

## 📘 Book Model

Each book contains:
- `id`
- `title`
- `author`
- `publishedDate`
- `isbn`

---

## 🔗 API Endpoints

Base URL:

| Method | Endpoint         | Description      |
|------|------------------|------------------|
| POST | `/api/book`      | Create book      |
| PUT  | `/api/book/{id}` | Update book      |
| DELETE | `/api/book/{id}` | Delete book     |
| GET  | `/api/book`      | View all books   |

---
👤 Author

Chioma Nwadozie
Java Backend Developer
## ▶️ Running the Backend

```bash
mvn spring-boot:run
http://localhost:8080
