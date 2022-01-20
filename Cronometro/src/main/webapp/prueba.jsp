<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import = "java.util.*" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%

Calendar Actual = Calendar.getInstance();
Actual.get(Calendar.SECOND);
%>
<form>

<input type="datetime" value="<%out.println(Actual.get(Calendar.HOUR_OF_DAY)+":"+Actual.get(Calendar.MINUTE)+":"+Actual.get(Calendar.SECOND));%>">

</form>



</body>
</html>