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
	Integer cronometro=(Integer)sesion.getAttribute("cronometro");
%>


<h2>


<%=cronometro   %>

</h2>



</body>
</html>