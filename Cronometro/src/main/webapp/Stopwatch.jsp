<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import = "java.text.SimpleDateFormat" %>
    <%@ page import = "java.util.Calendar" %>
    <%@ page import = "java.util.ArrayList" %>
    <%@ page import = "java.util.Date" %>
    <%@ page import = "java.time.format.DateTimeFormatter" %>
    <%@ page import = "java.util.concurrent.TimeUnit" %>
    <%@ page import = "models.Timer" %>
    
 
<!DOCTYPE html>
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Cronometro</title>

</head>

<body>

<h1>Cronometro</h1>


<% HttpSession sesion=request.getSession(); %>

<% ArrayList<Timer> times =(ArrayList<Timer>)sesion.getAttribute("times");%>

<% Calendar Actual = Calendar.getInstance(); %>

<% Actual.setTime((Date)sesion.getAttribute("tiempoActual")); %>


<% if(sesion.getAttribute("horaInicio") != null){ %>
	
	<% Calendar Inicio = Calendar.getInstance(); %>

	<% Inicio.setTime((Date) sesion.getAttribute("horaInicio")); %>
	
	<p>Inicio: <%=Inicio.get(Calendar.HOUR_OF_DAY) %>:<%=Inicio.get(Calendar.MINUTE) %>:<%=Inicio.get(Calendar.SECOND) %></p>
	
	<p>Actual: <%=Actual.get(Calendar.HOUR_OF_DAY) %>:<%=Actual.get(Calendar.MINUTE) %>:<%=Actual.get(Calendar.SECOND) %></p>
	
	<p>Tiempo total: <%=TimeUnit.MILLISECONDS.toSeconds(Timer.getDifference((Date)sesion.getAttribute("tiempoActual"),(Date)sesion.getAttribute("horaInicio"))) %></p>
	
	
<a href="/Cronometro/Stopwatch?action=detener">Detener</a>

<% }else{ %>

<a href="/Cronometro/Stopwatch?action=iniciar">Iniciar</a>

<%}%>

<a href="/Cronometro/Stopwatch?action=reiniciar">Reiniciar</a>

<table>
<tr><th>Iniciar</th><th>Detener</th><th>Total</th></tr>

<% for(Timer time : times){%>

<tr><td>

<%=new SimpleDateFormat("hh:mm:ss a").format(time.getIniciar()) %></td><td><%=new SimpleDateFormat("hh:mm:ss a").format(time.getDetener()) %></td><td> <%=TimeUnit.MILLISECONDS.toSeconds(time.getDifference()) %> seconds

</td></tr>

<%}%>

</table>
</body>
</html>