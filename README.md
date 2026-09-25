# 💼 Job Application Manager

A console-based Java application designed to help users manage and track their job applications.

The application provides a simple command-line interface for adding applications, searching companies, updating application statuses, deleting applications, and viewing application statistics.

## 🚀 Features

- ➕ Add job applications
- 📋 View all applications
- 🔎 Search applications by company
- 🔄 Update application status
- 🗑️ Delete applications
- 📊 View application statistics
- ⚠️ Input validation
- 📌 Track multiple application stages

## 📊 Application Statuses

The application supports the following statuses:

- `APPLIED`
- `PHONE_SCREEN`
- `INTERVIEW`
- `TECHNICAL_INTERVIEW`
- `OFFER`
- `REJECTED`

## 🛠️ Technologies Used

- Java
- IntelliJ IDEA
- Java Collections Framework
- ArrayList
- Scanner
- Enum
- Object-Oriented Programming

## 🧠 Concepts Demonstrated

This project demonstrates several core Java concepts.

### Object-Oriented Programming

The application is divided into multiple classes:

```text
Main
JobApplication
JobApplicationManager
JobApplicationService
ApplicationStatus
```

### Encapsulation

Private fields and getter/setter methods are used to control access to application data.

### Enum

`ApplicationStatus` is used to represent the different stages of a job application.

### Collections

`ArrayList` is used to store and manage multiple job applications.

### CRUD Operations

The application supports:

- **Create** – Add applications
- **Read** – View and search applications
- **Update** – Change application status
- **Delete** – Remove applications

### Exception Handling

Invalid numerical input is handled using `try-catch` and `NumberFormatException`.

### User Input

The `Scanner` class is used to receive input from the user.

## 📂 Project Structure

```text
job-application-manager-java/
│
├── src/
│   ├── Main.java
│   ├── JobApplication.java
│   ├── JobApplicationManager.java
│   ├── JobApplicationService.java
│   └── ApplicationStatus.java
│
└── README.md
```

## ▶️ How to Run

### Prerequisites

Make sure you have:

- Java JDK installed
- IntelliJ IDEA or another Java IDE

### Run the Project

1. Clone the repository:

```bash
git clone YOUR_REPOSITORY_URL
```

2. Open the project in IntelliJ IDEA.

3. Open:

```text
Main.java
```

4. Run the `main()` method.

## 🖥️ Example

```text
========================================
       JOB APPLICATION MANAGER
========================================
1. Add Application
2. View All Applications
3. Search by Company
4. Update Application Status
5. Delete Application
6. View Statistics
7. Exit
========================================
Enter your choice:
```

Example application:

```text
ID: 1 | Company: Google | Position: Software Engineer | Location: Dubai | Status: APPLIED
```

## 📊 Example Statistics

```text
========== APPLICATION STATISTICS ==========

Applied:               3
Phone Screens:         1
Interviews:            2
Technical Interviews:  1
Offers:                1
Rejected:              2

--------------------------------------------
Total Applications:    10
```

## 🔮 Future Improvements

Possible future versions could include:

- MySQL database integration
- JavaFX graphical user interface
- Spring Boot REST API
- User authentication
- Interview scheduling
- Application deadlines
- Resume/document management
- CSV export
- Web-based dashboard
- Cloud deployment

## 🎯 Learning Objectives

This project was created to strengthen practical Java programming skills, particularly:

- Object-Oriented Programming
- Java Collections
- Classes and Objects
- Enums
- Exception Handling
- CRUD operations
- Input validation
- Multi-class application design

## 👨‍💻 Author

**Rameez**

This project is part of my Java and software development portfolio.

---

⭐ If you find this project useful, feel free to star the repository!
