<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Form - Aggiungi dipendente</title>
		<link href="${pageContext.request.contextPath}/resources/css/form.css" rel="stylesheet">
	</head>
	<body>
		<div class="card">
			<form action="${pageContext.request.contextPath}/aggiungi-dipendente" method="POST">
				<img alt="profile" src="https://www.freeiconspng.com/thumbs/profile-icon-png/profile-icon-9.png">
				<input class="input" type="text" name="nome" placeholder="Nome">
				<br />
				<br />
				<input class="input" type="text" name="cognome" placeholder="Cognome">
				<br />
				<br />
				<input class="input" type="number" name="eta" placeholder="Età">
				<br />
				<br />
				<input class="input" type="text" name="descrizione" placeholder="Descrizione">
				<br />
				<br />
				<input class="input" type="number" name="scrivania" placeholder="Scrivania">
				<br />
				<br />
				<button class="btn" type="submit">Invia dati</button>
			</form>
		</div>
	</body>
</html>