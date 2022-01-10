<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8" />

    <title>Pet</title>
    
</head>
<body>

<div>

<form action="dogController" method="get">
	<h2>Make a dog</h2>
	Name:<input type="text" name="name">
	<br><br>
	Breed:<input type="text" name="breed">
	<br><br>
	Weight:<input type="text" name="weight">
	<br><br>
	<input type="submit" value="Submit">
	<br><br>
	<br><br>

</form>

</div>


<div>

<form action="catController" method="get">
	<h2>Make a cat</h2>
	Name:<input type="text" name="name">
	<br><br>
	Breed:<input type="text" name="breed">
	<br><br>
	Weight:<input type="text" name="weight">
	<br><br>
	<input type="submit" value="Submit">

</form>

</div>


</body>
</html>