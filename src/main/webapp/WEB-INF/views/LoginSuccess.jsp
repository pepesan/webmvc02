<%--
  Created by IntelliJ IDEA.
  User: pepesan
  Date: 10/5/16
  Time: 0:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Welcome</title>
</head>
<body>
<div align="center">
    <h2>Welcome ${userForm.email}! You have logged in successfully.</h2>
    <a href="<c:url value="/"/>">Inicio</a>
</div>
</body>
</html>
