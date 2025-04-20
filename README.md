
# 📋 Simple Board Application (JSP + Servlet + Spring MVC)

## 📌 Project Overview

This project is a practice application that implements a simple bulletin board using JSP based on the Spring MVC framework.  
The project is structured following the MVC architecture, clearly separating the Controller, Service, DAO, and DTO layers.  
It aims to solidify the fundamentals of Spring MVC through hands-on experience.

---

## ⚙️ Tech Stack

- Java 21
- Spring Boot 3.4.4
- JSP / Servlet
- Spring MVC
- Gradle
- Embedded Tomcat 10
- JSTL

---

## 📄 Core Features

| Feature | URL/Action |
|:---|:---|
| View post list | `/board/list` |
| Navigate to post creation form | `/board/write` |
| Save a new post | `POST /board/write` |
| View post details | `/board/view?id={id}` |

---

## 🏗️ Project Structure

```
src/
 └── main/
     ├── java/
     │    └── com.mvc.jspservletspringmvc
     │         ├── controller
     │         │     └── BoardController.java
     │         ├── service
     │         │     └── BoardService.java
     │         ├── dao
     │         │     └── BoardDAO.java
     │         └── dto
     │               └── Board.java
     ├── resources/
     │    └── application.properties
     └── webapp/
          └── WEB-INF/
               └── views/
                    └── board/
                         ├── list.jsp
                         ├── view.jsp
                         └── write.jsp
```

---

## 🔥 Key Learning Points

- Understanding the core flow of Spring MVC architecture
- Practicing dependency injection (DI) using constructor-based injection
- Dynamic data rendering using JSP and JSTL
- Managing dependencies with Gradle

---

## 🚀 How to Run

1. Clone the repository:
   ```bash
   git clone https://github.com/jyoungmin-com/JSP-Servlet-SpringMVC.git
   ```
2. Open the project with an IDE (e.g., IntelliJ IDEA).
3. Refresh the project as a Gradle project.
4. Run the `JspServletSpringMvcApplication` class.
5. Access the application at:  
   [http://localhost:8080/board/list](http://localhost:8080/board/list)

---

## 🤝 Notes

- No database connection is implemented; posts are stored in memory (using a simple List).
- For production environments, DAO must be modified to connect to an actual database.

---

## 📚 Personal Reflection

Through this project, I was able to directly experience the end-to-end request-response flow of Spring MVC —  
from Controller → Service → DAO → View — and deeply understand how the MVC layers collaborate.

Building this application helped me grasp the overall structure and lifecycle of JSP, Servlet, and Spring MVC.

Practicing clear separation of concerns through the MVC pattern emphasized the importance of maintainability and scalability in code design.

Moving forward, I plan to challenge myself with more modern stacks (such as REST APIs, Thymeleaf, and full-stack development) to continuously improve my skills.

---
