
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<h1>Customer reg form</h1>
<style>
	.error{color:red}
</style>
</head>
<body>
<form:form action="processForm" modelAttribute="customer">
        Firstname: 
        <form:input path="fname"/>
        <br>
        Lastname: 
        <form:input path="lname"/>
        <form:errors path="lname" cssClass="error"/>
        <br>
        Freepasses:
        <form:input path="freepasses"/>
        <form:errors path="freepasses" cssClass="error"/>
        <br>
        PostalCode:
        <form:input path="postalCode"/>
        <form:errors path="postalCode" cssClass="error"/>
        <br>
        <input type="submit" value="submit"/>

</form:form>
</body>
</html>