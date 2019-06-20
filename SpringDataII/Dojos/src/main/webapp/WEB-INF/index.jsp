<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Dojos</title>
</head>
<body>
	<a href="/dojos/new">New Dojo</a>
	<a href="/ninjas/new">New Ninja</a>
	<h1>All Dojos</h1>
	<table>
		<thead>
			<th>Dojo Name</th>
			<th>Number of Students</th>
		</thead>
		<tbody>
			<c:forEach items="${allDojos}" var="dojo">
				<tr>
					<td><a href="/dojos/${dojo.id}"><c:out value="${dojo.name}"/></a></td>
					<td><c:out value="${dojo.ninjas.size()}"/> ninjas</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>