# WSL_uni
Technologies Used: 
- Java
- Spring Boot
- Spring Data JPA
- H2 Database (or your choice of database)
- Maven

Entities  
- Student: id, name, email, department.
- Course: id, title, description, credits, professor.t.
- Professor: id, name, department, specialization.
- Department: id, name, location.

Endpoints
- - Student Endpoints
- GET /api/students: Retrieve all students.
- GET /api/students/{id}: Retrieve student by ID.
- POST /api/students: Create a new student.
- PUT /api/students/{id}: Update a student.
- DELETE /api/students/{id}: Delete a student.
- - Course Endpoints
- GET /api/courses: Retrieve all courses.
- GET /api/courses/{id}: Retrieve course by ID.
- POST /api/courses: Create a new course.
- PUT /api/courses/{id}: Update a course.
- DELETE /api/courses/{id}: Delete a course.
- - Professor Endpoints
- GET /api/professors: Retrieve all professors.
- GET /api/professors/{id}: Retrieve professor by ID.
- POST /api/professors: Create a new professor.
- PUT /api/professors/{id}: Update a professor.
- DELETE /api/professors/{id}: Delete a professor.
- - Department Endpoints
- GET /api/departments: Retrieve all departments.
- GET /api/departments/{id}: Retrieve department by ID.
- POST /api/departments: Create a new department.
- PUT /api/departments/{id}: Update a department.
- DELETE /api/departments/{id}: Delete a department.

Example:
To post student use command:
- Invoke-RestMethod -Uri "http://localhost:8080/api/students" `
    -Method POST `
    -Headers @{ "Content-Type" = "application/json" } `
    -Body '{"email":"test@student.com", "name":"Test Student", "department":{"id": 1}}'
