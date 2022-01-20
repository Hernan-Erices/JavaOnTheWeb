<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="com.modelsRoster.Team" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<a href="/TeamRoster/newTeam.jsp">New Team</a>
<table>
<tr><th>Team</th><th>Players</th><th>Action</th></tr>
<%for(int i = 0; i < Team.getTeams().size();i++){ %>
<tr>

<td><%= Team.getTeams().get(i).getTeam_name() %>

</td><td>

<%= Team.getTeams().get(i).getPlayers().size() %>

</td><td>
<a href="/TeamRoster/teams?id=<%=i%>">Details</a>
</td>
</tr>
<%} %>
</table>
</body>
</html>