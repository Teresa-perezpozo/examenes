package examenes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
	
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet ("/imc.html")

public class imc extends HttpServlet{
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	InputStream file = getServletContext().getResourceAsStream("/imc.html");
	InputStreamReader r1 = new InputStreamReader(file);
	BufferedReader html = new BufferedReader(r1);
	PrintWriter out = response.getWriter();
	String pagina= "",linea;
	while((linea=html.readLine())!=null) {
		pagina +=linea;
	}
	response.setContentType("text/html");
	out.println(pagina);
	}
	protected void doPost (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	InputStream file = getServletContext().getResourceAsStream("/imc.html");
	InputStreamReader r1 = new InputStreamReader(file);
	BufferedReader html = new BufferedReader(r1);
	PrintWriter out = response.getWriter();
	String pagina= "",linea;
	while((linea=html.readLine())!=null) {
		pagina += linea;
	}
	
	Float altura = Float.parseFloat(request.getParameter("altura"));
	Float peso = Float.parseFloat(request.getParameter("peso"));
	float imc = peso/(altura*altura);
	String resultado ="normal";
	if(imc<=18.5F) resultado = "infrapeso";
	if((imc>18.5)&&(imc<24.5)) resultado = "sana";
	if(imc>30.0F) resultado = "obesidad";
	if(imc>24.5) resultado = "sobrepeso";
	pagina = pagina.replace("<h2></h2>",resultado );
	
	
	
	
	
	
}
}
