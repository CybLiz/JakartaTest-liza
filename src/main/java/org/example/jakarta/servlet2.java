
package org.example.jakarta;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Servlet2", value = "/test2")
public class servlet2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Servlet2 doGet");
        resp.setContentType("text/plain");
        resp.getWriter().println("<html>");
        resp.getWriter().println("  <head><title>Test servlet 2</title></head>");
        resp.getWriter().println("  <body>");
        resp.getWriter().println("   <h1>Test servlet 2</h1>");
        resp.getWriter().println("  </body>");
        resp.getWriter().println("</html>");
    }
}

