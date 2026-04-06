# 🚀 Task Management API (Spring Boot)

A simple RESTful API built using Spring Boot that allows users to manage tasks with basic CRUD operations.

---

## 📌 Features

* ✅ Create Task
* ✅ Get All Tasks
* ✅ Delete Task
* ✅ Update Task
* ✅ Input Validation
* ✅ Global Exception Handling

---

## 🛠️ Technologies Used

* Java 17
* Spring Boot
* Spring Web
* Maven
* Postman (for testing APIs)

---

## 📂 Project Structure

```
src/main/java/com/hazem/demo
│
├── controller
├── service
├── repository
├── model
└── DemoApplication.java
```

---

## ⚙️ How to Run

1. Clone the repository:

```
git clone https://github.com/your-username/your-repo-name.git
```

2. Navigate to the project folder:

```
cd your-repo-name
```

3. Run the project:

```
mvn spring-boot:run
```

4. Open in browser:

```
http://localhost:8080
```

---

## 🔗 API Endpoints

### ➤ Get All Tasks

```
GET /tasks
```

---

### ➤ Add Task

```
POST /tasks
```

Body:

```json
{
  "title": "Learn Spring Boot"
}
```

---

### ➤ Delete Task

```
DELETE /tasks/{index}
```

---

### ➤ Update Task

```
PUT /tasks/{index}
```

---

## 🧪 Testing

You can test the API using:

* Postman
* Thunder Client

---

## 🎯 Future Improvements

* 🔹 Connect to Database (MySQL)
* 🔹 Add Authentication (Spring Security)
* 🔹 Build Frontend UI

---

## 👨‍💻 Author

**Hazem Mohammed**

---

## ⭐ Don't forget to star the repo if you like it!
