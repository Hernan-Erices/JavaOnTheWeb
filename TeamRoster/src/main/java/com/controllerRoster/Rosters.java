package com.controllerRoster;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.modelsRoster.Player;

@WebServlet("/Rosters")
public class Rosters extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Rosters() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//CREACION DE LA SESION
		HttpSession sesion = request.getSession();
		

		
		//CREAR EQUIPO
		String NameTeam = request.getParameter("NameTeam");
		sesion.setAttribute("NameTeam", NameTeam);
		//REDIRECCIONAR
		response.sendRedirect("VerEquipo.jsp");
		
		System.out.println("1");
		
		//LLAMADA A LA CLASE PLAYER
//		String first_name = request.getParameter("first_name");
//		String last_name = request.getParameter("last_name");
//		int age = Integer.parseInt(request.getParameter("age"));	
		
		System.out.println("2");
		
//		Player player = new Player(first_name,last_name,age);
//		request.setAttribute("Player", player);
//		PrintWriter salida=response.getWriter();
//		
//
//		salida.println(request.getParameter("<table>" + "<tr>"+ "<th>First Name</th>"+ "<th>Last Name</th>"+ "<th>Age</th>" + "<td>Actions</td>"+ "</tr>"));
//		
//		salida.println(request.getParameter("<tr>"));
//		salida.println(request.getParameter("<th>"+"first_name"+"</th>"));
//		salida.println("<br><br>");
//		salida.println(request.getParameter("<th>"+"last_name"+"</th>"));
//		salida.println("<br><br>");
//		salida.println(request.getParameter("<th>"+"age"+"</th>"+"</tr>"));
//		
//		salida.println(request.getParameter("</table>"));
//		//REDIRECCIONAR
//		response.sendRedirect("ListaJugadores.jsp");
		
		
		System.out.println("3");
		
		
	}

}
