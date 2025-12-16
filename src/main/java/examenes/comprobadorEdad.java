package examenes;

import java.io.PrintWriter;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("index/html")
public class comprobadorEdad extends HttpServlet{
//doGet
String param = request.getParameter("edad");
int edad = Integer.parseInt(param);
response.setContentType("text/html");
PrintWriter out = response.getWriter();
if(edad<18) out.print("<html><body>menor</body></html>")
else out.print("<html><body>mayor</body></html>")
out.close();
}
//EXÁMEN 17-18
protected void doPost _(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String dni = request.getParameter("dni");
	
	PrintWriter out = resoponse.getWriter();
	response.setContentType("text/html");

	if(sesion.findByDni("dni") == null) out.print("<html><body>No está registrado");
	else out.print("el paciente ya se encuentra registrado");
	out.close();


}