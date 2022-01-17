<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Prototype rosters</title>
</head>
<body>
<center>
<h1>Prototype rosters</h1>
<h3><a href="CreateNewTeam.jsp">New Team</a></h3>


<%

HttpSession sesion=request.getSession();
String TeamName = request.getParameter("newTeam");






%>


<table border="1" name="TeamsCreated">
  <tr>
    <th>Team</th>
    <th>Players</th>
    <th>Action</th>
  </tr>

  <tr>
    <td> <%=TeamName %> </td>
    <td>  </td>
     <td><a href="Teams.jsp">Details</a> <button>Delete</button>></td>
  </tr>

  <br></br>
</table>


<%   



%>

</center>
</body>
</html>