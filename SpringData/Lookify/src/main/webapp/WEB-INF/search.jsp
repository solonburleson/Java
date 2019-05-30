<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>${artists}</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body>
	<div>
		<p class="d-inline mr-5">Songs by artists: <c:out value="${artists}" /></p>
		<form action="/search" method="POST" class="d-inline-block mx-5">
			<input type="text" name="search" value="${artists}" />
			<input class="btn btn-primary" type="submit" value="Search Artists" />
		</form>
		<a href="/dashboard">Dashboard</a>
	</div>
	<table class="col-10 mx-auto">
		<thead>
			<th>Song Name</th>
			<th>Rating</th>
			<th>Actions</th>
		</thead>
		<tbody>
			<c:forEach items="${songs}" var="song">
				<tr>
					<td><a href="/songs/${song.id}"><c:out value="${song.name}" /></a>
					<td><c:out value="${song.rating}" /></td>
					<td>
						<form action="/songs/${song.id}" method="POST">
							<input type="hidden" name="_method" value="delete">
							<input class="btn btn-danger" type="submit" value="Delete">
						</form>
					</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>