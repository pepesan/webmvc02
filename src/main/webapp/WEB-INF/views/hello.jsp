<%--
  Created by IntelliJ IDEA.
  User: pepesan
  Date: 8/5/16
  Time: 11:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Página</title>
</head>
<body>
<h1>Página de ejemplo de HelloController</h1>
<h2>${model}</h2>
<h2>${model.nombre}</h2>
<h2>${model.profesion}</h2>
<a href="/student">Enlace al formulario</a>
<a href="<c:url value="/miruta/25"/>">Una ruta</a>
<a href="<c:url value="/inicio.do"/>">inicio de flujo</a>
</body>
</html>
