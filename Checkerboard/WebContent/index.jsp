<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Checkerboard</title>
<style><%@include file="/main.css" %></style>
</head>
<body>
	<% String height = request.getParameter("height"); %>
	<% String width = request.getParameter("width"); %>
	<% System.out.println(height); %>
	<% System.out.println(width); %>
	<% int rows = 10; %>
	<% int columns = 10; %>
	<% if(height != null) {%>
		<% rows = Integer.parseInt(height); %>
	<% } %>
	<% if(width != null) {%>
		<% columns = Integer.parseInt(width); %>
	<% } %>
	<h1>Checkerboard: <%= width %>w X <%= height %>h</h1>
	<div id="container">
	<% for(int i = 1; i <= rows; i++) {%>
		<div class="row">
			<% for(int j = 1; j <= columns; j++) {%>
			<% if(i%2 == 0) {%>
				<% if(j%2 != 0) {%>
					<div class="blackbox"></div>
				<% } else { %>
					<div class="redbox"></div>
				<% } %>
			<% } else { %>
				<% if(j%2 != 0) {%>
					<div class="redbox"></div>
				<% } else { %>
					<div class="blackbox"></div>
				<% } %>
			<% } %>
			<% } %>
		</div>
	<% } %>
	</div>
</body>
</html>