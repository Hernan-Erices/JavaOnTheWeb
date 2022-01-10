package com.packageControllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.packageModels.animal;


/**
 * Servlet implementation class dogController
 */
@WebServlet("/dogController")
public class dogController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public dogController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		
		
		
		PrintWriter salida=response.getWriter();
		salida.println(request.getParameter("name"));
		salida.println(request.getParameter("breed"));
		
		animal dog = new animal();
		request.setAttribute("animal", dog);
		
		 RequestDispatcher view = request.getRequestDispatcher("/dogJps.jsp");
		 
		 view.forward(request, response);
		 
		 
	}
}
