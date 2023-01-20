<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Form - Aggiorna dipendente</title>
		<link href="${pageContext.request.contextPath}/resources/css/form.css" rel="stylesheet">
	</head>
	<body>
		<div class="card">
			<form action="${pageContext.request.contextPath}/aggiorna-dipendente" method="POST">
				<img alt="profile" src="https://www.freeiconspng.com/thumbs/profile-icon-png/profile-icon-9.png">
				<br />
				<input type="number" name="id" hidden="true" value="${worker.getId_worker()}">
				<input class="input" type="text" name="nome" value="${worker.getNome()}">
				<br />
				<br />
				<input class="input" type="text" name="cognome" value="${worker.getCognome()}">
				<br />
				<br />
				<input class="input" type="number" name="eta" value="${worker.getEta()}">
				<br />
				<br />
				<input class="input" type="text" name="descrizione"value="${worker.getDescrizione()}" placeholder="Descrizione">
				<br />
				<br />
				<input class="input" type="number" name="scrivania" placeholder="${worker.getDesk()}">
				<br />
				<br />
				<button class="btn" type="submit">Invia dati</button>
			</form>
		</div>
	</body>
</html>