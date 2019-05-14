<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Ninja Gold</title>
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
	<link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
	<div>
		<p>Your Gold: <c:out value="${gold}" /> </p>
	</div>
	<div class="col-10 mx-auto">
		<div class="d-inline-block border p-3 text-center mx-5">
			<h2>Farm</h2>
			<p>(earn 10-20 gold)</p>
			<form action="/farm" method="POST">
				<input type="submit" />
			</form>
		</div>
		<div class="d-inline-block border p-3 text-center mx-5">
			<h2>Cave</h2>
			<p>(earn 5-10 gold)</p>
			<form action="/cave" method="POST">
				<input type="submit" />
			</form>
		</div>
		<div class="d-inline-block border p-3 text-center mx-5">
			<h2>House</h2>
			<p>(earn 2-5 gold)</p>
			<form action="/house" method="POST">
				<input type="submit" />
			</form>
		</div>
		<div class="d-inline-block border p-3 text-center mx-5">
			<h2>Casino!</h2>
			<p>(earns/takes 0-50 gold)</p>
			<form action="/casino" method="POST">
				<input type="submit" />
			</form>
		</div>
	</div>
	<div id="log" class="col-10 border mx-auto my-5">
		<c:if test="${log.size() > 0 }">
			<c:forEach var="i" begin="${0}" end="${log.size() - 1}">
				<c:if test="${log.get(i).contains('earned')}">
					<p class="text-success"><c:out value="${log.get(i)}" /></p>
				</c:if>
				<c:if test="${log.get(i).contains('lost')}">
					<p class="text-danger"><c:out value="${log.get(i)}" /></p>
				</c:if>
			</c:forEach>
		</c:if>
	</div>
</body>
</html>