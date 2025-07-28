
package org.example.jakarta;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Servlet3", value = "/test3")
public class servlet3 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Servlet3 doGet");

        resp.setContentType("text/html");
//        PrintWriter out = resp.getWriter();

//        out.println("<html>");
//        out.println("<head><title>Test Servlet 3</title></head>");
//        out.println("<body>");
//        out.println("<h1>Je teste MonServelet  3 !</h1>");
//        out.println("</body>");
//        out.println("</html>");
    }
}

