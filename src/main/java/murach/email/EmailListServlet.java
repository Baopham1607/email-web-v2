package murach.email;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import murach.business.User;

public class EmailListServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request,
                      HttpServletResponse response)
        throws ServletException, IOException {

    request.setCharacterEncoding("UTF-8");

    String firstName = request.getParameter("firstName");
    String lastName = request.getParameter("lastName");
    String email = request.getParameter("email");
    String dateOfBirth = request.getParameter("dob");
    String contactMethod = request.getParameter("contactMethod");
    String[] announcements = request.getParameterValues("announcements");

    User user = new User(firstName, lastName, email, dateOfBirth, contactMethod, announcements);

    request.setAttribute("user", user);

    getServletContext()
            .getRequestDispatcher("/thanks.jsp")
            .forward(request, response);
}}