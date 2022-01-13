<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page session="true"%>  

<!DOCTYPE html>
<head>
	<link href="estilo" rel="stylesheet" type="text/css">
    <meta charset="UTF-8" />
    <title>Great Number</title>  
</head>
<body style="background: #e7e7e7">

<%
	HttpSession sesion=request.getSession();
	String message=(String)sesion.getAttribute("message");
%>
 
<center>

<h1 style = "font-family:courier,arial,helvética;">Welcome to the Great Number Game!</h1>
<h2 style = "font-family:courier,arial,helvética;">I am thinking of a number berween 1 and 100 <br> Take a guess!</h2>

<form action="GreatNumber" method="POST">

   <input type="text" name="number">    
   <input type = "submit" value = "submit">  
   <br></br>
 <h1 style="color: red; border: red 5px dotted;"><%= message %></h1>  
	

</form>
<br></br>
<form action="index.jsp" method="POST">
    <input type = "submit" value = "Obtener nuevo numero">
</form>
</center>

</body>
</html>