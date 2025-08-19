package com.example.servlet;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletConfig;



@WebServlet("/course")
public class CourseServlet extends HttpServlet {
    
    @Override
    public void init(ServletConfig config) throws ServletException {
    }
    //Esto sirve para inicializar el servlet y obtener el contexto de la aplicación
}