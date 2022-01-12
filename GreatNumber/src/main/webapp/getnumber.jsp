<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>

<head>
	<link href="estilo" rel="stylesheet" type="text/css">

    <meta charset="UTF-8" />

    <title>Great Number</title>
    
</head>

<body style="background: #e7e7e7">


<%
  String mensaje=(String)session.getAttribute("mensaje");
 %>


<center>

<h1 style = "font-family:courier,arial,helvética;">Welcome to the Great Number Game!</h1>

<h2 style = "font-family:courier,arial,helvética;">I am thinking of a number berween 1 and 100 <br> Take a guess!</h2>

<form action="GreatNumber" methods="POST">

   <input type="text" name="realNumber" value="">
    
   <input type = "submit" value = "submit" >
   
   <br></br>
   
   <%=mensaje %>

</form>

<br></br>

<form action="getnumber.jsp" method="post">
    <input type = "submit" value = "Obtener nuevo numero">
</form>


</center>

</body>
</html>