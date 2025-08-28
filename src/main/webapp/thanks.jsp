<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html>
<head>
    <meta charset="utf-8">
    <title>Survey - Thanks</title>
    <link rel="stylesheet" href="styles/main.css" type="text/css"/>
</head>

<body>
<h1>Thanks for your survey</h1>

<p>Here is the information that you entered:</p>

<label>First Name:</label>
<span>${user.firstName}</span><br>
<label>Last Name:</label>
<span>${user.lastName}</span><br>
<label>Email:</label>
<span>${user.email}</span><br>
<label>Date of Birth:</label>
<span>${user.dateOfBirth}</span><br>
<label>Contact Method:</label>
<span>${user.contactMethod}</span><br>

<label>Announcements:</label>
<span>
    <c:choose>
        <c:when test="${user.announcements != null && user.announcements.length > 0}">
            <c:forEach var="announcement" items="${user.announcements}">
                ${announcement}<br>
            </c:forEach>
        </c:when>
        <c:otherwise>
            No announcements selected.
        </c:otherwise>
    </c:choose>
</span>

<p>To enter another survey, click on the Back
    button in your browser or the Return button below.</p>

<form action="survey" method="get">
    <input type="hidden" name="action" value="join">
    <input type="submit" value="Return">
</form>
</body>
</html>