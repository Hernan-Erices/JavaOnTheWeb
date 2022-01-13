package com.controllerGreatNumber;

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
		int numS = (int) session.getAttribute("number");
		
		String number = request.getParameter("number");
		int num = Integer.parseInt(number);
		
		Random random = new Random();
		int ran = random.nextInt(100-1)+1;
		
		String texto;
		
		if(numS == 0) {
			session.setAttribute("number", ran);
		}
		if(num == numS) {
			session.setAttribute("number", ran);
			texto = "Nice";
			request.setAttribute("texto", texto);
		}
		if(num < numS) {
			texto = "Too low";
			request.setAttribute("texto", texto);
		}
		if (num > numS) {
			texto = "Too high";
			request.setAttribute("texto", texto);	
		}
		
		
		RequestDispatcher view = request.getRequestDispatcher("index.jsp");
		
		view.forward(request, response);
		
		response.sendRedirect("/index");
		
		
	}

}
