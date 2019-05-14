<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Secret Code</title>
	<link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
	<p id="error"><c:out value="${error}" /></p>
	<p>What is the code?</p>
	<form action="/check" method="POST">
		<label for="code">Code:</label>
		<input type="text" name="code"/>
		<input type="submit" />
	</form>
</body>
</html>