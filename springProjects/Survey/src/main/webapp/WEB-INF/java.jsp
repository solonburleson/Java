<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Java</title>
</head>
<body>
	<h1>Congratulations on picking Java!!!!!</h1>
	<p>Your Name: <c:out value="${name}" /></p>
	<p>Dojo Location: <c:out value="${dojo}" /></p>
	<p>Favorite Language: <c:out value="${lang}" /></p>
	<p>Comments: (optional) <c:out value="${comment}" /></p>
</body>
</html>