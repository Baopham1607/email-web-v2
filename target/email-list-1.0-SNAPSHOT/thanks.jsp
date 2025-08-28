<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Survey - Thanks</title>
    <link rel="stylesheet" href="styles/Main.css">
</head>
<body class="thanks-page">
<div class="container">
    <div class="card">
        <h1>🎉 Thank You!</h1>
        <p class="subtitle">Here is the information you submitted:</p>

        <div class="info">
            <% 
            murach.business.User user = (murach.business.User) request.getAttribute("user");
            if (user != null) {
            %>
            <p><strong>First Name:</strong> <%= user.getFirstName() %></p>
            <p><strong>Last Name:</strong> <%= user.getLastName() %></p>
            <p><strong>Email:</strong> <%= user.getEmail() %></p>
            <p><strong>Date of Birth:</strong> <%= user.getDateOfBirth() %></p>
            <p><strong>How did you hear about us:</strong> <%= user.getHearUs() %></p>
            <p><strong>Contact Method:</strong> <%= user.getContactMethod() %></p>
            
            <p><strong>Announcements:</strong><br>
                <%
                String[] announcements = user.getAnnouncements();
                if (announcements != null && announcements.length > 0) {
                    for (String announcement : announcements) {
                %>
                        - <%= announcement %><br>
                <%
                    }
                } else {
                %>
                    No announcements selected.
                <%
                }
                %>
            </p>
            <% } else { %>
                <p>No user data found. Please go back and fill out the form.</p>
            <% } %>
        </div>

        <a href="." class="btn return-btn">Return to Home</a>
    </div>
</div>
</body>
</html>