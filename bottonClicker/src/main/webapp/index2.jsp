<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>

<html>

<head>

<meta charset="UTF-8" />

<title>Boton Clicker</title>


</head>

<body  style="background: #e7e7e7">

<center>

<br></br>
<br></br>

<form action="Clicker" method="post">


<button style="
	background-color: #555555; 
 	border: none;
    color: white;
    padding: 15px 32px;
    text-align: center;
    text-decoration: none;
    display: inline-block;
    font-size: 16px;" 
    type="submit" name="submit" value="${num}"> Click me </button>

</form>

<h2 style="color: red;"> Has clickeado  <c:out value="${num}"/> veces el boton </h2>

</body>
</html>