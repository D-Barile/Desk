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
				<input class="input" type="text" name="user" value="prova" required="required" />
				<label for="user"></label>
				<br />
				<br />
				<input id="pass" class="input" type="password" name="pass" value="prova" required="required" />
				<label for="pass"></label>
				<br />
				<br />
				<input id="show" type="checkbox" name="show" /> Mostra password
				<br />
				<br />
				<button class="input" type="submit">Accedi</button>
			</form>
		</div>
		<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/script.js"></script>
	</body>
</html>