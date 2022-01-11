package com.packageControllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.packageModels.cat;

/**
 * Servlet implementation class catController
 */
@WebServlet("/catController")
public class catController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public catController() {
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
		
		cat makecat = new cat(name, breed, weight);
		request.setAttribute("cat", makecat);
		
		PrintWriter salida=response.getWriter();
		salida.println(request.getParameter("name"));
		salida.println("<br><br>");
		salida.println(request.getParameter("breed"));
		salida.println("<br><br>");
		salida.println(request.getParameter("weight"));
		
		RequestDispatcher view = request.getRequestDispatcher("/cat.jsp");
		view.forward(request, response);
		
		
	}

}
