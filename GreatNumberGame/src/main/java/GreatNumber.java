

import java.io.IOException;
import java.util.Random;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class GreatNumber
 */
@WebServlet("/GreatNumber")
public class GreatNumber extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GreatNumber() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    HttpSession sesion = request.getSession();
	    int numeroIngresado=Integer.parseInt(request.getParameter("number"));
	    int numeroAleatorio = (int) (1 + Math.random() * 100);
	    
	    if(numeroIngresado>numeroAleatorio) {
	    	sesion.setAttribute("number", numeroAleatorio);
	    	sesion.setAttribute("message", "Too High");}
	    else if(numeroIngresado<numeroAleatorio){
	    	sesion.setAttribute("number", numeroAleatorio);
	    	sesion.setAttribute("message", "Too Low");
	    }else if(numeroIngresado == numeroAleatorio){
	    	sesion.setAttribute("number", numeroAleatorio);
	    	sesion.setAttribute("message", "You did");
	    }
	    RequestDispatcher view = request.getRequestDispatcher("index.jsp");
		view.forward(request, response);
	}

}
