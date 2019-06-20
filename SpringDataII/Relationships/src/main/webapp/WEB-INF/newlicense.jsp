<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
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
	        <c:forEach items="${personList}" var="person">
	        	<form:select path="person">
	        		<form:option label="${person.firstName} ${person.lastName}" value="${person.id}" />
	        	</form:select>
	        </c:forEach>	
	    </p>
	    <p>
	        <form:label path="state">State</form:label>
	        <form:errors path="state"/>
	        <form:input path="state"/>
	    </p>   
	    <p>
	        <form:label path="expirationDate">Expiration</form:label>
	        <form:errors path="expirationDate"/>
	        <form:input type="date" path="expirationDate"/>
	    </p>   
	    <input type="submit" value="Submit"/>
	</form:form> 
</body>
</html>