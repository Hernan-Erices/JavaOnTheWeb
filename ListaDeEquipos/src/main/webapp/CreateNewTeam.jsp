<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create a new team</title>
</head>
<body>

<% HttpSession sesion=request.getSession(); %>

<center>

<h1>Create a new team</h1>

<form action="index.jsp" method="">

Team Name: <input type="text" value="" name="newTeam">
<br>
<input type="submit" value="Create" name="createNewTable">
<br>

</form>



</center>

</body>
</html>