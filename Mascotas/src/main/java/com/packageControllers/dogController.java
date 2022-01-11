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
import com.packageModels.dog;


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
			
		String breed = request.getParameter("breed");
		int weight = Integer.parseInt(request.getParameter("weight"));
		String name = request.getParameter("name");
				
		dog makedog = new dog(name, breed, weight);
		
		request.setAttribute("dog", makedog);		
		
		PrintWriter salida=response.getWriter();
		salida.println(request.getParameter("name"));
		salida.println(request.getParameter("breed"));
		salida.println(request.getParameter("weight"));
		
		RequestDispatcher view = request.getRequestDispatcher("/dog.jsp");
		 
		 view.forward(request, response);	 
	}
}
