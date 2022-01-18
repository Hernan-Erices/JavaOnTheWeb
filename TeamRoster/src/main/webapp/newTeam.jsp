<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New Team</title>
</head>
<body>
<p>Create new team</p>
<form action= "/TeamRoster/NewTeam" method="post">
<p>Team Name: <input type="text" name="team_name"></p>
<button>Create</button>
</form>
</body>
</html>