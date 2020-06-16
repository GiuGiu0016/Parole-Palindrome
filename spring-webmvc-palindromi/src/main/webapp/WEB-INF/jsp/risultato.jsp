<%@page import="java.util.List"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@page import="org.springframework.web.servlet.ModelAndView"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>risultato</title>
</head>
<body>
<div style="text-align: center;margin-top: 10%;">
<form action="index.jsp">
<h1>Il testo inserito contiene: ${nTermini} termini.</h1>
<h2>Pero: ${npalindromi} termini sono palindromi.</h2>
<h2> Ecco l'elenco: ${palindromi} </h2>


<input type="submit" value="torna alla pagina iniziale">
</form>
</div>
</body>
</html>