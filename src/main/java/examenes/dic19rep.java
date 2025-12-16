package examenes;

import java.io.PrintWriter;

import jakarta.servlet.http.HttpSession;
@WebServlet("/contador")
public class dic19rep {
public void doGet(requestHttp request responseHttp response) throws IOException {
	InputStream file = getServletContext().getResourceAsStream("/contador.html");
	InputStreamReader r1 = new InputStreamReader(file);
	BufferedReader html = new BufferedReader(r1);
	PrintWriter out = response.getWrtiter();
	String pagina = " ", linea;
	String resultado = " ";
	HttpSession sesion = request.getSesion();
	while(linea = html.readLine()!=null) pagina +=linea;
	int n = (Integer)sesion.getAttribute("contador");
	if(n != null) {
		sesion.setAtribute("contador",n++);
		resultado = n;
	}
	pagina = pagina.replace("<H2>X<H2>","<H2>"+n+"X<H2>\");
	out.print(pagina);
	out.close();
}
public void doPost() {
	InputStream file = getServletContext().getResourceAsStream();
	InputStreamReader r1 = new InputStreamReader(file);
	BufferedReader html = new BufferedReader();
	PrintWriter out = response.getWriter();
	HttpSession sesion = request.getSesion();
	//todo lo de pagina aqui también
	sesion.setAtribute("contador",0);
	pagina = pagina.replace
	out.setTypeContext("text/html");
	out.println(pagina);
	out.close();
	
}
}
