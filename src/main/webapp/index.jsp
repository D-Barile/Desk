<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<%
			if(session.getAttribute("user") == null){
		%>
				<title>Desk - Login Page</title>
		<%
			} else{
		%>
				<title>Desk - Home Page</title>
		<%
			}
		%>
		<link href="${pageContext.request.contextPath}/resources/css/login.css" rel="stylesheet" />
		<link href="${pageContext.request.contextPath}/resources/css/header.css" rel="stylesheet" />
		<link href="${pageContext.request.contextPath}/resources/css/home.css" rel="stylesheet" />
	</head>
	<body>
		<%
			if(session.getAttribute("user") == null){
		%>
				<jsp:include page="login.jsp"></jsp:include>
		<%
			}else{
				response.sendRedirect("http://localhost:8080/Desk/home");
		%>
				<jsp:include page="home.jsp"></jsp:include>
				<jsp:include page="common/header.jsp"></jsp:include>
		<%
			}
		%>
		<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/script.js"></script>
	</body>
</html>