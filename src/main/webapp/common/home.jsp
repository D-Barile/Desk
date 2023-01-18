<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c' %>

<a id="add" class="query" href="${pageContext.request.contextPath}/aggiungi-dipendente">Aggiungi dipendente</a>

<section>
	<c:forEach var="w" items='<%=request.getAttribute("workers") %>'>
		<div id="card${w.getId_worker()}" class="card">
			<p hidden="true">${w.getId_worker()}</p>
			<img alt="profile" src="https://www.freeiconspng.com/thumbs/profile-icon-png/profile-icon-9.png">
			<h2>${w.getNome()}</h2>
			<h2>${w.getCognome()}</h2>
			<h3>${w.getEta()}</h3>
			<p>${w.getDescrizione()}</p>
			<a class="query" href="${pageContext.request.contextPath}/rimuovi-dipendente?id=${w.getId_worker()}">Rimuovi</a>
			<a class="query" href="${pageContext.request.contextPath}/aggiorna-dipendente?id=${w.getId_worker()}">Aggiorna</a>
		</div>
	</c:forEach>
</section>
