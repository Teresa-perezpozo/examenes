package examenes;

import java.net.ResponseCache;

@WebServlet("/calculadora")
public class calculadoraRep {
//doPost
	InputStream file = getServletContext().getResourceAsStream("calculadora.html");
	InputStreamReader r1 = new InputStreamReader(file);
	BufferReader html = new BufferReader(r1);
	PrintWriter out = Response.getWriter();
	String pagina = " ",linea;
	while((linea = html.nextLine)!=null) pagina +=linea;
	int num1 = Integer.parseInt.request.getParameter("num1");
	int num2 = Integer.parseInt.request.getParameter("num2");
	int resultado = 0;
	String op = (String) request.getParameter("op");
	if (op.equals("suma")) resultado= num1+num2;
	else resultado = num1-num2;
	pagina = pagina.replace("<h2></h2>","<h2> el resultado es "+resultado+"</h2>");
	response.setContextType("text/html");
	out.print(pagina);
	out.close();


}
