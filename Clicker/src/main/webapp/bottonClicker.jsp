<!DOCTYPE html>
<html>

<head>

<title>Boton Clicker</title>

</head>
<body>

<form action="ClickerServlet" method="get">

	<button type="submit" name="submit" value="${numero}"> Clickeame </button>

	
</form>

<br></br>

<h2> Has clickeado <c:out value="${numero}"/> veces</h2>

</body>
</html>