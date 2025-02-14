package in.sp.backend;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/myLogin")  // URL Mapping
public class Login extends HttpServlet {

    private static final long serialVersionUID = 1L;  // Recommended for serialization

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        response.setContentType("text/html");

        // Get input values and trim spaces
        String myemail = request.getParameter("name1").trim();
        String mypass = request.getParameter("pass1").trim();

        // Debugging: Print received values to console
        System.out.println("Received Email: " + myemail);
        System.out.println("Received Password: " + mypass);

        if ("ganesh@gmail.com".equals(myemail) && "ganesh123".equals(mypass)) {
            response.getWriter().println("<h2>Login Successful!</h2>");
        } else {
            response.getWriter().println("<h2>Login Failed!</h2>");
        }
    }
}
