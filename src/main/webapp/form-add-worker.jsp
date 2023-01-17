<form action="${pageContext.request.contextPath}/aggiungi-dipendente" method="POST">
	<input type="text" name="nome" placeholder="Nome dipendente">
	<input type="text" name="cognome" placeholder="Cognome del dipendente">
	<input type="number" name="eta" placeholder="Età del dipendente">
	<input type="text" name="descrizione" placeholder="Descrizione del dipendente">
	<button type="submit">Invia dati</button>
</form>