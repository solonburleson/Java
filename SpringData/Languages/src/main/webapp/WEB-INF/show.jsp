<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title><c:out value="${lang.name}" /></title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body>
	<a href="/languages">Dashboard</a>
	<h1><c:out value="${lang.name}" /></h1>
	<p><c:out value="${lang.creator}"></c:out>
	<p><c:out value="${lang.versionNumber}"></c:out>
	<div>
		<a href="/languages/<c:out value="${lang.id}" />/edit">Edit</a>
	</div>
	<form action="/languages/${lang.id}" method ="POST" class="d-inline">
		<input type="hidden" name="_method" value="delete">
		<input class="btn btn-danger" type="submit" value="Delete">
	</form>
</body>
</html>