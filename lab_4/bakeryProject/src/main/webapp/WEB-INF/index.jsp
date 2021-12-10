<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%><%@ taglib prefix="sec" uri=""%>
<!DOCTYPE html>
<html>
<head>
<link href="<spring:url value="css/app.css" />" rel="stylesheet"
	type="text/css">
<title>Spring Security Example - ProgrammingFree</title>
</head>
<body class="security-app">
	
	<div class="lc-block">
		<h1>Welcome!</h1>
		<h3 class="text4">user : ${pageContext.request.userPrincipal.name}</h3>
		<sec:authorize access="isAuthenticated()">
			<h4><a href="/logout">Вийти</a></h4>
		</sec:authorize>
		<div class="alert-normal">
			Click <a href="<spring:url value='/hello' />">here</a> to see a
			greeting.
		</div>
	</div>
</body>
</html>