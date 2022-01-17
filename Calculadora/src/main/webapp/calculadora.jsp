<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>


<title>Calculadora.</title>

<script type="text/javascript">
function muestrapantalla(){
var resultado = document.getElementById("resultado");

resultado.value = resultado.value + window.event.srcElement.value;
}
</script>
</head>
<body>


<FORM Id="calculadora" ACTION="Calculadora" METHOD="POST">
<table bgColor="#c0c0c0" border="2" align="center" cellpadding="2" cellspacing="2">

<tr><th colspan=4><INPUT TYPE="text" NAME="resultado" Id="resultado" size="20" VALUE="" maxlength="10"></th></tr>

<tr><th><INPUT TYPE="button" NAME="1" VALUE="1" onClick="muestrapantalla()"></th>
<th><INPUT TYPE="button" NAME="2" VALUE="2" onClick="muestrapantalla()"></th>
<th><INPUT TYPE="button" NAME="3" VALUE="3" onClick="muestrapantalla()"></th>
<th><INPUT TYPE="button" NAME="operador" VALUE="+" onClick='document.getElementById("calculadora").submit()'></th></tr>


<th><INPUT TYPE="button" NAME="operador" VALUE="-" onClick='document.getElementById("calculadora").submit()'></th></tr>

<th><INPUT TYPE="button" NAME="operador" VALUE="*" onClick='document.getElementById("calculadora").submit()'></th>

<th><INPUT TYPE="button" NAME="operador" VALUE="=" onClick='document.getElementById("calculadora").submit()'></th>
<th><INPUT TYPE="button" NAME="/" VALUE="/" onClick='document.getElementById("calculadora").submit()'></th></tr>

<tr><th colspan=4><INPUT TYPE="Reset" NAME="borrar" VALUE="limpiar"></th></tr>
</table>
</FORM>

<center>

<h2>resultados</h2>
<br>
<%



%>


</center>











</body>
</html>