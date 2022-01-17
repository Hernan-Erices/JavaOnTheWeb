<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Agregar jugador al equipo</title>
</head>
<body>

<form action="Rosters" method="POST">

	<h2>Make a dog</h2>
	First Name:<input type="text" name="first_name">
	<br><br>
	Last Nmae:<input type="text" name="last_name">
	<br><br>
	Age:<input type="text" name="age">
	<br><br>
	<input type="submit" value="Submit">
	<br><br>
	<br><br>

</form>

</body>
</html>