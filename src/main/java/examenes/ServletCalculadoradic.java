package examenes;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/calculadoradic ")

public class ServletCalculadoradic extends HttpServlet{
	protected void doPost (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 Integer n1 = Integer.parseInt(request.getParameter("n1"));
		 Integer n2 = Integer.parseInt(request.getParameter("n2"));
		 String operacion = request.getParameter("operacion");
		 int resultado = 0;
		 if (operacion.equals("suma")) resultado = n1+n2;
		 else if(operacion.equals("resta")) resultado = n1-n2;
		 System.out.println("El resultado es "+resultado);
}
}
