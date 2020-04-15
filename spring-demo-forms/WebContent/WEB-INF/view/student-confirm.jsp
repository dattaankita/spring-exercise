<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<h1>Student reg form</h1>
</head>
<body>
The student is confirmed:<br> ${student.fname } ${student.lname } 
<br>
Country:<br> ${student.country }
<br>
Favorite language: <br>${student.flang }
<br>
OS:
<br> 
<ul>
 	<c:forEach var="temp" items="${student.os }">
		<li>${temp}</li>
	</c:forEach>
</ul>
</body>
</html>