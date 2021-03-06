package com.packageControllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.packageModels.Person;

/**
 * Servlet implementation class ShowPerson
 */
@WebServlet("/ShowPerson")
public class ShowPerson extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShowPerson() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // Procesar la solicitud

        String name = request.getParameter("name");

        int age = Integer.parseInt(request.getParameter("age"));

        // Crear el modelo

        Person person = new Person(name, age);

        // Establecer el modelo para la vista

        request.setAttribute("person", person);

        // Permita que la vista maneje la solicitud

        RequestDispatcher view = request.getRequestDispatcher("/showPerson.jsp");

        view.forward(request, response);
    }
}
