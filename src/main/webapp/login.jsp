<div id="container" class="login">
	<h1 id="title">Benvenuto!</h1>
	<form class="login"  action="${pageContext.request.contextPath}/login" method="POST">
		<input id="user" class="input" type="text" name="user" value="prova" required="required" />
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