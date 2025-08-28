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

        String url = "/index.html";
        request.setCharacterEncoding("UTF-8");

        String action = request.getParameter("action");
        if (action == null) {
            action = "join";
        }

        if (action.equals("join")) {
            url = "/index.html";
        } else if (action.equals("add")) {
            String firstName = request.getParameter("firstName");
            String lastName = request.getParameter("lastName");
            String email = request.getParameter("email");
            String dateOfBirth = request.getParameter("dob");
            String contactMethod = request.getParameter("contactMethod");
            String[] announcements = request.getParameterValues("announcements");

            User user = new User(firstName, lastName, email, dateOfBirth, contactMethod, announcements);

            request.setAttribute("user", user);
            url = "/thanks.jsp";
        }

        getServletContext()
                .getRequestDispatcher(url)
                .forward(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }
}