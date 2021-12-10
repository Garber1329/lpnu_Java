<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Додати замовлення </title>
    <head

    </head>
<body>
<jsp:include page="res/header.jsp"></jsp:include>
<h3 class="text4">coach : ${pageContext.request.userPrincipal.name}
    <sec:authorize access="isAuthenticated()">
    <h4><a href="/logout">Вийти</a></h4>
    </sec:authorize>
    <div class="container">
        <div class="card card-container">

            <form  action="${pageContext.request.contextPath}/addOrder" >
                <h2>Додати тренуванння </h2>
                <div>
                    <input  class="form-control"  name="title" type="text" placeholder="Title"
                            autofocus="true"/>
                    <form:errors path="OrderError"></form:errors>
                    ${OrderError}

                    <button type="submit">Додавати замовлення</button>

                </div>
            </form>
        </div>
    </div>

</body>
</body>
</html>