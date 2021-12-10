<%@ taglib prefix="sec" uri="http://www.springframework.org/tags" %>
<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 09.12.2021
  Time: 11:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Admin</title>
</head>

<body>
<h3 class="text4">admin : ${pageContext.request.userPrincipal.name}</h3>
    <sec:authorize access="isAuthenticated()">
    <h4><a href="/logout">Вийти</a></h4>
    </sec:authorize>

</body>
</html>
