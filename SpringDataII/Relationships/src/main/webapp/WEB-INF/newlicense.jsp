<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New License</title>
</head>
<body>
	<h1>New License</h1>
	<form:form action="/license" method="post" modelAttribute="license">
	    <p>
	        <form:label path="person">Person</form:label>
	        <form:errors path="person"/>
	        <form:select path="person" items="${personList}"/>
	        	
	    </p>
	    <p>
	        <form:label path="state">State</form:label>
	        <form:errors path="state"/>
	        <form:input path="state"/>
	    </p>   
	    <p>
	        <form:label path="expirationDate">Expiration</form:label>
	        <form:errors path="expirationDate"/>
	        <form:input path="expirationDate"/>
	    </p>   
	    <input type="submit" value="Submit"/>
	</form:form> 
</body>
</html>