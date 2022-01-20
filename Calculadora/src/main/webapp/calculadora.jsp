<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page session="true"%>  

<!DOCTYPE HTML>
<html>
<head>

<title>Calculadora</title>

</head>

<%
	HttpSession sesion=request.getSession();
	String resultado=(String)sesion.getAttribute("resultado");	
%>



<body>
<form action="Calculadora" METHOD="post">
<table bgColor="red" align="center">
<tr><th colspan=4><input type="text" name="resultado" size="40" value=""></th></tr>


<tr><th><input type="button" name="1" value="1"></th>
<th><input type="button" name="2" value="2"></th>
<th><input type="button" name="3" value="3"></th>
<th><input type="button" name="operador" value="+"></th></tr>

<tr><th>
<input type="button" name="4" value="4" onclick="resultado"></th>
<th>
<input type="button" name="5" value="5"></th>
<th>
<input type="button" name="6" value="6"></th>
<th>
<input type="button" name="operador" value="-">
</th></tr>

<tr><th>
<input type="button" name="7" value="7"></th>
<th>
<input type="button" name="8" value="8"></th>
<th>
<input type="button" name="9" value="9"></th>
<th>
<input type="button" name="operador" VALUE="*">
</th>

<tr><th>
<input type="button" name="." value="."></th>
<th>
<input type="button" name="0" value="0"></th>
<th>
<input type="button" name="operador" value="=" onClick="resultado"></th>
<th>
<input type="button" name="/" value="/">
</th></tr>

<tr><th colspan=4>
<input type="Reset" name="borrar" value="limpiar">
</th></tr>
</table>
</form>

<center>

<h2>RESULTADOS</h2>

<h2>

<%=resultado %>

</h2>


</center>


</body>
</html>