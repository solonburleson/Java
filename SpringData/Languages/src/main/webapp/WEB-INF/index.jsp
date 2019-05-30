<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Languages</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body>
	<table class="col-10 mx-auto mb-5">
		<thead>
			<th>Name</th>
			<th>Creator</th>
			<th>Version Number</th>
			<th>Actions</th>
		</thead>
		<tbody>
			<c:forEach items="${languages}" var="lang">
				<tr>
					<td><a href="/languages/<c:out value="${lang.id}"/>"><c:out value="${lang.name}"/></a></td>
					<td><c:out value="${lang.creator}"/></td>
					<td><c:out value="${lang.versionNumber}"/></td>
					<td>
						<form action="/languages/${lang.id}" method ="POST" class="d-inline">
							<input type="hidden" name="_method" value="delete">
							<input class="btn btn-danger" type="submit" value="Delete">
						</form>
						<a href="/languages/<c:out value="${lang.id}"/>/edit">Edit</a>
					</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<form:form action="/languages/new" method="POST" modelAttribute="lang" class="col=10 mx-auto">
		<p class="col-6 mx-auto">
	        <form:label path="name" class="col-3">Name</form:label>
	        <form:input path="name"/>
	        <span style="color: red;"><form:errors path="name"/></span>
	    </p>
	    <p class="col-6 mx-auto">
	        <form:label path="creator" class="col-3">Creator</form:label>
	        <form:input path="creator"/>
	        <span style="color: red;"><form:errors path="creator"/></span>
	    </p>
	    <p class="col-6 mx-auto">
	        <form:label path="versionNumber" class="col-3">Version Number</form:label>
	        <form:input path="versionNumber"/>
	        <span style="color: red;"><form:errors path="versionNumber"/></span>
	    </p>  
	    <input class="btn btn-primary offset-3" type="submit" value="Submit"/>
	</form:form>
</body>
</html>