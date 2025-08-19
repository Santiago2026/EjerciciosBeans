package com.example.servlet;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.ServletException;
import java.io.IOException;
import com.example.app.AppContext;
import com.example.model.Student;
import jakarta.servlet.ServletConfig;
import com.example.services.StudentServices;


@WebServlet("/student")
public class StudentServlet extends HttpServlet {
    
    private StudentServices studentService;

    @Override
    public void init(ServletConfig config) throws ServletException {
        studentService = AppContext.getApplicationContext().getBean(StudentServices.class);

        //Este metodo sirve para inicializar el servlet y obtener el contexto de la aplicación
    }


    //JSP -> Form que envia los datos al sigueinte metodo
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String id = req.getParameter("id");
        String courseId = req.getParameter("courseId");
        studentService.addStudent(new Student(id,name,courseId));
        resp.sendRedirect("./");//Redirige a la pagina principal
        
    }
}
