<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>   
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cronometro</title>
</head>
<body>

<%
	HttpSession sesion=request.getSession();
	String cronometro=(String)sesion.getAttribute("cronometro");
	
%>

<%=cronometro   %>





</h2>


</body>
</html>