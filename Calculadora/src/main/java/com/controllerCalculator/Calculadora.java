package com.controllerCalculator;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Calculadora")
public class Calculadora extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Calculadora() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException { }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Float resultado = Float.parseFloat(request.getParameter("resultado"));

		String result = (String) request.getParameter("resultado");
		String operador = (String) request.getParameter("operador");
		
		HttpSession sesion = request.getSession(true);

		float num1=0;
		float num2=0;

		if (result==""){
		float numero = Float.parseFloat(request.getParameter("resultado"));
		sesion.setAttribute("numero", sesion.getAttribute(operador));
		resultado = num1;
		}
		
		else {
			
		float numero = Float.parseFloat(request.getParameter("resultado"));
		sesion.setAttribute("numero",numero);
		resultado = num2;
		
		}

		if ("+".equals(operador)){
		resultado = num1 + num2;
		sesion.setAttribute("resultado", resultado);
		}
		else if ("-".equals(operador)){
		resultado = num1 - num2;
		sesion.setAttribute("resultado", resultado);
		}
		else if ("*".equals(operador)){
		resultado = num1 * num2;
		sesion.setAttribute("resultado", resultado);
		}
		else if ("/".equals(operador)){
		resultado = num1 / num2;
		sesion.setAttribute("resultado", resultado);
		}
		else if ("=".equals(operador)){
		resultado = num1;
		result="";
		};

		RequestDispatcher view = request.getRequestDispatcher("calculadora.jsp");
		view.forward(request, response);
		}
		
		
		
	}
