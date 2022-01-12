<%@ page language="java" import="java.util.*" pageEncoding="utf-8" 
contentType="text/html;Charset=utf-8"%>
<html>
 <head>
 </head> 
 <body>
 [% session. SetAttribute ("message", "please guess");
 // HttpSession session =request.getSession(true);
 Int randomnumber = (int) (math. Random() * 100) + 1; // get a random number
 session.setAttribute("saveNumber",new Integer(randomNumber));
  %>
  <p>Visit or refresh this page to randomly drop a number between 1 and 100
  <br>Click the link below to go to guess the number
  < a href = "inputnumber. JSP" rel = "external nofollow" > guess the number</a>
 </body>
</html>