<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>

<head>

    <meta charset="UTF-8" />

    <title>Great Number</title>
    
</head>

<body>

<center>


<form action="GreatNumber" method="post">

<input type="text" name="number" value="">

<input type = "submit" value = "submit" >

    <p>
        <c:out value="${texto}"/>
    </p>


</form>


</center>

</body>
</html>