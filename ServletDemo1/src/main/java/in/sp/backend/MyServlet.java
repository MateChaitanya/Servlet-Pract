package in.sp.backend;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/submitForm")
public class MyServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        // Retrieve form parameters
        String myname = request.getParameter("name1");
        String myemail = request.getParameter("email1");

        System.out.println("Name: " + myname);
        System.out.println("Email: " + myemail); // Will print on the console
        
        // Set response type
        response.setContentType("text/html");

        // Print output on browser
        PrintWriter out = response.getWriter();
        out.println("<h2>Form Submitted Successfully!</h2>");
        out.println("<p>Name: " + myname + "</p>");
        out.println("<p>Email: " + myemail + "</p>");
    }
}
