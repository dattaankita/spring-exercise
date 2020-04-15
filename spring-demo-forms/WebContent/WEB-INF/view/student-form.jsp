
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<h1>Student reg form</h1>
</head>
<body>
<form:form action="processForm" modelAttribute="student">
        Firstname: 
        <form:input path="fname"/>
        <br>
        Lastname: 
        <form:input path="lname"/>
        <br>
        Country: 
        <form:select path="country">
        	<form:options items="${student.countryOptions }"/>
        </form:select>
        
        <!-- Country: <form:select path="country">
        <form:option value="brazil" label="brazil"/>
        <form:option value="india" label="india"/>
        <form:option value="italy" label="italy"/>
        <form:option value="US" label="US"/> 
         </form:select>-->
        
        <br>
        Favourite Language:
        Java:<form:radiobutton path="flang" value="Java"/>
        C#:<form:radiobutton path="flang" value="C#"/>
        JSP:<form:radiobutton path="flang" value="JSP"/>
        Junit:<form:radiobutton path="flang" value="Junit"/>
        
        <br>
        OS:
        Linux:<form:checkbox path="os" value="linux"/>
        Windows:<form:checkbox path="os" value="Windows"/>
        <br>
        <input type="submit" value="submit"/>

</form:form>
</body>
</html>