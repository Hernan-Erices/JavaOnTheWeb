package com.packageClicker;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ClickerServlet
 */
@WebServlet("/ClickerServlet")
public class ClickerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ClickerServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @return 
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		HttpSession session = request.getSession();
		
		int numero = Integer.parseInt(request.getParameter("submit"));
		
		numero++;
		
		session.setAttribute("numero", numero);
		
		RequestDispatcher view = request.getRequestDispatcher("/bottonClicker.jsp");
		view.forward(request, response);
		
        //int contadorClick = 0;
        //contadorClick++;
        
        //session.setAttribute("numero", contadorClick); 
        //request.setAttribute("numero",session.getAttribute("numero"));
        //contadorClick = (int) session.getAttribute("contadorClick");
        //RequestDispatcher view = request.getRequestDispatcher("/bottonClicker.jsp");
        //view.forward(request, response);
		
		
		
		
		
		
	}
}
