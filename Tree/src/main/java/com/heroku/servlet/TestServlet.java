package com.heroku.servlet;

import java.io.IOException;
import java.io.Writer;

public class TestServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
     doGet(request,response);
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        Writer writer = response.getWriter();
        writer.append("<h1>PAMPAM</h1>");
        writer.append(" "+request.getParameter("first_name")+" "+request.getAttribute("last_name"));


//       request.getRequestDispatcher("index.jsp");
    }
}
