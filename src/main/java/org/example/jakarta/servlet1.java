
package org.example.jakarta;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Servlet1", value = "/test1")
public class servlet1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Servlet1 doGet");
        resp.setContentType("text/plain");
        PrintWriter out = resp.getWriter();

        out.println("<html>");
        out.println("<head><title>Test Servlet 1</title></head>");
        out.println("<body>");
        out.println("<h1>Je teste MonServelet 1 !</h1>");
        out.println("</body>");
        out.println("</html>");
    }
}

