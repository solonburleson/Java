<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Counter</title>
</head>
<body>
	<p>You have visited the home page <c:out value="${count}" /> times</p>
	<a href="/">Add to count</a>
	<a href="/add2">Add 2 to Count</a>
	<a href="/reset">Reset Counter</a>
</body>
</html>