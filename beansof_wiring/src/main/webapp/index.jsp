<%@ page import="com.example.services.StudentServices" %>
<%@ page import="com.example.app.AppContext" %>
<%@ page import="com.example.model.Student" %>

<!DOCTYPE html>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<html>
    <head>
        <title>Beans of Wiring</title>

    </head>
    <body>
        <h1>Welcome to Beans of Wiring</h1>
        <p>This is a simple web application demonstrating the use of beans in wiring.</p>
        <p>Make sure to check the console for any logs or messages.</p>
    </body>

    <% 
        StudentServices student = (StudentServices) AppContext.getApplicationContext().getBean("studentService");
        %>


    <form action="student" method="post">
        <label for="id">Age:</label>
        <input type="text" id="id" name="id" required>
        <label for="name">Name:</label>
        <input type="text" id="name" name="name" required>
        <br>
        <label for="course">Course:</label>
        <input type="text" id="course" name="courseId">
        <br>
        <input type="submit" value="Add Student">
    </form>

    <%
        StudentServices studentService1 = AppContext.getApplicationContext().getBean("studentService", StudentServices.class); 


        for(Student student1 : studentService1.getStudents()){
            out.println("<p>student1 ID: " + student1.getId() + ", Name: " + student1.getName() + ", Course: " + student1.getCourseId() + "</p>");
        }

    %>



</html>