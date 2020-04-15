<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<h1>customer reg form</h1>
</head>
<body>
The customer is confirmed:  ${customer.fname } ${customer.lname } 
<br>
Free passes: ${customer.freepasses }
<br>
Postal Code: ${customer.postalCode }
<br>

</body>
</html>