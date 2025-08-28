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
            <p><strong>First Name:</strong> ${user.firstName}</p>
            <p><strong>Last Name:</strong> ${user.lastName}</p>
            <p><strong>Email:</strong> ${user.email}</p>
            <p><strong>Date of Birth:</strong> ${user.dateOfBirth}</p>
            <p><strong>How did you hear about us:</strong> ${user.hearUs}</p>
            <p><strong>Contact Method:</strong> ${user.contactMethod}</p>
            
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
        </div>

        <a href="." class="btn return-btn">Return to Home</a>
    </div>
</div>
</body>
</html>