<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%

HttpSession sesion = request.getSession();
String NameTeam=(String)sesion.getAttribute("NameTeam");

%>

<center>

<h1>Crear nueve equipo</h1>

<form action="Rosters" method="POST">

Name Team: <input type="text" value="" name="NameTeam">
<br>
<input type="submit" value="Crear" name="createNewTeam">
<br>

</form>



</center>


</body>
</html>