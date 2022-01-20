package controllerStopwatch;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class cronometro
 */
@WebServlet("/cronometro")
public class cronometro extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public cronometro() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int minutos = 0;
		int segundos = 0;
		
		for(minutos=0;minutos<60;minutos++) {
			for(segundos=0;segundos<60;segundos++) {
				System.out.println(minutos+":"+segundos);
				delaySegundo();
				
			}
		}
	}

	private static void delaySegundo() {
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e) {}
	}

}
