<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Prototype rosters</title>
</head>
<body>


<%

HttpSession sesion=request.getSession();

String NamePlayer = request.getParameter("NamePlayer");
String lNamePlayer = request.getParameter("lNamePlayer");
int AgePLayer=Integer.parseInt(request.getParameter("AgePLayer"));

%>

<center>

<h1>Prototype rosters</h1>

<h3><a href="CreateNewPlayer.jsp">New player</a></h3>

<table border="1">
  <tr>

    <th>First Name</th>
    <th>Last Name</th>
    <th>Age</th>
    <td>Actions</td>

  </tr>

  <tr>

    <th> <%=NamePlayer %> </th>
    <th> <%=lNamePlayer %> </th>
    <th> <%=AgePLayer %> </th>
    <td><a href="">Delete</a></td>

  </tr>
  
  <br></br>
</table>



</center>

</body>
</html>