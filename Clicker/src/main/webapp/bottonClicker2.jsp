<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8" />
<title>Boton Clicker</title>

</head>
<body>

<form action="Clicker" method="post">

<button type="submit" name="submit" value="${numero}"> Click me </button>

</form>


<p>
you have clicked this button <c:out value="${numero}"/>
times
</p>

</body>
</html>