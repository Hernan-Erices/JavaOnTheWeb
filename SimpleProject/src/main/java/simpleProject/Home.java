package simpleProject;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Home
 */
@WebServlet("/Home")
public class Home extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Home() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		PrintWriter salida=response.getWriter();
		
		salida.println("<html><body>");
		
		salida.println("Nombre: " + request.getParameter("nombre")); 
		
		salida.println("<br><br>");
		
		salida.println("Apellido: " + request.getParameter("apellido")); 
		
		salida.println("<br><br>");
		
		salida.println("Lenguaje favorito: " + request.getParameter("lenguaje"));
		
		salida.println("<br><br>");
		
		salida.println("Ciudad: " + request.getParameter("ciudad")); 
		
		salida.println("<br><br>");
		
		salida.println("</body></html>");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
