<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: pepesan
  Date: 9/5/16
  Time: 23:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Mi Ruta</title>
</head>
<body>
<h1>${id}</h1>
<a href="/rutaparametro?id=3">Ruta con Parámetro id=3</a>
<a href="<c:url value="/"/>">Inicio</a>
</body>
</html>
