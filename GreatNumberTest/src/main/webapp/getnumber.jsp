<%@ page language="java" import="java.util.*" 
contentType="text/html;charset=utf-8"%>
<html>
 <head> 
 </head> 
 <body>
 <%
  String message=(String)session.getAttribute("message");
  %>
  <form action="HandleGuess" methods="post">
   <input type="text" name="guessnumber" size=8>
   <%=message %>
   < input type = "submit" value = "submit" >
   </form>
   <form action="getNumber.jsp" method="post">
    < input type = "submit" value = "get new random number again" >
   </form>
 </body>
</html>