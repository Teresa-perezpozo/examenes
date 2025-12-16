package examenes;

public class imcrep {
//doget que carga la página
	InputStream file = getServletContext().getResourceAsStream("/imc.html");
	InputStreamReader r1 = new InputStreamReader(file);
	BufferedReader html = new BufferedReader(r1);
	PrintWriter out = response.getWriter();
	String pagina = " ", linea;
	while(linea = html.getLine()!=null)pagina +=linea
	
	response.setTypeContext("text/html");
	out.print(pagina);
	out.close();
	
//dopost que da la solución 
	InputStream file = getServletContext().getResourceAsStream("/imc");
	InputStreamReader r1 = new InputStreamReader(file);
	BufferedReader html = new BufferedReader(r1);
	PrintWriter out = response.getWriter();
	String pagina = " ", linea;
	while(linea = html.getLine()!=null)pagina +=linea

float p = Integer.parseInt(request.getParameter("p"));
float a = Integer.parseInt(request.getParameter("a"));
String impresion = " ";
if(resultado<24.5) impresión = "está sano";
if(resultado >24.5) impresión = "está en sobrepeso";
	pagina = pagina.replace("h2","H2"+IMPRESIÓN);
response.getTypeContext("text/html");
	out.print(pagina);
	out.close();
}
public Map<String,String> leerPacientes(string file){
	Map<String, String> pacientes = new HashMap<>;
	InputStreamReader r1 = new InputStreamReader(file);
	BufferedReader html = new BufferedReader();
	String []ps,linea;
	while(linea = html.nextLines()!=null) {
		pagina+=linea;
	
	String []ps=linea.split(:);
	Paciente p = new Paciente(ps[0],ps[1],ps[2]);
	pacientes.add(p);
	}
}

















	
	
	
	
	
	
	
	
	
	
	
	