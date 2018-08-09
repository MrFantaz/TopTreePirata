package com.heroku.servlet;

import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.Writer;

public class TestServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
     doGet(request,response);
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        Writer writer = response.getWriter();
        writer.append("<h1>PAMPAM</h1>");
//       request.getRequestDispatcher("index.jsp");
    }
}
