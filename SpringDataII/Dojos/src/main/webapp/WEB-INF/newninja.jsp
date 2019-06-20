<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New Ninja</title>
</head>
<body>
	<h1>New Ninja</h1>
	<form:form action="/ninjas" method="post" modelAttribute="ninja">
	    <p>
	        <form:label path="dojo">Dojo Location:</form:label>
	        <form:select path="dojo">
	        	<c:forEach items="${dojoList}" var="dojo">
	        		<form:option label="${dojo.name}" value="${dojo.id}" />
	        	</c:forEach>	
	        </form:select>
	        <form:errors path="dojo"/>
	    </p>  
	    <p>
	        <form:label path="firstName">First Name:</form:label>
	        <form:input path="firstName"/>
	        <form:errors path="firstName"/>
	    </p>  
	    <p>
	        <form:label path="lastName">Last Name:</form:label>
	        <form:input path="lastName"/>
	        <form:errors path="lastName"/>
	    </p>  
	    <p>
	        <form:label path="age">Age:</form:label>
	        <form:input path="age"/>
	        <form:errors path="age"/>
	    </p>  
	    <input type="submit" value="Create"/>
	</form:form> 
</body>
</html>