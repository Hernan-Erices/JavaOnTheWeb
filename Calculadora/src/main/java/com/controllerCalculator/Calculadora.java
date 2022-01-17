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
		
		float resultado = Float.parseFloat(request.getParameter("resultado"));

		String pos = (String) request.getParameter("resultado");
		String operador = (String) request.getParameter("operador");
		HttpSession sesion = request.getSession(true);

		float num1=0;
		float num2=0;

		if (pos==""){
		float numero = Float.parseFloat(request.getParameter("resultado"));
		sesion.setAttribute("numero", sesion.getAttribute(operador));
		resultado= num1;
		}
		else {
		float numero = Float.parseFloat(request.getParameter("resultado"));
		sesion.setAttribute("numero", new Float(numero));
		resultado= num2;
		}

		if (operador == "+"){
		resultado = num1 + num2;
		sesion.setAttribute("resultado", resultado);
		}
		else if (operador == "-"){
		resultado = num1 - num2;
		sesion.setAttribute("resultado", resultado);
		}
		else if (operador == "*"){
		resultado = num1 * num2;
		sesion.setAttribute("resultado", resultado);
		}
		else if (operador == "/"){
		resultado = num1 / num2;
		sesion.setAttribute("resultado", resultado);
		}
		else if (operador == "="){
		resultado = num1;
		pos="";
		};

		RequestDispatcher view = request.getRequestDispatcher("calculadora.jsp");
		view.forward(request, response);
		}
		
		
		
	}
