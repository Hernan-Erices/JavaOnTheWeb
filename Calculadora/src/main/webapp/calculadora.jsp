<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page session="true"%>  

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>

<title>Calculadora</title>

</head>

<%
	HttpSession sesion=request.getSession();
	String resultado=(String)sesion.getAttribute("resultado");
	
	
%>



<body>
<FORM Id="calculadora" ACTION="Calculadora" METHOD="POST">
<table bgColor="red" align="center">

<tr><th colspan=4><INPUT TYPE="text" NAME="resultado" Id="resultadoA" size="40" VALUE=""></th></tr>

<tr><th><INPUT TYPE="button" NAME="1" VALUE="1"></th>
<th><INPUT TYPE="button" NAME="2" VALUE="2"></th>
<th><INPUT TYPE="button" NAME="3" VALUE="3"></th>
<th><INPUT TYPE="button" NAME="operador" VALUE="+"></th></tr>

<tr><th><INPUT TYPE="button" NAME="4" VALUE="4"></th>
<th><INPUT TYPE="button" NAME="5" VALUE="5"></th>
<th><INPUT TYPE="button" NAME="6" VALUE="6"></th>
<th><INPUT TYPE="button" NAME="operador" VALUE="-"></th></tr>

<tr><th><INPUT TYPE="button" NAME="7" VALUE="7"></th>
<th><INPUT TYPE="button" NAME="8" VALUE="8"></th>
<th><INPUT TYPE="button" NAME="9" VALUE="9"></th>
<th><INPUT TYPE="button" NAME="operador" VALUE="*"></th>

<tr><th><INPUT TYPE="button" NAME="." VALUE="."></th>
<th><INPUT TYPE="button" NAME="0" VALUE="0"></th>
<th><INPUT TYPE="button" NAME="operador" VALUE="=" onClick="resultado"></th>
<th><INPUT TYPE="button" NAME="/" VALUE="/"></th></tr>

<tr><th colspan=4><INPUT TYPE="Reset" NAME="borrar" VALUE="clear"></th></tr>
</table>
</FORM>

<center>

<h2>RESULTADOS</h2>

<h2>

<%=resultado %>

</h2>


</center>


</body>
</html>