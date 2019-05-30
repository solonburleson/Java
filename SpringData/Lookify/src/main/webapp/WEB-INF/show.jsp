<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>${song.name}</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body>
	<div class="col-12">
		<a class="align-right" href="/dashboard">Dashboard</a>
	</div>
	<div class="col-10 mx-auto">
		<p><span>Name: </span><span><c:out value="${song.name}" /></span></p>
		<p><span>Artists: </span><span><c:out value="${song.artists}" /></span></p>
		<p><span>Rating: </span><span><c:out value="${song.rating}" /></span></p>
	</div>
	<form action="/songs/${song.id}" method="POST" class="offset-1">
		<input type="hidden" name="_method" value="delete">
		<input class="btn btn-danger" type="submit" value="Delete">
	</form>
</body>
</html>