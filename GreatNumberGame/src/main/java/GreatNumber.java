

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
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
	    HttpSession session = request.getSession();
	    
	    int numS=Integer.parseInt(request.getParameter("number"));
	    
	    String number = request.getParameter("numberoElegido");
		int num = Integer.parseInt(number);
	
	    int random = (int) (1 + Math.random() * 100);
	    
	    if(num>numS) {
	    	session.setAttribute("number", random);
	    	session.setAttribute("mensaje", "Too low");
	    	response.sendRedirect("index.jsp");
	    }
	    else if(num<numS){
	    	session.setAttribute("number", random);
	    	session.setAttribute("mensaje", "Too High");
	    	response.sendRedirect("index.jsp");
	    }else if(num == numS){
	    	session.setAttribute("number", random);
	    	session.setAttribute("mensaje", "You did");
	    	response.sendRedirect("index.jsp");
	    }
	    else {
	    	response.sendRedirect("index.jsp");
		}
	    
	    RequestDispatcher view = request.getRequestDispatcher("index.jsp");
		view.forward(request, response);
	    
	    response.sendRedirect("/index");
	}

}
