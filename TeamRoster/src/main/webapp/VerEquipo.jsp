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
<h2>Lista de equipos</h2>
<h3><a href="CrearEquipo.jsp">Nuevo equipo</a></h3>

<table border="1" name="NameTeam">
  <tr>
    <th>Team</th>
    <th>Players</th>
    <th>Action</th>
  </tr>

  <tr>
    <td> <%=NameTeam %> </td>
    <td></td>
     <td><a href="ListaJugadires.jsp">Details</a> <button>Delete</button>></td>
  </tr>

  <br></br>
</table>
</center>
</body>
</html>