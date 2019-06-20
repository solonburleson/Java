<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Licenses</title>
</head>
<body>
	<c:forEach items="${licenses}" var="license">
		<c:out value="${license.person.firstName}"></c:out>
		<c:out value="${license.number}"></c:out>
	</c:forEach>
</body>
</html>