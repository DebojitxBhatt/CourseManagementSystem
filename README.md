# CourseManagementSystem
# 📚 Course Enrollment System

A full-stack course management application built using **Spring Boot (Maven)**, **React.js + Material UI**, and **PostgreSQL**.

---

## ⚙️ Tech Stack

- **Frontend**: React.js + Material-UI
- **Backend**: Spring Boot (Maven)
- **Database**: PostgreSQL
- **ORM**: JPA (Hibernate)

---

## ✅ Features

- View all courses
- Search courses by name/instructor
- Add new courses
- Edit existing courses

More features like pagination, input validation, authentication, and enrollment will be added soon!

---

## 🚀 Setup Instructions (Local Environment)

### 📌 Prerequisites

Make sure you have the following installed:

- [Node.js](https://nodejs.org/) (v20+)
- [Java](https://adoptium.net/) (v24+)
- [Maven](https://maven.apache.org/)
- [PostgreSQL](https://www.postgresql.org/) (v17+)

---

### 🗄️ Database Setup (PostgreSQL)

1. Start PostgreSQL server.
2. Create a database named `course_db` (or modify the name in `application.properties`).
3. Optionally, create a user and grant privileges.

```sql
CREATE DATABASE course_db;
CREATE USER course_user WITH PASSWORD 'password';
GRANT ALL PRIVILEGES ON DATABASE course_db TO course_user;
```

4. Update your `src/main/resources/application.properties` with:

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/course_db
spring.datasource.username=course_user
spring.datasource.password=password
spring.jpa.hibernate.ddl-auto=update
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect
```

---

## 🖥️ Backend (Spring Boot)

1. Open a terminal in the `/backend` directory.
2. Run the following command:

```bash
./mvnw spring-boot:run
```

Or with global Maven installed:

```bash
mvn spring-boot:run
```

The server will start on `http://localhost:6969`.

---

## 🌐 Frontend (React.js + MUI)

1. Open a terminal in the `/frontend` directory.
2. Install dependencies:

```bash
npm install
```

3. Start the development server:

```bash
npm run dev
```

The app will run at `http://localhost:5173`.

---

## 📋 API Endpoints

| Method | Endpoint                   | Description                |
|--------|----------------------------|----------------------------|
| GET    | `/api/courses`             | Get all courses            |
| GET    | `/api/courses/search`      | Search courses             |
| GET    | `/api/courses/{id}`        | Get course by ID           |
| POST   | `/api/courses`             | Create a new course        |
| PUT    | `/api/courses/{id}`        | Update a course            |
| DELETE | `/api/courses/{id}`        | Delete a course            |

---

## 📌 Project Structure

```
project-root/
├── backend/                # Spring Boot backend
│   └── src/
│       └── main/
│           ├── java/
│           └── resources/
├── frontend/               # React frontend
│   └── src/
├── README.md
├── .gitignore
└── ...
```

---

## 🧪 Coming Soon (Planned Features)

✅ Pagination with GET /courses?page=&limit=

🔒 JWT-based authentication (register/login)

📄 Swagger/OpenAPI docs

📊 Sort/filter courses (by date, name, instructor)

🔁 Server-side filtering & efficient queries








