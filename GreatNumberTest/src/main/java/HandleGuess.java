import java.io.IOException;
import java.io.PrintWriter;
 
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;
 
public class HandleGuess extends HttpServlet { 
 public void doPost(HttpServletRequest request,HttpServletResponse response)
  throws ServletException,IOException{
 request.setCharacterEncoding("utf-8");
 response.setContentType("text/html;charset=utf-8");
 PrintWriter out=response.getWriter(); 
 //Get the number of customer guesses submitted
 int guessNumber=Integer.parseInt(request.getParameter("guessnumber"));
 //Get the client's session object
 HttpSession session=request.getSession();
 Integer integer=(Integer)session.getAttribute("saveNumber");
 int realNumber=integer.intValue();
 System.out.println(realNumber);
 System.out.println(guessNumber);
 if(guessNumber>realNumber){
  Session.SetAttribute ("message", "guess big");
  System.out.print ("you guessed big -- no");
  response.sendRedirect("inputNumber.jsp");
 }
 else if(guessNumber<realNumber){
  Session.SetAttribute ("message", "guess small");
  System.out.print ("you guessed it small -- - no");
  response.sendRedirect("inputNumber.jsp");
 }
 else{
  Session.SetAttribute("message", "you guessed it right");
  System.out.print ("you guessed it right");
  response.sendRedirect("inputNumber.jsp");
 }
 }
 public void doGet(HttpServletRequest request,HttpServletResponse response)
   throws ServletException,IOException{
 doPost(request,response);
 }
 
}
