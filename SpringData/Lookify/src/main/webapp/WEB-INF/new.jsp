<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add New Song</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body>
	<form:form action="/songs/new" method="POST" modelAttribute="song" class="col=10 mx-auto">
		<p class="col-6 mx-auto">
	        <form:label path="name" class="col-3">Name</form:label>
	        <form:input path="name"/>
	        <span style="color: red;"><form:errors path="name"/></span>
	    </p>
	    <p class="col-6 mx-auto">
	        <form:label path="artists" class="col-3">Artists</form:label>
	        <form:input path="artists"/>
	        <span style="color: red;"><form:errors path="artists"/></span>
	    </p>
	    <p class="col-6 mx-auto">
	        <form:label path="rating" class="col-3">Rating</form:label>
	        <form:input path="rating"/>
	        <span style="color: red;"><form:errors path="rating"/></span>
	    </p>  
	    <input class="btn btn-primary offset-3" type="submit" value="Add Song"/>
	</form:form>
</body>
</html>