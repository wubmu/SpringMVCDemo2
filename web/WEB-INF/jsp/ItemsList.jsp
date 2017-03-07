<%--
  Created by IntelliJ IDEA.
  User: wu
  Date: 17-3-3
  Time: 下午6:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/queryItems.action" method="post">
<table>
    <c:forEach items="${itmeslist}" var="item">
    <tr>
        <td>${item.name}</td>
    </tr>
    </c:forEach>
</table>
</form>
</body>
</html>
