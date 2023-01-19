<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c' %>

<a id="addW" class="button" href="${pageContext.request.contextPath}/aggiungi-dipendente">Aggiungi dipendente</a>
<a id="addD" class="button" href="${pageContext.request.contextPath}/aggiungi-scrivania">Aggiungi scrivania</a>

<section class="card">
	<div class="card-inner">
		<c:forEach var="w" items='<%=request.getAttribute("workers") %>'>
			<div id="card-worker${w.getId_worker()}" class="front">
				<p hidden="true">${w.getId_worker()}</p>
				<img alt="profile" src="https://www.freeiconspng.com/thumbs/profile-icon-png/profile-icon-9.png">
				<h2>${w.getNome()}</h2>
				<h2>${w.getCognome()}</h2>
				<h3>${w.getEta()}</h3>
				<p>${w.getDescrizione()}</p>
			</div>
		</c:forEach>
		<c:forEach var="d" items='<%=request.getAttribute("desks") %>'>
			<div id="card-desk${d.getId_desk()}" class="back">
				<img id="desk" alt="desk" src="https://www.freeiconspng.com/thumbs/desk-png/school-desk-png-18.png">
				<h2>${d.getId_desk()}</h2>
				<a id="desk-a" class="a" href="${pageContext.request.contextPath}/rimuovi-scrivania?id=${d.getId_desk()}">Rimuovi scrivania</a>
				<a id="remove" class="a" href="${pageContext.request.contextPath}/rimuovi-dipendente?id=${d.getWorker().getId_worker()}">Rimuovi dipendente</a>
				<a id="update" class="a" href="${pageContext.request.contextPath}/aggiorna-dipendente?id=${d.getWorker().getId_worker()}">Aggiorna dipendente</a>
			</div>
		</c:forEach>
	</div>
</section>