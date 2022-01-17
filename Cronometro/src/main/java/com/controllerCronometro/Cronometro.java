package com.controllerCronometro;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.modelCronometro.Timer;

/**
 * Servlet implementation class Cronometro
 */
@WebServlet("/Cronometro")
public class Cronometro extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Cronometro() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {			
		}
	    
	 
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	    HttpSession sesion = request.getSession();

		
		int minutos=0;
		int segundos=0;
		System.out.println("holaa");
		
		for(minutos=0;minutos<60;minutos++) {
				
			for(segundos=0;segundos<60;segundos++) {
					
				System.out.println(minutos+":"+segundos);
	
				try {
					Thread.sleep(1000);
				}catch(InterruptedException e) {}
				
				sesion.setAttribute("cronometro", minutos+":"+segundos);
				sesion.getAttribute("cronometro");
			}
			
			sesion.setAttribute("cronometro", minutos+":"+segundos);
			sesion.getAttribute("cronometro");
			
			

	    
//	    Timer timer = new Timer();
//	    sesion.setAttribute("cronometro", timer.cronometro());
//	    
//	    System.out.println("hello");
	    
	    RequestDispatcher view = request.getRequestDispatcher("index.jsp");
		view.forward(request, response);
		
		
		
		
	}

}
}
