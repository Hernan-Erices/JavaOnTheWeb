package controllers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import models.Timer;

@WebServlet("/Stopwatch")
public class Stopwatch extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession sesion = request.getSession();
		
		String parametro = request.getParameter("action");
		
		if(parametro != null) {
			if(parametro.equals("reiniciar")) {
				request.getSession().invalidate();
			}
		}
		
		Date tiempoActual = new Date();
		
		sesion.setAttribute("tiempoActual", tiempoActual);
		System.out.println(sesion.getAttribute("horaInicio"));
		
		
		if(sesion.getAttribute("times")!= null) {
			
			sesion.setAttribute("times", new ArrayList<Timer>());
		}
		
		
		if(parametro != null) {
			
			if(parametro.equals("iniciar")) {
				if(sesion.getAttribute("horaInicio")==null) {
					
					Date iniciar = new Date();
					sesion.setAttribute("horaInicio", iniciar);
			}	
		}
			
			if(parametro.equals("detener")) {
				if(sesion.getAttribute("horaInicio")!=null) {
					
					Timer newTime = new Timer();
					
					sesion.setAttribute("horaInicio", null);
					
					ArrayList<Timer> times = (ArrayList<Timer>) sesion.getAttribute("times");
					times.add(newTime);
					sesion.setAttribute("times", times);
				}
			}
		}
		
		if(sesion.getAttribute("HoraInicio")!=null) {
			long difference = tiempoActual.getTime() - ((Date)sesion.getAttribute("HoraInicio")).getTime();
			sesion.setAttribute("difference", difference);
		}
		request.getRequestDispatcher("Stopwatch.jsp").forward(request, response);
	}

}
