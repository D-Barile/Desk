<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c' %>

<a href="${pageContext.request.contextPath}/aggiungi-dipendente">Aggiungi dipendente</a>

<section>
	<c:forEach var="w" items='<%=request.getAttribute("workers") %>'>
		<div id="card">
			<h1>Ciao</h1>
			<p hidden="true">${w.getId_worker()}</p>
			<img alt="profile" src="https://www.freeiconspng.com/thumbs/profile-icon-png/profile-icon-9.png">
			<h3>${w.getNome()}</h3>
			<h3>${w.getCognome()}</h3>
			<h4>${w.getEta()}</h4>
			<h4>${w.getDescrizione()}</h4>
		</div>
	</c:forEach>
</section>
