<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
                <c:choose>
                    <c:when test="${user.announcements != null && user.announcements.length > 0}">
                        <c:forEach var="announcement" items="${user.announcements}">
                            - ${announcement}<br>
                        </c:forEach>
                    </c:when>
                    <c:otherwise>No announcements selected.</c:otherwise>
                </c:choose>
            </p>
        </div>

        <a href="index.html" class="btn return">Return</a>
    </div>
</div>
</body>
</html>
