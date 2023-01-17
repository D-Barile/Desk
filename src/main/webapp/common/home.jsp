<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c' %>

<a href="${pageContext.request.contextPath}/aggiungi-dipendente">Aggiungi dipendente</a>

<section>
	<c:forEach var="w" items='<%=request.getAttribute("workers") %>'>
		<div id="card${w.getId_worker()}" class="card">
			<p hidden="true">${w.getId_worker()}</p>
			<img alt="profile" src="https://www.freeiconspng.com/thumbs/profile-icon-png/profile-icon-9.png">
			<h2>${w.getNome()}</h2>
			<h2>${w.getCognome()}</h2>
			<h3>${w.getEta()}</h3>
			<p>${w.getDescrizione()}</p>
		</div>
	</c:forEach>
</section>
