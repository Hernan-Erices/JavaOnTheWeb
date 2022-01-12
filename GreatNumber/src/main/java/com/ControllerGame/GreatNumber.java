package com.ControllerGame;

import java.io.IOException;

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
	@SuppressWarnings("removal")
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
	    HttpSession session = request.getSession();		
		

	    int randomNumber = (int) (1 + Math.random() * 100);
	    
	    session.setAttribute("randomNumber", randomNumber);
	    request.setAttribute("randomNumber",session.getAttribute("randomNumber"));


	    Integer integer=(int)session.getAttribute("realNumber");
	    int realNumber=integer.intValue();
	    
	    session.setAttribute("realNumber", realNumber);
	    request.setAttribute("realNumber",session.getAttribute("realNumber"));
	    
	    realNumber = Integer.parseInt(request.getParameter("submit"));
	    
	    if(randomNumber>realNumber) {
	    	session.setAttribute("mensaje", "Too low");
	    	response.sendRedirect("inputNumber.jsp");
	    }
	    else if(randomNumber<realNumber){
	    	session.setAttribute("mensaje", "Too Hight");
	    	response.sendRedirect("inputNumber.jsp");
	    }else if(realNumber == randomNumber){
	    	session.setAttribute("mensaje", "You did");
	    	response.sendRedirect("inputNumber.jsp");
	    }
	    else {
	    	response.sendRedirect("inputNumber.jsp");
		}
	    

	    
		RequestDispatcher view = request.getRequestDispatcher("/inputNumber.jsp"); 
		view.forward(request, response);
  
	}

}
