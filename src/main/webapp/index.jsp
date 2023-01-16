<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Desk - Home Page</title>
		<link href="${pageContext.request.contextPath}/resources/css/style.css" rel="stylesheet" />
	</head>
	<body>
		<div id="container" class="login">
			<h1 id="title">Benvenuto!</h1>
			<form class="login" action="POST">
				<input class="input" type="text" name="user" placeholder="Username" required="required" />
				<label for="user"></label>
				<br />
				<br />
				<input class="input" type="password" name="pass" placeholder="Password" required="required" />
				<label for="pass"></label>
				<br />
				<br />
				<input type="checkbox" name="show">
				<label for="show">Mostra password</label>
				<br />
				<br />
				<button class="input" type="submit">Accedi</button>
			</form>
		</div>
	</body>
</html>