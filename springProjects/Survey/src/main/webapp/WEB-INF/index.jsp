<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Survey</title>
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body>
	<form class="col-10 mx-auto mt-5" action="/check" method="POST">
		<div>
			<label class="col-3" for="name">Your Name:</label>
			<input class="col-3" type="text" name="name" />
		</div>
		<div>
			<label class="col-3" for="dojo">Dojo Location:</label>
			<select class="col-3" name="dojo">
				<option value="Dallas">Dallas</option>
			</select>
		</div>
		<div>
			<label class="col-3" for="lang">Favorite Language:</label>
			<select class="col-3" name="lang">
				<option value="Java">Java</option>
				<option value="Python">Python</option>
			</select>
		</div>
		<div>
			<label class="col-3" for="comment">Comment: (optional)</label>
			<textarea class="d-block col-6" name="comment" rows="6"></textarea>
		</div>
		<input class="btn btn-primary mt-3" type="submit" />
	</form>
</body>
</html>