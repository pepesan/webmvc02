<%--
  Created by IntelliJ IDEA.
  User: pepesan
  Date: 8/5/16
  Time: 22:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
    <title>Spring MVC Form Handling</title>
</head>
<body>

<h2>Submitted Student Information</h2>
<table>
    <tr>
        <td>Name</td>
        <td><c:out value="${model.name}" /></td>
    </tr>
    <tr>
        <td>Age</td>
        <td><c:out value="${model.age}" /></td>
    </tr>
    <tr>
        <td>ID</td>
        <td><c:out value="${model.id}" /></td>
    </tr>
</table>
</body>
</html>
