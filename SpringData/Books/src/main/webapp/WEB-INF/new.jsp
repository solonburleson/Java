<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New Book</title>
</head>
<body>
	<h1>New Book</h1>
	<form:form action="/books" method="POST" modelAttribute="book">
	    <p>
	        <form:label path="title">Title</form:label>
	        <form:input path="title"/>
	        <span style="color: red;"><form:errors path="title"/></span>
	    </p>
	    <p>
	        <form:label path="description">Description</form:label>
	        <form:textarea path="description"/>
	        <span style="color: red;"><form:errors path="description"/></span>
	    </p>
	    <p>
	        <form:label path="language">Language</form:label>
	        <form:input path="language"/>
	        <span style="color: red;"><form:errors path="language"/></span>
	    </p>
	    <p>
	        <form:label path="numberOfPages">Pages</form:label>  
	        <form:input type="number" path="numberOfPages"/>
	        <span style="color: red;"><form:errors path="numberOfPages"/></span>
	    </p>    
	    <input type="submit" value="Submit"/>
	</form:form> 
</body>
</html>