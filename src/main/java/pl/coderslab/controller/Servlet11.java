package pl.coderslab.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDate;

@WebServlet(name = "Servlet11", urlPatterns = {"/servlet"})
public class Servlet11 extends HttpServlet
{
    public void init() throws ServletException
    {
        System.out.println("Zadanie 4");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        response.getWriter().append("Hello first servlet ").append(LocalDate.now().toString());
        System.out.println("Console also works!");

    }
}
