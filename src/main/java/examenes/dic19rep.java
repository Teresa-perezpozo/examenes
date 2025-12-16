package examenes;

import java.io.PrintWriter;

import jakarta.servlet.http.HttpSession;

public class dic19rep {
public void doGet(requestHttp request responseHttp response) throws IOException {
	HttpeSssion sesion = getSession();
	InputStream file = getServletContext().getResourceAsStream("/contador.html");
	InputStreamReader r1 = new InputStreamReader(file);
	BufferedReader html = new BufferedReader(r1);
	PrintWriter out = response.getWrtiter();
	String pagina = " ", linea;
	String resultado = " ";
	HttpSession sesion = request.getSesion();
	while(linea = html.readLine()!=null) pagina +=linea;
	int n = sesion.getAttribute("contador");
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
	sesion.setAtribute("contador",0);
	out.setTypeContext("text/html");
	out.println(pagina);
	out.close();
	
}
}
