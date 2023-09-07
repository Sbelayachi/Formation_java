package com.example.demo;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "formServlet", value = "/form")
public class FormServlet extends HttpServlet {

    private String myInitParam;

    @Override
    public void init() throws ServletException {
        myInitParam = getServletContext().getInitParameter("blabla");
        System.out.println(myInitParam);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        getServletContext().getRequestDispatcher("/WEB-INF/addDog.jsp").forward(req, resp);

        // int myNumber = 125 / 0;


    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // localhost:8080/route/du/servlet?paramA="hole"&paramB="bibi"

        String firstname = req.getParameter("name");
        String color = req.getParameter("color");
        Double age = Double.parseDouble(req.getParameter("age"));
        Double weight = Double.parseDouble(req.getParameter("weight"));

        System.out.printf("name: %s, color = %s, age = %f, weight = %f", firstname, color, age, weight);


    }
}